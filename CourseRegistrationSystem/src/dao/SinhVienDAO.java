package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.SinhvienEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;
public class SinhVienDAO {

    public static List<SinhvienEntity> getDanhSachSV(){
        List<SinhvienEntity> ds=null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select sv from SinhvienEntity sv";
            Query query = session.createQuery(hql);
            ds = (List<SinhvienEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }

    public static SinhvienEntity getThongTinSV(String maSinhVien){
        SinhvienEntity sv = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            sv = (SinhvienEntity) session.get(SinhvienEntity.class, maSinhVien);

        }
        catch (HibernateException ex){
            System.err.println(ex);
        }finally {
            session.close();
        }
        return sv;
    }

    public static int addSV(SinhvienEntity sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.getThongTinSV(sv.getMaSinhVien()) != null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int updateThongTinSV(SinhvienEntity sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.getThongTinSV(sv.getMaSinhVien()) == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(sv);
            transaction.commit();
        } catch (HibernateException ex) {

            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int deleteSV(String maSinhVien) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        SinhvienEntity sv = SinhVienDAO.getThongTinSV(maSinhVien);
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
