//Урок #5
//Массивы

// Задача 3: Угадай слово
//Описание: Программа загадывает слово, игрок должен угадывать буквы.
//После каждого введённого символа программа показывает текущее состояние слова (с уже угаданными буквами).
//Игра продолжается до тех пор, пока игрок не угадает всё слово.

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Воронеж", "Город-миллионник в Черноземье"));
        words.add(new Word("Москва", "Столица РФ"));
        words.add(new Word("Сочи", "Черноморский город-курорт"));

        Game game = new Game(words);
        game.run();
    }
}