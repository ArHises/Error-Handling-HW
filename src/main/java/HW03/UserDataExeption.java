package HW03;

public class UserDataExeption extends NumberFormatException{
    public UserDataExeption(String massage) {
        super("Invalid input: " + massage);
    }
}
