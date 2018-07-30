
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amuro
 */
public class User extends Human {

    @Override
    public int open() {
       int total = 0;
        for(int A :myCards){
            total = total + A;
        }
        return total;
    }

    @Override
    void setCard(ArrayList<Integer> setCard) {
        for(int A:setCard){
          myCards.add(A);
        }  
    }
    
    
    @Override
    public boolean checkSum() {
        this.open();
        int open = this.open();
        if(open <16){
            return true;
        }else{
            return false;
        }
       
    }
    
    
}
