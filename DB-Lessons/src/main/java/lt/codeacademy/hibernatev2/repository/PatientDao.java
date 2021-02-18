package lt.codeacademy.hibernatev2.repository;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.hibernatev2.entity.Patient;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class PatientDao {

    private final Session session;

    public List<PatientDao> loadAll() {
        return session.createQuery("from Hospital", PatientDao.class).list();
    }

    public Optional<PatientDao> getById(Long id) {
        return Optional.ofNullable(session.get(PatientDao.class, id));
    }

    public void saveOrUpdate(Patient newPatient) {
        session.saveOrUpdate(newPatient);
    }

    public void delete(Long id) {
        session.beginTransaction();
        getById(id).ifPresent(session::delete);
        session.getTransaction().commit();
    }
}
