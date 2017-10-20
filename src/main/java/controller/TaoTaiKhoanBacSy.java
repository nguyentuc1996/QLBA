//package controller;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.nimbusds.oauth2.sdk.Request;
//
//import entities.BacSy;
//import dao.BacSyDAO;
//import dao.BenhNhanDAO;
//
//@Controller
//@RequestMapping(value = "/user")
//public class TaoTaiKhoanBacSy{
//
//  private BacSyDAO bacSyDAO = new BacSyDAO();
//  @RequestMapping(value="/dangkybs",method=RequestMethod.POST)
//  public void taoTaiKhoanBacSy(HttpServletRequest httpRequest, HttpServletResponse response, ModelMap mm)
//  throws IOException,ParseException{
//    // check if is admin
//    String maBacSy=httpRequest.getParameter("maBacSy");
//    String taiKhoan=httpRequest.getParameter("taiKhoan");
//    String matKhau=httpRequest.getParameter("matKhau");
//    String hoTen=httpRequest.getParameter("hoTen");
//    String ngaySinhStr=httpRequest.getParameter("ngaySinh");
//    String gioiTinh=httpRequest.getParameter("gioiTinh");
//    String quocTich=httpRequest.getParameter("quocTich");
//    String noiOHienTai=httpRequest.getParameter("noiOHienTai");
//    String email=httpRequest.getParameter("email");
//    String soDienThoai=httpRequest.getParameter("soDienThoai");
//    String soCMND=httpRequest.getParameter("soCMND");
//    String queQuan=httpRequest.getParameter("queQuan");
//    String namKinhNghiem=httpRequest.getParameter("namKinhNghiem");
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//    Date ngaySinh = sdf.parse(ngaySinhStr);
//    BacSy bacSy = new BacSy(Integer.parseInt(maBacSy), taiKhoan, matKhau, hoTen, ngaySinh, 
//    		Boolean.parseBoolean(gioiTinh), quocTich, noiOHienTai, email, soDienThoai, soCMND, queQuan, Integer.parseInt(namKinhNghiem));
//    bacSyDAO.themBacSy(bacSy);
//    response.sendRedirect(httpRequest.getContextPath()+"/qlba/bac_sy.html");
//    
//  }
//
//}
