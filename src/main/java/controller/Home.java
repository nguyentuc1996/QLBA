package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.AdminDAO;
import dao.BacSiDAO;
import dao.BenhNhanDAO;
import entities.Admin;
import entities.BacSi;
import entities.BenhNhan;

@Controller
@RequestMapping(value = "/home")
public class Home {

	BenhNhanDAO benhNhanDAO = new BenhNhanDAO();
	BacSiDAO bacSiDAO = new BacSiDAO();
	AdminDAO adminDAO = new AdminDAO();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		return "login";
	}

	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
	public String LoginProcess(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
			throws IOException {
		String taiKhoan = request.getParameter("taiKhoan");
		String matKhau = request.getParameter("matKhau");
		String vaiTro = request.getParameter("vaiTro");
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(900);// max thoi gian session la 900
		if (vaiTro.equalsIgnoreCase("admin")) {
			Admin admin = adminDAO.dangNhap(taiKhoan, matKhau);
			if (admin == null) {
				return "login";
			} else {
				session.setAttribute("admin", admin);
				session.setAttribute("vaitro", 3);
				return "admin";
			}
		} else if (vaiTro.equalsIgnoreCase("bacSi")) {
			BacSi bacSi = bacSiDAO.dangNhap(taiKhoan, matKhau);
			if (bacSi == null) {
				return "login";
			} else {
				session.setAttribute("bacsi", bacSi);
				session.setAttribute("vaitro", 2);
				return "bacsi";
			}
		} else {
			// benhNhan
			BenhNhan benhNhan = benhNhanDAO.dangNhap(taiKhoan, matKhau);
			if (benhNhan == null) {
				return "login";
			} else {
				session.setAttribute("benhNhan", benhNhan);
				session.setAttribute("vaitro", 1);
				return "benhnhan";
			}
		}
	}

	// dang ky và xử lý đăng ký
	@RequestMapping(value = "/dangky", method = RequestMethod.GET)
	public String dangKy(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		return "dangKy";
	}

	@RequestMapping(value = "/xulydangky", method = RequestMethod.POST)
	public String xuLyDangKy(HttpServletRequest request, HttpServletResponse response, ModelMap mm)
			throws ParseException {
		// set value cho benh nhan lay tu giao dien
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
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// surround below line with try catch block as below code throws checked
		// exception
		Date ngaySinh = sdf.parse(ngaySinhStr);
		BenhNhan benhNhan = new BenhNhan(Integer.parseInt(maBenhNhan), taiKhoan, matKhau, hoTen, ngaySinh, 
				Integer.parseInt(gioiTinh), quocTich, noiOHienTai, email, soDienThoai, soCMND, soTheBHYT, 
				queQuan, ngheNghiep);
		benhNhanDAO.themBenhNhan(benhNhan);
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(900);// max thoi gian session la 900
		
		session.setAttribute("benhnhandangky", benhNhan);
		return "benhnhan";
	}

}
