package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.LophocEntity;
import pojo.SinhvienEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;

public class LopHocDAO {

    /*----------------------Tham khao file huong dan-----------------------*/
    public static List<LophocEntity> getDanhSachLH() {
        List<LophocEntity> ds = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
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

    public static LophocEntity getThongTinLH(String maLopHoc) {
        LophocEntity lh = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            lh = (LophocEntity) session.get(LophocEntity.class, maLopHoc);

        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
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

    public static int deleteLH(String maLopHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LophocEntity lh = LopHocDAO.getThongTinLH(maLopHoc);
        if (lh == null) {
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

    public static void updateSoLuong1Lop(LophocEntity lopHoc) {
        int nam = 0, nu = 0;
        Iterator<SinhvienEntity> list = lopHoc.getSinhViens().iterator();
        while (list.hasNext()) {
            SinhvienEntity sinhvien = list.next();
            if (sinhvien.getPhai().compareTo("Nam") == 0) {
                nam = nam + 1;
            } else {
                nu = nu + 1;
            }
        }
        lopHoc.setTongSvNu(nu);
        lopHoc.setTongSvNam(nam);
        lopHoc.setTongSv(nam + nu);
    }
    /*---------------------------------------------------------------------*/

}
