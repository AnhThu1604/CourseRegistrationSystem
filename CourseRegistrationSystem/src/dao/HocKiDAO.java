package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.HockiEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;
public class HocKiDAO {

    public static List<HockiEntity> getDanhSachHK(){
        List<HockiEntity> ds = null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select HK from SinhvienEntity HK";
            Query query = session.createQuery(hql);
            ds = (List<HockiEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }

    public static HockiEntity getThongTinHK(int maHocki){
        HockiEntity HK = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            HK = (HockiEntity) session.get(HockiEntity.class, maHocki);

        }
        catch (HibernateException ex){
            System.err.println(ex);
        }finally {
            session.close();
        }
        return HK;
    }

    public static int addHK(HockiEntity HK) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocKiDAO.getThongTinHK(HK.getMaHocKi()) != null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(HK);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int updateThongTinHK(HockiEntity HK) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocKiDAO.getThongTinHK(HK.getMaHocKi()) == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(HK);
            transaction.commit();
        } catch (HibernateException ex) {

            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int deleteHK(int maHocki) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HockiEntity HK = HocKiDAO.getThongTinHK(maHocki);
        if(HK == null){
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(HK);
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
