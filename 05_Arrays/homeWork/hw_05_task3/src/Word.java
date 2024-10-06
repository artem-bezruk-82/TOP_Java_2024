public class Word
{
    private String prompt;
    private char[] wordToGuessArr;
    private char[] wordToShowArr;

    public Word(String wordToGuess, String prompt)
    {
        this.prompt = prompt;
        this.wordToGuessArr = wordToGuess.toLowerCase().toCharArray();
        this.wordToShowArr = new char[wordToGuess.length()];
        for (int i = 0; i < this.wordToShowArr.length; i++)
            this.wordToShowArr[i] = '*';
    }

    public String getPrompt(){return this.prompt;}
    public String getWordToGuess(){return new String(wordToGuessArr);}
    public String getWordToShow(){return new String(wordToShowArr);}
    public boolean tryToGuess(char letter)
    {
        int guessCounter = 0;
        for (int i = 0; i < wordToGuessArr.length; i++)
        {
            if (wordToGuessArr[i] == letter)
            {
                wordToShowArr[i] = wordToGuessArr[i];
                guessCounter++;
            }
        }
        return guessCounter > 0;
    }

    @Override
    public String toString()
    {
        return String.format("%s\n%s",prompt, new String(wordToShowArr));
    }
}
