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
@Table(name = "benh_nhan")
public class BenhNhan {
    private int maBenhNhan;
    private String taiKhoan;
    private String matKhau;
    private String hoTen;
    private Date ngaySinh;
    private int gioiTinh;
    private String quocTich;
    private String noiOHienTai;
    private String email;
    private String soDienThoai;
    private String soCMND;
    private String soTheBHYT;
    private String queQuan;
    private String ngheNghiep;
    private int vaiTro;
    public BenhNhan() {
    }

    public BenhNhan(int maBenhNhan, String taiKhoan, String matKhau, String hoTen, Date ngaySinh, int gioiTinh, String quocTich, String noiOHienTai, String email, String soDienThoai, String soCMND, String soTheBHYT, String queQuan, String ngheNghiep,int vaiTro) {
        this.maBenhNhan = maBenhNhan;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.quocTich = quocTich;
        this.noiOHienTai = noiOHienTai;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.soCMND = soCMND;
        this.soTheBHYT = soTheBHYT;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
        this.vaiTro= vaiTro;
    }

    public int getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(int maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    

    public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getNoiOHienTai() {
        return noiOHienTai;
    }

    public void setNoiOHienTai(String noiOHienTai) {
        this.noiOHienTai = noiOHienTai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoTheBHYT() {
        return soTheBHYT;
    }

    public void setSoTheBHYT(String soTheBHYT) {
        this.soTheBHYT = soTheBHYT;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

	public int getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(int vaiTro) {
		this.vaiTro = vaiTro;
	}


}
