package HW03;

public class CreateUser {

    public User createUser(String[] data) throws UserDataExeption{
        if (data.length != 6) {
            throw new UserDataExeption("Entered incorrect number of parameters! Has to be: 6");
        }
        return new User(data[0], data[1], data[2], setBirthDate(data[3]), setPhoneNumber(data[4]), setSex(data[5]));
    }

    private static boolean isNotInteger(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    private String setBirthDate(String birthDate) throws UserDataExeption{
        String[] date = birthDate.split("\\.");
        if(date.length != 3){
            throw new UserDataExeption("Date! Example: dd.mm.yyyy");

        } else if (date[0].length() != 2 || isNotInteger(date[0])) {
            throw new UserDataExeption("Day! Example: dd.mm.yyyy");

        } else if ((date[1].length() != 2) || isNotInteger(date[1])) {
            throw new UserDataExeption("Month! Example: dd.mm.yyyy");

        } else if (date[2].length() != 4 || isNotInteger(date[2])) {
            throw new UserDataExeption("Year! Example: dd.mm.yyyy");
        }
        return birthDate;
    }

    private String setPhoneNumber(String phoneNumber) throws UserDataExeption{
        if(isNotInteger(phoneNumber)){
            throw new UserDataExeption("PhoneNumber! Use only numbers");
        }
        return phoneNumber;
    }

    private Sex setSex(String sex) throws UserDataExeption{
        try {
            return Sex.valueOf(sex.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new UserDataExeption("Invalid Sex-type! Example: m/f");
        }
    }
}
