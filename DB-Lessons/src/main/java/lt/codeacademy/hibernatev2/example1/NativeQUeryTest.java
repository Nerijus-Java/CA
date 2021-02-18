package lt.codeacademy.hibernatev2.example1;

import lt.codeacademy.hibernatev2.HibernateHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class NativeQUeryTest {
    public static void main(String[] args) {
        Configuration cfg = HibernateHelper.createConfiguration();
        SessionFactory sessionFactory = cfg.buildSessionFactory();


        Session session = sessionFactory.openSession();
        NativeQuery query = session.createNativeQuery("SELECT PAVADINIMAS FROM LIGONINE");
        List list = query.list();

        System.out.println(list);

        session.close();
        sessionFactory.close();
    }
}
