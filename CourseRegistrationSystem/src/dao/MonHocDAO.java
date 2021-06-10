package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.MonhocEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class MonHocDAO {
    /*----------------------Tham khao file huong dan-----------------------*/
    public static List<MonhocEntity> getDanhSachMH() {
        List<MonhocEntity> ds = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = "select mh from MonhocEntity mh";
            Query query = session.createQuery(hql);
            ds = (List<MonhocEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }

    public static MonhocEntity getThongTinMH(String maMonHoc) {
        MonhocEntity mh = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            mh = (MonhocEntity) session.get(MonhocEntity.class, maMonHoc);

        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return mh;
    }

    public static int addMH(MonhocEntity mh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (MonHocDAO.getThongTinMH(mh.getMaMonHoc()) != null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(mh);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int updateThongTinMH(MonhocEntity mh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (MonHocDAO.getThongTinMH(mh.getMaMonHoc()) == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(mh);
            transaction.commit();
        } catch (HibernateException ex) {

            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int deleteMH(String maMonHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        MonhocEntity mh = MonHocDAO.getThongTinMH(maMonHoc);
        if (mh == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(mh);
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

