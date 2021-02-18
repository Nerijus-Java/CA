package lt.codeacademy.hibernatev2.repository;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.hibernatev2.entity.Hospital;
import org.hibernate.Session;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class HospitalDao {

    private final Session session;

    public List<Hospital> loadAll() {
        return session.createQuery("from Hospital", Hospital.class).list();
    }

    public Optional<Hospital> getById(Long id) {
        return Optional.ofNullable(session.get(Hospital.class, id));
    }

    public void saveOrUpdate(Hospital newHospital) {
        session.saveOrUpdate(newHospital);
    }

    public void delete(Long id) {
        session.beginTransaction();
        getById(id).ifPresent(session::delete);
        session.getTransaction().commit();
    }

}
