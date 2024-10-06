//Урок #5
//Массивы

//Задача 2: Найти наибольшее число в массиве
//Описание: Пользователь вводит количество чисел и сами числа,
// программа сохраняет их в массив и находит наибольшее число.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = getArrayConsole();
        fillArrayInConsole(arr);
        printArrayConsole(arr);
        System.out.printf("max = %d",getMaxArray(arr));
    }

    public static int getMaxArray(int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void printArrayConsole(int[] array)
    {
        System.out.print("[");
        for (int i = 0; i < array.length; i++)
        {
            if (i == array.length - 1)
                System.out.printf("%d]\n",array[i]);
            else
                System.out.printf("%d, ", array[i]);
        }
    }

    public static void fillArrayInConsole(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = getConsoleInputInt(String.format("Please enter value for element %d",i));
        }
    }

    public static int[] getArrayConsole()
    {
        return new int[Math.abs(getConsoleInputInt("Please enter array length"))];
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