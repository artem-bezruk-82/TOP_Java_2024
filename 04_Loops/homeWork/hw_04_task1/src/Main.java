//Урок #4
//Циклы

//Задача: "Угадай число"
//Напишите программу, которая генерирует случайное число от 1 до 100.
//Пользователь должен угадать это число, вводя свои предположения.
//Программа должна:
//1. Принимать ввод от пользователя.
//2. Если число меньше загаданного, выводить сообщение: "Загаданное число больше".
//3. Если число больше загаданного, выводить сообщение: "Загаданное число меньше".
//4. Если число угадано правильно, выводить сообщение: "Поздравляю, вы угадали число за N попыток!" и завершать программу.

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int minRangeValue = 1;
        int maxRangeValue = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(maxRangeValue - minRangeValue + 1) + minRangeValue;
        int attemptCounter = 0;
        int consoleInput = 0;
        while (consoleInput != randomNumber)
        {
            consoleInput = getConsoleInputInt("Введите число",minRangeValue,maxRangeValue);
            attemptCounter++;
            if (consoleInput != randomNumber)
                System.out.printf("Загаданное число %s\n", consoleInput < randomNumber ? "больше" : "меньше");
        }
        System.out.printf("Поздравляю, вы угадали число за %d попыток!", attemptCounter);
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