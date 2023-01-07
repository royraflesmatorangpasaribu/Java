/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDiagramProgram;

/**
 *
 * @author ASUS
 */
import java.time.LocalDate;
import java.time.Month;

public class Student extends Person{
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
    
    @Override
    public void menulis(){
        System.out.println("Menulis Tugas Akhir");
    }
    
    
}
