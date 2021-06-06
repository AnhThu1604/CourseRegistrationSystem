package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.LophocEntity;
import pojo.MonhocEntity;
import pojo.SinhvienEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;
public class LopHocDAO {

    public static List<LophocEntity> getDanhSachLH(){
        List<LophocEntity> ds = null;
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        try {
            String hql = "select lh from LophocEntity lh";
            Query query = session.createQuery(hql);
            ds = (List<LophocEntity>) ((org.hibernate.query.Query<?>) query).list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }

        return ds;
    }


    public static LophocEntity getThongTinLH(String maLopHoc){
        LophocEntity lh = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            lh = (LophocEntity) session.get(LophocEntity.class, maLopHoc);

        }
        catch (HibernateException ex){
            System.err.println(ex);
        }finally {
            session.close();
        }
        return lh;
    }

    public static int addLH(LophocEntity lh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (LopHocDAO.getThongTinLH(lh.getMaLopHoc()) != null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lh);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int updateThongTinLH(LophocEntity lh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (LopHocDAO.getThongTinLH(lh.getMaLopHoc()) == null) {
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(lh);
            transaction.commit();
        } catch (HibernateException ex) {

            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }

    public static int deleteLH(String maLopHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LophocEntity lh = LopHocDAO.getThongTinLH(maLopHoc);
        if(lh == null){
            return 0;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(lh);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return 1;
    }


    public static void ThemSV(LophocEntity lh, String phai){
        Integer nam = lh.getTongSvNam();
        Integer nu = lh.getTongSvNu();
        if(phai.compareTo("Nam") == 0) {
            lh.setTongSvNam(nam + 1);
        }
        else{
            lh.setTongSvNu(nu + 1);
        }
        lh.setTongSv(nam+nu+1);
        updateThongTinLH(lh);
    }
    public static void XoaSV(LophocEntity lh, String phai){
        Integer nam = lh.getTongSvNam();
        Integer nu = lh.getTongSvNu();
        if(phai.compareTo("Nam") == 0) {
            lh.setTongSvNam(nam - 1);
        }
        else{
            lh.setTongSvNu(nu - 1);
        }
        lh.setTongSv(nam+nu-1);
        updateThongTinLH(lh);
    }
    public static void SuaSV(LophocEntity lh, String phai){
        Integer nam = lh.getTongSvNam();
        Integer nu = lh.getTongSvNu();
        if(phai.compareTo("Nam") == 0) {
            lh.setTongSvNam(nam + 1);
            lh.setTongSv(nu - 1);
        }
        else{
            lh.setTongSvNu(nu + 1);
            lh.setTongSvNam(nam - 1);
        }
        lh.setTongSv(nam+nu);
        updateThongTinLH(lh);
    }
}
