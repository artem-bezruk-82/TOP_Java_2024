public class Questionnaire
{
    private String name;
    private int age;
    private double favoriteNumber;
    private char favoriteSymbol;
    private boolean likesCoding;

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return this.age;}

    public void setAge(int age) throws Exception
    {
        if (age >= 0)
            this.age = age;
        else
            throw new Exception("Value is less than 0");
    }

    public double getFavoriteNumber() {return favoriteNumber;}
    public void setFavoriteNumber(double favoriteNumber) {this.favoriteNumber = favoriteNumber;}

    public char getFavoriteSymbol() {return favoriteSymbol;}
    public void setFavoriteSymbol(char favoriteSymbol) {this.favoriteSymbol = favoriteSymbol;}

    public boolean getLikesCoding() {return  this.likesCoding;}
    public void setLikesCoding(boolean likesCoding) {this.likesCoding = likesCoding;}

    @Override
    public String toString()
    {
        return String.format("Name: %s\nAge: %d\nFavorite number: %f\nFavorite symbol: %c\nLikes coding: %b",
                this.name, this.age, this.favoriteNumber, this.favoriteSymbol, this.likesCoding);
    }
}
