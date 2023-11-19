package Exercise2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;

    public Person(String firstName, String lastName, LocalDate birthday, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }
    public int age(LocalDate birthday){
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday,currentDate).getYears();

    }
}
