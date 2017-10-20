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
@Table(name = "tu_van")
public class TuVan {
    private int maTuVan;
    private String tieuDe;
    private String cauHoi;
    private String traLoi;
    private Date thoiGian;
    private int maBenhNhan;
    private int maBacSi;

    public TuVan(int maTuVan, String tieuDe, String cauHoi, String traLoi, Date thoiGian, int maBenhNhan, int maBacSi) {
        this.maTuVan = maTuVan;
        this.tieuDe = tieuDe;
        this.cauHoi = cauHoi;
        this.traLoi = traLoi;
        this.thoiGian = thoiGian;
        this.maBenhNhan = maBenhNhan;
        this.maBacSi = maBacSi;
    }

    public int getMaTuVan() {
        return maTuVan;
    }

    public void setMaTuVan(int maTuVan) {
        this.maTuVan = maTuVan;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getTraLoi() {
        return traLoi;
    }

    public void setTraLoi(String traLoi) {
        this.traLoi = traLoi;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(int maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public int getMaBacSi() {
        return maBacSi;
    }

    public void setMaBacSi(int maBacSi) {
        this.maBacSi = maBacSi;
    }
    
    
}
