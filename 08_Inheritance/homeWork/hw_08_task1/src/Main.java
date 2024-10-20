//Урок #8
//Наследование

//Задача: Система учета транспортных средств
//Условие:
//Создайте базовый класс Vehicle (Транспортное средство) с полями:
//make (марка)
//model (модель)
//year (год выпуска)
//В этом классе реализуйте метод:
//getDescription() — который возвращает строку с информацией о транспортном средстве в формате:
//"Марка: [make], Модель: [model], Год: [year]"
//Создайте два дочерних класса:
//1. Car (Автомобиль), который имеет дополнительное поле:
//numberOfDoors (количество дверей) И переопределяет метод getDescription() для добавления информации о количестве дверей.
//2. Motorcycle (Мотоцикл), который имеет дополнительное поле:
//hasSidecar (есть ли коляска) И переопределяет метод getDescription() для добавления информации о наличии коляски.
//
//Требования:
//В каждом классе создайте конструктор для инициализации полей.
//В классе Main создайте объекты классов Car и Motorcycle, вызовите их методы getDescription() и выведите информацию на экран.

import java.util.ArrayList;
import java.time.Year;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Ford", "Mondeo", Year.parse("2022"), 4));
        vehicles.add(new Motorcycle("Java", "350 typ 638", Year.parse("1984"), false));
        vehicles.add(new Car("Toyota", "Camry", Year.parse("2023"), 4));
        vehicles.add(new Motorcycle("Ural", "М-67-36", Year.parse("1982"), true));

        printConsole(vehicles);
    }

    public static void printConsole(ArrayList<Vehicle> vehicles)
    {
        for (Vehicle vehicle: vehicles)
        {
            //since calling methods are common for all types derived from super class we can call them with any care about type checking
            System.out.printf("%s\n%s\n", vehicle.getDescription(), vehicle.move());

            //since calling methods are type specific we have to care of type casting before calling them
            if (vehicle instanceof Car)
                System.out.println(((Car)vehicle).moveReverse());
            if (vehicle instanceof Motorcycle)
                System.out.println(((Motorcycle)vehicle).highchairStunt());
            System.out.println("****************");
        }
    }
}