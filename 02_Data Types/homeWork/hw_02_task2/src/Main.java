//Урок #2
//Переменные, типы данных

//Задача: Конвертер
//Необходимо разработать программу для конвертации различных единиц измерения, использующих примитивные типы данных.
//Программа должна поддерживать конвертации массы:
//Из килограммов в граммы, миллиграммы и наоборот.
//Требования:
//Программа должна запрашивать у пользователя исходное значение и тип данных, которые нужно преобразовать.
//Для всех расчетов используйте примитивные типы данных.
//Программа должна предусматривать возможность ввода данных с клавиатуры и вывод результата на экран.

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<WeightUnit> weightUnits = new ArrayList<>();
        weightUnits.add(new WeightUnit("грам", "г", 1));
        weightUnits.add(new WeightUnit("милиграм", "мг", Math.pow(10,-3)));
        weightUnits.add(new WeightUnit("килограм", "кг", Math.pow(10,3)));
        weightUnits.add(new WeightUnit("центнер", "ц", Math.pow(10,5)));
        weightUnits.add(new WeightUnit("тонна", "т", Math.pow(10,6)));

        printUnits(weightUnits);
        int inputWeightIndex = getConsoleInputInt("Выберите еденицу измерения массы:", 1, weightUnits.size()) - 1;
        double inputWeight = getConsoleInputDouble("Введите значение массы:");

        printUnits(weightUnits);
        int outputWeightIndex = getConsoleInputInt("Выберите еденицу измерения массы для вывода результата:", 1, weightUnits.size()) - 1;

        double inputWeightGram = inputWeight * weightUnits.get(inputWeightIndex).getMultiplier();
        double outputWeight = inputWeightGram / weightUnits.get(outputWeightIndex).getMultiplier();

        System.out.printf("%f %s = %f %s",
                inputWeight, weightUnits.get(inputWeightIndex).getShortName(),
                outputWeight, weightUnits.get(outputWeightIndex).getShortName());
    }

    public static void printUnits(ArrayList<WeightUnit> weightUnits)
    {
        for (int i = 0; i < weightUnits.size(); i++)
        {
            System.out.printf("%d - %s\n", (i + 1), weightUnits.get(i).getName());
        }
    }

    public static double getConsoleInputDouble(String requestText)
    {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println(requestText);
        while (!consoleInput.hasNextDouble())
        {
            System.out.printf("Entered value is not double type. %s\n", requestText);
            consoleInput.next();
        }
        return consoleInput.nextDouble();
    }

    public static int getConsoleInputInt(String requestText, int startRange, int endRange)
    {
        Scanner consoleInput = new Scanner(System.in);
        int value;
        do
        {
            System.out.println(requestText);
            while (!consoleInput.hasNextInt())
            {
                System.out.printf("Entered value is not integer type. %s\n", requestText);
                consoleInput.next();
            }
            value = consoleInput.nextInt();
            if (value < startRange || value > endRange)
            {
                System.out.printf("Entered value is out of %d...%d range. %s\n", startRange, endRange, requestText);
            }
        } while (value < startRange || value > endRange);
        return value;
    }
}
