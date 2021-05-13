/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadswitch;
import java.util.Scanner;
/**
 *
 * @author pc13
 */
public class ActividadSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dias = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber el día que es: ");
        int dia=dias.nextInt();
        String nomdia;
        switch(dia) {
            case 1: nomdia="lunes";
            break;
            case 2: nomdia="martes";
            break;
            case 3: nomdia="miercoles";
            break;
            case 4: nomdia="jueves";
            break;
            case 5: nomdia="viernes";
            break;
            case 6: nomdia="sabado";
            break;
            case 7: nomdia="domingo";
            break;
            default: nomdia="dia inválido";
            break;
        }
        System.out.println(nomdia);
        
    
    
    
    
    }
    
}
