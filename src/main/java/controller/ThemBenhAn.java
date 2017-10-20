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
//import entities.BenhAn;
//import dao.BenhAnDAO;
//
//@Controller
//@RequestMapping(value = "/benhan")
//public class ThemBenhAn{
//  private BenhAnDAO benhAnDAO = new BenhAnDAO();
//  @RequestMapping(value="/thembenhan",method=RequestMethod.POST)
//  public void themBenhAn(HttpServletRequest httpRequest, HttpServletResponse response, ModelMap mm) 
//		  throws IOException,ParseException{
//    int maBenhAn=Integer.parseInt(httpRequest.getParameter("maBenhAn"));
//    int maBenhNhan=Integer.parseInt(httpRequest.getParameter("maBenhNhan"));
//    int maLinhVuc=Integer.parseInt(httpRequest.getParameter("maLinhVuc"));
//    String ngayKhamStr=httpRequest.getParameter("ngayKham");
//    String lyDoKham=httpRequest.getParameter("lyDoKham");
//    String quaTrinhBenhLy=httpRequest.getParameter("quaTrinhBenhLy");
//    String tieuSuLienQuan=httpRequest.getParameter("tieuSuLienQuan");
//    String huongDieuTri=httpRequest.getParameter("huongDieuTri");
//    String tomTatBenhAn=httpRequest.getParameter("tomTatBenhAn");
//    String khac=httpRequest.getParameter("khac");
//    String ngayTaoStr=httpRequest.getParameter("ngayTao");
//    int maNguoiTao=Integer.parseInt(httpRequest.getParameter("maNguoiTao"));
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    //surround below line with try catch block as below code throws checked exception
//    Date ngayKham = sdf.parse(ngayKhamStr);
//    Date ngayTao = sdf.parse(ngayTaoStr);
//    // add
//    BenhAn benhAn = new BenhAn(maBenhAn, maBenhNhan, maLinhVuc, ngayKham, lyDoKham, 
//    		quaTrinhBenhLy, tieuSuLienQuan, huongDieuTri, tomTatBenhAn, 
//    		khac, ngayTao, maNguoiTao);
//    benhAnDAO.themBenhAn(benhAn);
//
//    response.sendRedirect(httpRequest.getContextPath()+"/qlba/benh_an.html");
//
//  }
//
//}
