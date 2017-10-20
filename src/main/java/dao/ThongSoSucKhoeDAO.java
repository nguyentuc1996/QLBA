package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import entities.BenhNhan;
import entities.ThongSoSucKhoe;

public class ThongSoSucKhoeDAO {
	// them
	public void themThongSoSucKhoe(ThongSoSucKhoe thongSoSucKhoe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(thongSoSucKhoe);
			transaction.commit();
			System.out.println("Save OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	// sua
	public void suaThongSoSucKhoe(ThongSoSucKhoe thongSoSucKhoe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(thongSoSucKhoe);
			transaction.commit();
			System.out.println("Save OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	// xoa
	public void xoaThongSoSucKhoe(Integer maThongSoSucKhoe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			ThongSoSucKhoe thongSoSucKhoe = session.get(ThongSoSucKhoe.class, maThongSoSucKhoe);
			session.delete(thongSoSucKhoe);
			transaction.commit();
			System.out.println("Delete OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	public ThongSoSucKhoe layThongTinThongSoSucKhoe(int maThongSoSucKhoe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		ThongSoSucKhoe thongSoSucKhoe = new ThongSoSucKhoe();
		try {
			transaction = session.beginTransaction();
			thongSoSucKhoe = session.get(ThongSoSucKhoe.class, maThongSoSucKhoe);
			System.out.println(" Get OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return thongSoSucKhoe;
	}

	// get danh sach thong so suc khoe

		public ArrayList<ThongSoSucKhoe> layDanhSachThongSoSucKhoe() {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction transaction= null;
			ArrayList<ThongSoSucKhoe> list =null;
			transaction= session.beginTransaction();
			list = (ArrayList<ThongSoSucKhoe>) session.createCriteria(ThongSoSucKhoe.class).list();
			System.out.println("Get list OK");
			session.close();
			return list;
		}
}
