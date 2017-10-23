package dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Util.HibernateUtil;
import entities.BenhAn;

public class BenhAnDAO {
	// them
	public void themBenhAn(BenhAn benhAn) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(benhAn);
			transaction.commit();
			System.out.println("Save OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	// sua
	public void suaBenhAn(BenhAn benhAn) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(benhAn);
			transaction.commit();
			System.out.println("Save OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	// xoa
	public void xoaBenhAn(Integer maBenhAn) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			BenhAn benhAn = session.get(BenhAn.class, maBenhAn);
			session.delete(benhAn);
			transaction.commit();
			System.out.println("Delete OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	// get benh an
	public BenhAn layThongTinBenhAn(int maBenhAn) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		BenhAn benhAn = new BenhAn();
		try {
			transaction = session.beginTransaction();
			benhAn = session.get(BenhAn.class, maBenhAn);
			System.out.println(" Get OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return benhAn;
	}

	// get danh sach benh an
	public ArrayList<BenhAn> layDanhSachBenhAn() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		ArrayList<BenhAn> list = null;
		try {
			transaction = session.beginTransaction();
			list = (ArrayList<BenhAn>) session.createCriteria(BenhAn.class).list();
			System.out.println("Get List OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	// get danh sach benh an theo ma benh nhan
	public ArrayList<BenhAn> layDanhSachBenhAnTheoBenhNhan(int maBenhNhan){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		ArrayList<BenhAn> list = null;
		try {
			transaction = session.beginTransaction();
			String hql = "SELECT BA FROM BenhAn BA"
					+ " Where  BA.maBenhNhan =:id";			
			Query query = session.createQuery(hql);
			query.setParameter("id", maBenhNhan);
			list =  (ArrayList<BenhAn>) query.getResultList();// lay phan tu dau cua mang
			System.out.println(" Get OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	

}
