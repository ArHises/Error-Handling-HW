package HW03;

import java.io.InvalidClassException;
import java.util.Date;

public class User {
    private String familyName;
    private String name;
    private String fatherName;
    private String birthDate;
    private String phoneNumber;
    private Sex sex;

    public User(String familyName, String name, String fatherName, String birthDate, String phoneNumber, Sex sex) {
        this.familyName = familyName;
        this.name = name;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>"
                , familyName
                ,name
                ,fatherName
                ,birthDate
                ,phoneNumber
                ,sex.toString());
    }
}
