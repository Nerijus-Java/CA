package lt.codeacademy.mongodb.part3.model;

import java.util.List;

public class Office {
    private List<Car> cars;
    private String name;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Office{" +
                "cars=" + cars +
                ", name='" + name + '\'' +
                '}';
    }
}
