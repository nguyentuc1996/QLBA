package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bac_si_benh_nhan")
public class BacSiBenhNhan {
	private int maBanGhi;
	private int maBacSi;
	private int maBenhNhan;
	
    @Id
	@Column(name = "ma_ban_ghi")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMaBanGhi() {
		return maBanGhi;
	}
	public void setMaBanGhi(int maBanGhi) {
		this.maBanGhi = maBanGhi;
	}
	public int getMaBacSi() {
		return maBacSi;
	}
	public void setMaBacSi(int maBacSi) {
		this.maBacSi = maBacSi;
	}
	public int getMaBenhNhan() {
		return maBenhNhan;
	}
	public void setMaBenhNhan(int maBenhNhan) {
		this.maBenhNhan = maBenhNhan;
	}
	public BacSiBenhNhan(int maBanGhi, int maBacSi, int maBenhNhan) {
		super();
		this.maBanGhi = maBanGhi;
		this.maBacSi = maBacSi;
		this.maBenhNhan = maBenhNhan;
	}
	public BacSiBenhNhan() {
		super();
	}
	
}
