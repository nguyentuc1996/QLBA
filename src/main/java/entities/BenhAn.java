/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author tucng
 */
@Entity
@Table(name = "benh_an")
public class BenhAn {
    private int maBenhAn;
    private int maBenhNhan;
    private int maLinhVuc;
    private Date ngayKham;
    private String lyDoKham;
    private String quaTrinhBenhLy;
    private String tienSuLienQuan;
    private String huongDieuTri;
    private String tomTatBenhAn;
    private String khac;
    private Date ngayTao;
    private int maNguoiTao;

    public BenhAn(int maBenhAn, int maBenhNhan, int maLinhVuc, Date ngayKham, String lyDoKham, String quaTrinhBenhLy, String tieuSuLienQuan, String huongDieuTri, String tomTatBenhAn, String khac, Date ngayTao, int maNguoiTao) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.maLinhVuc = maLinhVuc;
        this.ngayKham = ngayKham;
        this.lyDoKham = lyDoKham;
        this.quaTrinhBenhLy = quaTrinhBenhLy;
        this.tienSuLienQuan = tieuSuLienQuan;
        this.huongDieuTri = huongDieuTri;
        this.tomTatBenhAn = tomTatBenhAn;
        this.khac = khac;
        this.ngayTao = ngayTao;
        this.maNguoiTao = maNguoiTao;
    }

    public BenhAn() {
    }

    public int getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(int maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public int getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(int maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public int getMaLinhVuc() {
        return maLinhVuc;
    }

    public void setMaLinhVuc(int maLinhVuc) {
        this.maLinhVuc = maLinhVuc;
    }

    public Date getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(Date ngayKham) {
        this.ngayKham = ngayKham;
    }

    public String getLyDoKham() {
        return lyDoKham;
    }

    public void setLyDoKham(String lyDoKham) {
        this.lyDoKham = lyDoKham;
    }

    public String getQuaTrinhBenhLy() {
        return quaTrinhBenhLy;
    }

    public void setQuaTrinhBenhLy(String quaTrinhBenhLy) {
        this.quaTrinhBenhLy = quaTrinhBenhLy;
    }

    public String getTienSuLienQuan() {
        return tienSuLienQuan;
    }

    public void setTienSuLienQuan(String tieuSuLienQuan) {
        this.tienSuLienQuan = tieuSuLienQuan;
    }

    public String getHuongDieuTri() {
        return huongDieuTri;
    }

    public void setHuongDieuTri(String huongDieuTri) {
        this.huongDieuTri = huongDieuTri;
    }

    public String getTomTatBenhAn() {
        return tomTatBenhAn;
    }

    public void setTomTatBenhAn(String tomTatBenhAn) {
        this.tomTatBenhAn = tomTatBenhAn;
    }

    public String getKhac() {
        return khac;
    }

    public void setKhac(String khac) {
        this.khac = khac;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getMaNguoiTao() {
        return maNguoiTao;
    }

    public void setMaNguoiTao(int maNguoiTao) {
        this.maNguoiTao = maNguoiTao;
    }

}
