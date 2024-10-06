import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game
{
    private ArrayList<Word> words;
    private Word word;

    public Game(ArrayList<Word> words)
    {
        this.words = words;
        Random random = new Random();
        int randomNumber = random.nextInt(words.size()) ;
        this.word = words.get(randomNumber);
    }

    public void run()
    {
        while (!word.getWordToGuess().equals(word.getWordToShow()))
        {
            System.out.println(word);
            if(word.tryToGuess(getConsoleInputChar("Введите букву")))
               System.out.println("Есть такая буква");
            else
                System.out.println("Нет такой буквы");
        }
        System.out.println(word);
        System.out.println("Игра завершена!");
    }

    private char getConsoleInputChar(String requestText)
    {
        System.out.println(requestText);
        Scanner consoleInput = new Scanner(System.in);
        return (consoleInput.next().trim().toLowerCase().toCharArray())[0];
    }
}
