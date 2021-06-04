package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.DangkiHpEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;
public class DangKiHPDAO {

    public static List<DangkiHpEntity> getDanhSachTGDK() {
        List<DangkiHpEntity> ds = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = "select TGDK from DangkiHpEntity TGDK";
            Query query = session.createQuery(hql);
            ds = (List<DangkiHpEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }

    public static DangkiHpEntity getThongTinTGDK(int ma) {
        DangkiHpEntity TGDK = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            TGDK = (DangkiHpEntity) session.get(DangkiHpEntity.class, ma);

        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return TGDK;
    }

    public static int addTGDK(DangkiHpEntity TGDK) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (DangKiHPDAO.getThongTinTGDK(TGDK.getMaDkhp()) != null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(TGDK);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }
}

