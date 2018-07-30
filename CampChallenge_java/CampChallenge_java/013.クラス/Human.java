/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author amuro
 */
abstract class Human {
    abstract public int open();
    
    abstract void setCard(ArrayList<Integer> getCard);
    
    abstract public boolean checkSum();
    
    ArrayList<Integer>myCards = new ArrayList<Integer>();
}
