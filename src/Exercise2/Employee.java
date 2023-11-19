package Exercise2;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person{
    private Date dateOfEmployment;
    private String position;


    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public Employee(String firstName, String lastName, LocalDate birthday, String address, Date dateOfEmployment, String position) {
        super(firstName, lastName, birthday, address);
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }
}
