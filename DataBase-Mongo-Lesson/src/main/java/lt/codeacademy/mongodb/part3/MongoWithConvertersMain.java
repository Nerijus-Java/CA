package lt.codeacademy.mongodb.part3;

import com.mongodb.client.MongoCollection;
import lt.codeacademy.mongodb.MongoDBHelper;
import lt.codeacademy.mongodb.part3.model.Car;
import lt.codeacademy.mongodb.part3.model.Office;
import lt.codeacademy.mongodb.part3.model.ParkingSpace;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MongoWithConvertersMain {


    public static void main(String[] args) {


        Office office1 = createOffice("First One", 5);
        Office office2 = createOffice("Office One", 15);
        MongoCollection<Office> coll =
                MongoDBHelper.getTypedMongoCollection("CodeAcademy", "Office", Office.class);

        coll.insertOne(office1);
        coll.insertOne(office2);

        Office loaded = coll.find().first();

        System.out.println(loaded);


        for (Office of : coll.find()) {
            System.out.println(of.getName() + " " + of.getCars().size());
        }


        MongoDBHelper.close();
    }

    private static Office createOffice(String name, int i) {
        Office office = new Office();
        office.setName(name);
        office.setCars(createCars(i));
        return office;
    }

    private static List<Car> createCars(int nr) {
        return IntStream.range(0, nr).mapToObj(i -> {
            Car car = new Car();
            car.setNr("no-" + i);
            car.setMark("Audi");
            ParkingSpace parkingSpace = new ParkingSpace();
            parkingSpace.setNr(i * 100);
            parkingSpace.setCity("Vilnius");
            parkingSpace.setStreet("Lakūnų g.");
            car.setParkingSpace(parkingSpace);
            return car;

        }).collect(Collectors.toList());
    }

}
