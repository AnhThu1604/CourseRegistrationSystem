package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.GiaovuEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;
public class GiaoVuDAO {

    public static List<GiaovuEntity> getDanhSachGV(){
        List<GiaovuEntity> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select gv from GiaovuEntity gv";
            Query query = session.createQuery(hql);
            ds = (List<GiaovuEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }

    public static GiaovuEntity getThongTinGV(String ma){
        GiaovuEntity gv = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            gv = (GiaovuEntity) session.get(GiaovuEntity.class, ma);

        }
        catch (HibernateException ex){
            System.err.println(ex);
        }finally {
            session.close();
        }
        return gv;
    }

    public static int addGV(GiaovuEntity gv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (GiaoVuDAO.getThongTinGV(gv.getMa()) != null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(gv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int updateThongTinGV(GiaovuEntity gv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (GiaoVuDAO.getThongTinGV(gv.getMa()) == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(gv);
            transaction.commit();
        } catch (HibernateException ex) {

            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int deleteGV(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        GiaovuEntity sv = GiaoVuDAO.getThongTinGV(ma);
        if(sv == null){
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
}
