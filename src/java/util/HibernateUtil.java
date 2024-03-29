
package util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;
   
    static {
        try {        
        sessionFactory = new Configuration().configure("/Controller/hibernate.cfg.xml").buildSessionFactory();				
        } catch (Exception e) {
              e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}