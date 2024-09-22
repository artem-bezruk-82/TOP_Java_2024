import java.util.Scanner;

public class ConsoleCreator implements ICreatable
{
    private Questionnaire instance;

    public ConsoleCreator() {instance = new Questionnaire();}


    @Override
    public Questionnaire getInstance()
    {
        defineProperties();
        return this.instance;
    }

    private void defineProperties()
    {
        defineName();
        defineAge();
        defineFavoriteNumber();
        defineFavoriteSymbol();
        defineLikesCoding();
    }

    private void defineName()
    {
        instance.setName(getConsoleInputStr("Please enter name"));
    }

    private void defineAge()
    {
        try
        {
            instance.setAge(getConsoleInputInt("Please enter age"));
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            defineAge();
        }
    }

    private void defineFavoriteNumber()
    {
        instance.setFavoriteNumber(getConsoleInputDouble("Please enter your favorite number"));
    }

    private void defineFavoriteSymbol()
    {
        instance.setFavoriteSymbol(getConsoleInputChar("Please enter your favorite char"));
    }

    private void defineLikesCoding()
    {
        String consoleInput = getConsoleInputStr("Do you like coding (y, n)?").toLowerCase();
        switch (consoleInput)
        {
            case "y":
            case "yes":
                instance.setLikesCoding(true);
                break;
            case "n":
            case "no":
                instance.setLikesCoding(false);
                break;
            default:
                defineLikesCoding();
        }
    }

    private String getConsoleInputStr(String requestText)
    {
        String consoleInput = new String();
        while (consoleInput.isEmpty())
        {
            System.out.println(requestText);
            consoleInput = new Scanner(System.in).nextLine();
        }
        return consoleInput;
    }

    private int getConsoleInputInt(String requestText)
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

    private double getConsoleInputDouble(String requestText)
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

    private char getConsoleInputChar(String requestText)
    {
        System.out.println(requestText);
        Scanner consoleInput = new Scanner(System.in);
        return (consoleInput.next().trim().toCharArray())[0];
    }

}
