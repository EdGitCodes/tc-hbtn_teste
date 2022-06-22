import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner, pensioner, publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;

    }

    public String fullName(){
        return String.format("%s %s", getName() , getSurname());
    }

    public float calculateYearlySalary(){
        return getSalary() * 12;
    }

    public static int calculateAge(Date bDate) {
        LocalDate date = bDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();

        return Period.between(date, currentDate).getYears();
    }

    public boolean isMEI(){
        if(calculateYearlySalary() < 130000
                && calculateAge(getBirthDate()) >= 18
                && isAnotherCompanyOwner() == false
                && isPensioner() == false
                && isPublicServer() == false){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}