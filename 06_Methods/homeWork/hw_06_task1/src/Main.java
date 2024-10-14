//Урок #6
//Методы

// Задача 0: Сортировка и фильтрация(c классом)
//Описание: Создайте класс NumberUtils, который будет содержать методы для работы с массивами чисел.
// Реализуйте метод, который будет сортировать массив и
// метод, который будет фильтровать элементы массива, оставляя только те, которые больше заданного порога.
//Требования:
//1. Реализуйте метод sort, который принимает массив целых чисел и возвращает отсортированный массив.
// Используйте алгоритм сортировки (например, сортировку пузырьком или выбором) и циклы.
//2. Реализуйте перегруженный метод filter, который принимает массив целых чисел и пороговое значение.
// Метод должен возвращать новый массив, содержащий только те числа, которые больше порога.
//3. В главном методе реализуйте функционал для ввода массива чисел от пользователя, а также порога фильтрации.
// Обработайте неверные вводы с помощью ветвлений.

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = getArrayConsole();
        System.out.printf("Initial array:\n%s\n",Arrays.toString(arr));
        System.out.printf("Filtered array:\n%s\n",
                Arrays.toString(NumberUtils.filter(arr,getConsoleInputInt("Please enter threshold value"))));
        System.out.printf("Sorted array:\n%s\n", Arrays.toString(NumberUtils.sortBubble(arr)));
    }

    public static int[] getArrayConsole()
    {
        int[] array = new int[Math.abs(getConsoleInputInt("Please enter array length"))];
        fillArrayInConsole(array);
        return array;
    }

    public static void fillArrayInConsole(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            array[i] = getConsoleInputInt(String.format("Please enter value for element %d",i));
    }

    public static int getConsoleInputInt(String requestText)
    {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println(requestText);
        while (!consoleInput.hasNextInt())
        {
            System.out.printf("Entered value is not integer type. %s\n", requestText);
            consoleInput.next();
        }
        return consoleInput.nextInt();
    }
}