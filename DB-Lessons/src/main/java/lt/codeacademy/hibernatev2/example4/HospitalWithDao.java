package lt.codeacademy.hibernatev2.example4;


import lt.codeacademy.hibernatev2.DaoManger;
import lt.codeacademy.hibernatev2.entity.Hospital;
import lt.codeacademy.hibernatev2.repository.HospitalDao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class HospitalWithDao {

    public static void main(String[] args) {
        DaoManger dao = new DaoManger();
        createNewHospital(dao.getHospitalDao());
        updateHospital(dao.getHospitalDao());
        deleteHospital(dao.getHospitalDao());
        printAllHospitals(dao.getHospitalDao());
        dao.getSessionFactory().close();
    }

    private static void deleteHospital(HospitalDao dao) {
        System.out.println("Enter hospital ID to delete:");
        Long id = new Scanner(System.in).nextLong();
        dao.delete(id);
    }

    private static void updateHospital(HospitalDao dao) {
        Hospital hospital = dao.getById(5L).get();
        hospital.setAddress("New address 111 - " + LocalDateTime.now());
        dao.saveOrUpdate(hospital);
        System.out.println(hospital);
    }

    private static void createNewHospital(HospitalDao dao) {
        Hospital newHospital = createNewHospital();
        dao.saveOrUpdate(newHospital);
    }

    private static Hospital createNewHospital() {
        Hospital hospital = new Hospital();
        System.out.println("Enter Hospital name:");
        hospital.setName(new Scanner(System.in).nextLine());
        hospital.setCity("Vilnius");
        hospital.setAddress("Street 1");
        return hospital;
    }

    private static void printAllHospitals(HospitalDao dao) {
        List<Hospital> hospitals = dao.loadAll();
        hospitals.forEach(System.out::println);
    }

}
