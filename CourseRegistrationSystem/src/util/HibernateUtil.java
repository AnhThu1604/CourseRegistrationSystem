package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*---------------------Tham khao code tren mang-------------------------*/
public class HibernateUtil {
    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return sessionFactory;
    }
}
/*----------------------------------------------------------------------*/