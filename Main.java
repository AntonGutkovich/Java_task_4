import vehicles.ElectricCar;
import vehicles.Vehicle;
import vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car common_car=new Car("AntonCar", "123456", "green", 2006, "Anton", 100123, "Gasoline");
        System.out.println(common_car.vehicleType());
        common_car.setModel("Antoncar 2.0");
        System.out.println(common_car.toString());
        ElectricCar common_elcar= new ElectricCar("AmogusCar", "outdated", "blue", 2024, "Amogus", 200123, "Electric", 220);
        System.out.println(common_elcar.vehicleType());
        common_elcar.setBatteryCapacity(120);
        System.out.println(common_elcar.toString());
    }
}