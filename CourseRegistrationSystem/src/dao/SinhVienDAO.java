package dao;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pojo.SinhVien;
import util.HibernateUtil;

import javax.management.Query;
import java.util.List;

public class SinhVienDAO {
    public static SinhVien layThongTinSinhVien(String maSinhVien) {
        SinhVien sv = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            sv = (SinhVien) session.get(SinhVien.class, maSinhVien);
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }
}


