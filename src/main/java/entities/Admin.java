/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tucng
 */
@Entity
@Table(name = "admin")
public class Admin {
    private int maAdmin;
    private String taiKhoan;
    private String matKhau;
    private String hoTen;
    private String email;
    private String soDienThoai;

    public Admin(int maAdmin, String taiKhoan, String matKhau, String hoTen, String email, String soDienThoai) {
        this.maAdmin = maAdmin;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
//        this.vaiTro= vaiTro;
    }

    public Admin() {
    }
    @Id
	@Column(name = "ma_admin")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMaAdmin() {
        return maAdmin;
    }

    public void setMaAdmin(int maAdmin) {
        this.maAdmin = maAdmin;
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


    
}
