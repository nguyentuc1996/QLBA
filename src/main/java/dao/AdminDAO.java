package dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import entities.Admin;


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
}
