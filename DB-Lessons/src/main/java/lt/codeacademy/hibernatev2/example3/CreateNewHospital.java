package lt.codeacademy.hibernatev2.example3;


import lt.codeacademy.hibernatev2.HibernateHelper;
import lt.codeacademy.hibernatev2.entity.Hospital;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class CreateNewHospital {


    public static void main(String[] args) {
        Configuration cfg = HibernateHelper.createConfiguration();
        cfg.addAnnotatedClass(Hospital.class);

        SessionFactory sessionFactory = cfg.buildSessionFactory();


        createNewHospital(sessionFactory);
        updateHospital(sessionFactory);
        deleteHospital(sessionFactory);
        printAllHospitals(sessionFactory);


        sessionFactory.close();
    }

    private static void deleteHospital(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        System.out.println("Enter hospital ID to delete:");
        Long id = new Scanner(System.in).nextLong();
        Hospital hospital = session.get(Hospital.class, id);
        ;
        session.delete(hospital);

        session.getTransaction().commit();
        session.close();
    }

    private static void updateHospital(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Hospital hospital = session.get(Hospital.class, 5L);

        hospital.setAddress("New address 111 - " + LocalDateTime.now());

        session.update(hospital);

        System.out.println(hospital);
        session.getTransaction().commit();
        session.close();
    }

    private static void createNewHospital(SessionFactory sessionFactory) {

        Session session = sessionFactory.openSession();

        Hospital newHospital = createNewHospital();

        session.save(newHospital);

        session.close();
    }

    private static Hospital createNewHospital() {
        Hospital hospital = new Hospital();
        System.out.println("Enter Hospital name:");
        hospital.setName(new Scanner(System.in).nextLine());
        hospital.setCity("Vilnius");
        hospital.setAddress("Street 1");
        return hospital;
    }

    private static void printAllHospitals(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();

        Query<Hospital> query = session.createQuery("from Hospital", Hospital.class);

        List<Hospital> hospitals = query.list();
        hospitals.forEach(System.out::println);
        session.close();
    }

}
