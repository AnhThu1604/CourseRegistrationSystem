package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.PhieuDkEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class PhieuDKDAO {

    /*----------------------Tham khao file huong dan-----------------------*/
    public static List<PhieuDkEntity> getDanhSachPhieu() {
        List<PhieuDkEntity> ds = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = "select Phieu from PhieuDkEntity Phieu";
            Query query = session.createQuery(hql);
            ds = (List<PhieuDkEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }

    public static List<PhieuDkEntity> getThongTinPhieu(String maSV) {
        PhieuDkEntity phieu = null;
        List<PhieuDkEntity> list = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = "select phieu from PhieuDkEntity phieu where phieu.sinhVien.maSinhVien like :maSV";
            Query query = session.createQuery(hql);
            list = (List<PhieuDkEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
    }

    public static int addPhieu(PhieuDkEntity Phieu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<PhieuDkEntity> list = PhieuDKDAO.getThongTinPhieu(Phieu.getSinhVien().getMaSinhVien());
        if ((PhieuDKDAO.getThongTinPhieu(Phieu.getSinhVien().getMaSinhVien()) != null)) {
            for (PhieuDkEntity phieuDK : list) {
                if (phieuDK.getHocPhan().getMaHocPhan().compareTo(Phieu.getHocPhan().getMaHocPhan()) == 0) {
                    return 0;
                }
            }

        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(Phieu);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int updateThongTinPhieu(PhieuDkEntity Phieu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if ((PhieuDKDAO.getThongTinPhieu(Phieu.getSinhVien().getMaSinhVien()) != null) &&
                (PhieuDKDAO.getThongTinPhieu(Phieu.getHocPhan().getMaHocPhan()) != null)) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(Phieu);
            transaction.commit();
        } catch (HibernateException ex) {

            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int deletePhieu(PhieuDkEntity Phieu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (Phieu == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(Phieu);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    /*----------------------------------------------------------------------*/
}
