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
public class KuisDiagramClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2003, Month.JUNE, 5);
        PersonInterface s = new Student("2007051001","Manajemen Informatika","Andi",date);
        
        s.menulis();
    }
    
}
