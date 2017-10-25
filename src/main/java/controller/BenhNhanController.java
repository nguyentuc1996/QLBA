package controller;

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

import dao.BenhNhanDAO;
import entities.BenhNhan;

@Controller
@RequestMapping(value = "/benhnhan")
public class BenhNhanController {
  private BenhNhanDAO benhNhanDAO = new BenhNhanDAO();
  @RequestMapping(value="/suathongtin",method=RequestMethod.POST)
  public void suaThongTin(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
		  throws IOException,ParseException{
        String maBenhNhan = request.getParameter("maBenhNhan");
        String taiKhoan = request.getParameter("taiKhoan");
        String matKhau = request.getParameter("matKhau");
        String hoTen = request.getParameter("hoTen");
        String ngaySinhStr = request.getParameter("ngaySinh");
        String gioiTinh = request.getParameter("gioiTinh");
        String quocTich = request.getParameter("quocTich");
        String noiOHienTai = request.getParameter("noiOHienTai");
        String email = request.getParameter("email");
        String soDienThoai = request.getParameter("soDienThoai");
        String soCMND = request.getParameter("soCMND");
        String soTheBHYT = request.getParameter("soTheBHYT");
        String queQuan = request.getParameter("queQuan");
        String ngheNghiep = request.getParameter("ngheNghiep");
//        String vaiTro= request.getParameter("vaiTro");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // surround below line with try catch block as below code throws checked
        // exception
        Date ngaySinh = sdf.parse(ngaySinhStr);
        BenhNhan benhNhan = new BenhNhan(Integer.parseInt(maBenhNhan), taiKhoan, matKhau, hoTen, ngaySinh,
            Integer.parseInt(gioiTinh), quocTich, noiOHienTai, email, soDienThoai, soCMND, soTheBHYT,
            queQuan, ngheNghiep);
        benhNhanDAO.suaBenhNhan(benhNhan);
        response.sendRedirect(request.getContextPath()+"/qlba/sua_tt.html");
  }
  @RequestMapping(value="/laythongtin",method=RequestMethod.GET)
  public String layThongTin(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
		  throws IOException,ParseException{
        // get ma BenhNhan by session
        String maBenhNhan = request.getParameter("maBenhNhan");
        BenhNhan benhNhan = benhNhanDAO.layThongTinBenhNhan(Integer.parseInt(maBenhNhan));
        mm.put("benhNhan", benhNhan);
    		response.sendRedirect(request.getContextPath() + "/qlba/lay_ttbn.html");
        return "thongtinbenhnhan";
  }


}
