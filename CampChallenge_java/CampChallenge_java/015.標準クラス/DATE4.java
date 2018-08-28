
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amuro
 */
public class DATE4 {
    public static void main (String[]args){
    Calendar A = Calendar.getInstance();
        A.set(2015, 00, 1, 00, 00, 00);
        Date d = A.getTime();
        System.out.println(d.getTime());
        
    Calendar B = Calendar.getInstance();
        B.set(2015, 11, 31, 23, 59,59 );
        Date D = B.getTime();
        System.out.println(D.getTime());    
        
        //BからAを引く
        System.out.print(D.getTime() - d.getTime());
   
    
        
}
}
