package Exercise2;

import java.time.LocalDate;
import java.util.Date;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, LocalDate birthday, String address, Date dateOfEmployment, String position) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
    }
    @Override
    public String getAddress(){
        return "db admin:";

    }
}
