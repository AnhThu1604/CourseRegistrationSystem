package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.DangkiHpEntity;
import pojo.HockiEntity;
import pojo.HocphanEntity;
import pojo.MonhocEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;
public class HocKiDAO {

    public static List<HockiEntity> getDanhSachHK(){
        List<HockiEntity> ds = null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select HK from HockiEntity HK";
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

    //Lay thong tin ki hien tai
    public static HockiEntity getThongTinHKHT() {
        HockiEntity HK = null;
        List<HockiEntity> list = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = "select HK from HockiEntity HK where HK.kiHienTai = 1";
            Query query = session.createQuery(hql, HockiEntity.class);
            list = (List<HockiEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        if(list.size()==0) {
            return null;
        }
        HK = list.get(0);
        return HK;
    }


}
