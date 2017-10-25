package controller;
//package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entities.Admin;

//import com.nimbusds.oauth2.sdk.Request;

import entities.BacSi;
import entities.BenhNhan;
import dao.AdminDAO;
import dao.BacSiDAO;
import dao.BenhNhanDAO;

@Controller
@RequestMapping(value = "/admin")
public class AdminController{

  private BacSiDAO bacSiDAO = new BacSiDAO();
  private AdminDAO adminDAO = new AdminDAO();
  private BenhNhanDAO benhNhanDAO = new BenhNhanDAO();
  public Boolean isAdmin(){
	  return true;
  }

  @RequestMapping(value="/dangkybs",method=RequestMethod.POST)
  public void taoTaiKhoanBacSi(HttpServletRequest httpRequest, HttpServletResponse response, ModelMap mm)
  throws IOException,ParseException{
    // check if is admin
    String maBacSi=httpRequest.getParameter("maBacSi");
    String taiKhoan=httpRequest.getParameter("taiKhoan");
    String matKhau=httpRequest.getParameter("matKhau");
    String hoTen=httpRequest.getParameter("hoTen");
    String ngaySinhStr=httpRequest.getParameter("ngaySinh");
    String gioiTinh=httpRequest.getParameter("gioiTinh");
    String quocTich=httpRequest.getParameter("quocTich");
    String noiOHienTai=httpRequest.getParameter("noiOHienTai");
    String email=httpRequest.getParameter("email");
    String soDienThoai=httpRequest.getParameter("soDienThoai");
    String soCMND=httpRequest.getParameter("soCMND");
    String queQuan=httpRequest.getParameter("queQuan");
    String namKinhNghiem=httpRequest.getParameter("namKinhNghiem");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    Date ngaySinh = sdf.parse(ngaySinhStr);
    BacSi bacSi = new BacSi(Integer.parseInt(maBacSi), taiKhoan, matKhau, hoTen, ngaySinh,
    		Integer.parseInt(gioiTinh), quocTich, noiOHienTai, email,
    		soDienThoai, soCMND, queQuan, Integer.parseInt(namKinhNghiem));
    bacSiDAO.themBacSi(bacSi);
    response.sendRedirect(httpRequest.getContextPath()+"/qlba/them_admin.html");
  }

  @RequestMapping(value="/taotk",method=RequestMethod.POST)
  public void taoTaiKhoanAdmin(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
		  throws IOException,ParseException{
        String maAdminStr=request.getParameter("maAdmin");
        String taiKhoan=request.getParameter("taiKhoan");
        String matKhau=request.getParameter("matKhau");
        String hoTen=request.getParameter("hoTen");
        String email=request.getParameter("email");
        String soDienThoai=request.getParameter("soDienThoai");
        Admin admin = new Admin(Integer.parseInt(maAdminStr), taiKhoan, matKhau, hoTen, email, soDienThoai);
        adminDAO.themAdmin(admin);
        response.sendRedirect(request.getContextPath()+"/qlba/them_admin.html");
  }
  @RequestMapping(value="/suatk",method=RequestMethod.POST)
  public void suaTaiKhoanAdmin(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
  throws IOException,ParseException{
    String maAdminStr=request.getParameter("maAdmin");
    String taiKhoan=request.getParameter("taiKhoan");
    String matKhau=request.getParameter("matKhau");
    String hoTen=request.getParameter("hoTen");
    String email=request.getParameter("email");
    String soDienThoai=request.getParameter("soDienThoai");
    Admin admin = new Admin(Integer.parseInt(maAdminStr), taiKhoan, matKhau, hoTen, email, soDienThoai);
    adminDAO.suaAdmin(admin);
    response.sendRedirect(request.getContextPath()+"/qlba/sua_admin.html");
  }
  @RequestMapping(value="/xemttadmin",method=RequestMethod.GET)
  public String xemTaiKhoanAdmin(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
  throws IOException,ParseException{
    String maAdminStr=request.getParameter("maAdmin");
    Admin admin=adminDAO.getAdmin(Integer.parseInt(maAdminStr));
    mm.put("admin",admin);
    return "thongtinadmin";
  }
  
  @RequestMapping(value="/xemdanhsachtk",method=RequestMethod.GET)
  public String xemDanhSachTaiKhoan(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
		  throws IOException,ParseException{
	  List<BenhNhan> danhSachBenhNhan = benhNhanDAO.layDanhSachBenhNhan();
	  List<BacSi> danhSachBacSi = bacSiDAO.layDanhSachBacSi();
	  List<Admin> danhSachAdmin = adminDAO.layDanhSachAdmin();
	  mm.put("dsadmin", danhSachAdmin);
	  mm.put("dsbenhnhan", danhSachBenhNhan);
	  mm.put("dsbacsi", danhSachBacSi);
	  return "danhsachtaikhoan";
  }
  @RequestMapping(value="/xoataikhoan",method=RequestMethod.GET)
  public String xoaTaiKhoan(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
		  throws IOException,ParseException{
	  String maTaiKhoan=request.getParameter("maTaiKhoan");
	  String vaiTro=request.getParameter("vaitro");
	  if(vaiTro.equals("benhNhan")){
		  benhNhanDAO.xoaBenhNhan(Integer.parseInt(maTaiKhoan));
	  }
	  else if(vaiTro.equals("bacSi")){
		  bacSiDAO.xoaBacSi(Integer.parseInt(maTaiKhoan));
	  }else{
		  adminDAO.xoaAdmin(Integer.parseInt(maTaiKhoan));
	  }
	  
	  return "xoaTaiKhoan";
  }

}
