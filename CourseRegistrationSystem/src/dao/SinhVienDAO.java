package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pojo.SinhvienEntity;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;
public class SinhVienDAO {
    public static List<SinhvienEntity> laySV(){
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

}
