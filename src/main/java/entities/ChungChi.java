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
@Table(name = "chung_chi")
public class ChungChi {
    private int maChungChi;
    private int maBacSy;
    private String tenChungChi;
    private Date ngayNhan;
    private Date ngayHetHan;
    private String moTa;

    public ChungChi(int maChungChi, int maBacSy, String tenChungChi, Date ngayNhan, Date ngayHetHan, String moTa) {
        this.maChungChi = maChungChi;
        this.maBacSy = maBacSy;
        this.tenChungChi = tenChungChi;
        this.ngayNhan = ngayNhan;
        this.ngayHetHan = ngayHetHan;
        this.moTa = moTa;
    }

    public ChungChi() {
    }

    public int getMaChungChi() {
        return maChungChi;
    }

    public void setMaChungChi(int maChungChi) {
        this.maChungChi = maChungChi;
    }

    public int getMaBacSy() {
        return maBacSy;
    }

    public void setMaBacSy(int maBacSy) {
        this.maBacSy = maBacSy;
    }

    public String getTenChungChi() {
        return tenChungChi;
    }

    public void setTenChungChi(String tenChungChi) {
        this.tenChungChi = tenChungChi;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
