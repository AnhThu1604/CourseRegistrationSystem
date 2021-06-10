package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.HocphanEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class HocPhanDAO {

    /*----------------------Tham khao file huong dan-----------------------*/
    public static List<HocphanEntity> getDanhSachHP() {
        List<HocphanEntity> ds = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = "select HP from HocphanEntity HP";
            Query query = session.createQuery(hql);
            ds = (List<HocphanEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }

    public static HocphanEntity getThongTinHP(String ma) {
        HocphanEntity HP = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            HP = (HocphanEntity) session.get(HocphanEntity.class, ma);

        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return HP;
    }

    public static int addHP(HocphanEntity HP) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocPhanDAO.getThongTinHP(HP.getMaHocPhan()) != null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(HP);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int updateThongTinHP(HocphanEntity HP) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocPhanDAO.getThongTinHP(HP.getMaHocPhan()) == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(HP);
            transaction.commit();
        } catch (HibernateException ex) {

            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int deleteHP(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HocphanEntity sv = HocPhanDAO.getThongTinHP(ma);
        if (sv == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }
    /*---------------------------------------------------------------------*/
}
