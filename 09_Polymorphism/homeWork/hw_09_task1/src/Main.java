//Урок #9
//Полиморфизм

//Задача: Разработка системы для работы с транспортными средствами
//Условие:
//Создайте интерфейс Vehicle, который будет описывать общие методы для всех транспортных средств:
//start() — метод для запуска транспортного средства.
//stop() — метод для остановки транспортного средства.
//Затем создайте несколько классов, которые реализуют этот интерфейс:
//1. Car — класс для автомобиля.
//2. Bicycle — класс для велосипеда.
//3. Boat — класс для лодки.
//Каждый класс должен реализовать методы интерфейса Vehicle:
//В методе start() выводите на экран уникальное сообщение для каждого типа транспорта (например, "Автомобиль заводится").
//В методе stop() выводите сообщение о том, что транспорт остановлен.
//Также создайте класс Garage, в котором будет метод operateVehicle(Vehicle vehicle). Этот метод принимает объект,
// реализующий интерфейс Vehicle, и вызывает у него методы start() и stop().
//Требования:
//1. Реализуйте интерфейс Vehicle и несколько классов для разных типов транспортных средств.
//2. В классе Garage используйте полиморфизм для работы с любым типом транспорта через метод operateVehicle().
//3. Продемонстрируйте работу программы, создав экземпляры каждого вида транспорта и передав их в метод operateVehicle().

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(new Engine(), new Battery(Battery.BatteryStates.Charged)));
        vehicles.add(new Bicycle());
        vehicles.add(new Boat(new Engine()));
        vehicles.add(new Car(new Engine(), new Battery(Battery.BatteryStates.Uncharged)));

        for (Vehicle vehicle : vehicles)
        {
            Garage.operateVehicle(vehicle);
            System.out.println();
        }
    }
}