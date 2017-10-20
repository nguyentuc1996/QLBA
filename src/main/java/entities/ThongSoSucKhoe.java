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
@Table(name = "thong_so_suc_khoe")
public class ThongSoSucKhoe {
    private int maBanGhi;
    private int maBenhNhan;
    private int mach;
    private int nhietDo;
    private int huyetAp;
    private int nhipTho;
    private int canNang;
    private Date ngay;

    public ThongSoSucKhoe(int maBanGhi, int maBenhNhan, int mach, int nhietDo, int huyetAp, int nhipTho, int canNang, Date ngay) {
        this.maBanGhi = maBanGhi;
        this.maBenhNhan = maBenhNhan;
        this.mach = mach;
        this.nhietDo = nhietDo;
        this.huyetAp = huyetAp;
        this.nhipTho = nhipTho;
        this.canNang = canNang;
        this.ngay = ngay;
    }

    public ThongSoSucKhoe() {
    }

    public int getMaBanGhi() {
        return maBanGhi;
    }

    public void setMaBanGhi(int maBanGhi) {
        this.maBanGhi = maBanGhi;
    }

    public int getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(int maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public int getMach() {
        return mach;
    }

    public void setMach(int mach) {
        this.mach = mach;
    }

    public int getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(int nhietDo) {
        this.nhietDo = nhietDo;
    }

    public int getHuyetAp() {
        return huyetAp;
    }

    public void setHuyetAp(int huyetAp) {
        this.huyetAp = huyetAp;
    }

    public int getNhipTho() {
        return nhipTho;
    }

    public void setNhipTho(int nhipTho) {
        this.nhipTho = nhipTho;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }
    
}
