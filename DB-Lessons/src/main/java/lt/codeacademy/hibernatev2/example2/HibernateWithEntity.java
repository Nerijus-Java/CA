package lt.codeacademy.hibernatev2.example2;


import lt.codeacademy.hibernatev2.HibernateHelper;
import lt.codeacademy.hibernatev2.entity.Hospital;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateWithEntity {

    public static void main(String[] args) {


        Configuration cfg = HibernateHelper.createConfiguration();
        cfg.addAnnotatedClass(Hospital.class);
//        cfg.
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Query<Hospital> query = session.createQuery("from Hospital where id = :someId", Hospital.class);

        query.setParameter("someId", 5L);

        List<Hospital> hospitals = query.list();
        System.out.println(hospitals);

        session.close();
        sessionFactory.close();
    }

}
