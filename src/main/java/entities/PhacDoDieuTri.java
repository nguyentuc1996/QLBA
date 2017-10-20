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
@Table(name = "phac_do_dieu_tri")
public class PhacDoDieuTri {
    private int maPhacDo;
    private int maBenhAn;
    private String tieuDe;
    private Date thoiGian;
    private String noiDung;
    private Date ngayTao;
    private boolean nhacNho;
    private int maNguoiTao;

    public PhacDoDieuTri(int maPhacDo, int maBenhAn, String tieuDe, Date thoiGian, String noiDung, Date ngayTao, int maNguoiTao) {
        this.maPhacDo = maPhacDo;
        this.maBenhAn = maBenhAn;
        this.tieuDe = tieuDe;
        this.thoiGian = thoiGian;
        this.noiDung = noiDung;
        this.ngayTao = ngayTao;
        this.maNguoiTao = maNguoiTao;
    }

    public PhacDoDieuTri() {
    }

    public int getMaPhacDo() {
        return maPhacDo;
    }

    public void setMaPhacDo(int maPhacDo) {
        this.maPhacDo = maPhacDo;
    }

    public int getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(int maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
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

    public boolean isNhacNho() {
        return nhacNho;
    }

    public void setNhacNho(boolean nhacNho) {
        this.nhacNho = nhacNho;
    }
    
    
}
