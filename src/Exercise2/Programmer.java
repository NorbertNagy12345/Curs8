package Exercise2;

import java.time.LocalDate;
import java.util.Date;

public class Programmer extends Employee {
    public String language;

    public Programmer(String firstName, String lastName, LocalDate birthday, String address, Date dateOfEmployment, String position) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
    }
    @Override
    public String getPosition() {
        return "programmer";
    }
}
