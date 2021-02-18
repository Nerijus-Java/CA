package lt.codeacademy.hibernatev2;

import lombok.Getter;
import lt.codeacademy.hibernatev2.entity.Hospital;
import lt.codeacademy.hibernatev2.entity.Patient;
import lt.codeacademy.hibernatev2.repository.HospitalDao;
import lt.codeacademy.hibernatev2.repository.PatientDao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Getter
public class DaoManger {

    private HospitalDao hospitalDao;
    private SessionFactory sessionFactory;
    private PatientDao patientDao;

    void init(){
        Configuration cfg = HibernateHelper.createConfiguration();
        cfg.addAnnotatedClass(Hospital.class);
        cfg.addAnnotatedClass(Patient.class);

        this.sessionFactory = cfg.buildSessionFactory();
        this.patientDao = new PatientDao(sessionFactory.openSession());
        this.hospitalDao = new HospitalDao(sessionFactory.openSession());
    }

    void closeSession(){
        this.sessionFactory.close();
    }

}
