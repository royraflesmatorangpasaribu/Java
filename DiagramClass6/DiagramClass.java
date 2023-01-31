import java.time.LocalDate;
import java.time.Month;

class Person {
    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}

class Student extends Person{
    private String npm;
    private String programStudi;

    public Student(String npm, String programStudi, String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
        this.npm = npm;
        this.programStudi = programStudi;
    }
    
    public String getProgramStudi() {
        return programStudi;
    }
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    } 

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
}
