package dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import entities.Admin;
import entities.BenhNhan;


public class AdminDAO {
	// dang nhap
	public Admin dangNhap(String taiKhoan, String matKhau) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Admin admin = null;
		try {
			transaction = session.beginTransaction();
			String hql = "SELECT AD FROM Admin AS AD" + " Where  AD.taiKhoan =:taiKhoan"
					+ " AND AD.matKhau=:matKhau";
			Query query = session.createQuery(hql);
			query.setParameter("taiKhoan", taiKhoan);
			query.setParameter("matKhau", matKhau);
			admin = (Admin) query.getResultList().get(0);// lay phan tu																// dau cua /																// mang
			System.out.println(" Get OK");
		} catch (Exception ex) {
			System.out.println(ex.toString());
		} finally {
			session.close();
		}
		return admin;
	}

	public void themAdmin(Admin admin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(admin);
			transaction.commit();
			System.out.println("Save OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void suaAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(admin);
			transaction.commit();
			System.out.println("Save OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public Admin getAdmin(int maAdmin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Admin admin = new Admin();
		try {
			transaction = session.beginTransaction();
			admin = session.get(Admin.class, maAdmin);
			System.out.println(" Get OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return admin;
	}

	public void xoaAdmin(int maAdmin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			Admin admin = session.get(Admin.class, maAdmin);
			session.delete(admin);
			transaction.commit();
			System.out.println("Delete OK");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

	}

	public List<Admin> layDanhSachAdmin() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction= null;
		ArrayList<Admin> list =null;
		transaction= session.beginTransaction();
		list = (ArrayList<Admin>) session.createCriteria(Admin.class).list();
		System.out.println("Get list OK");
		session.close();
		return list;
	}
}
