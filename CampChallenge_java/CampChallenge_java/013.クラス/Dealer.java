/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author amuro
 */

class Dealer extends Human {
    //全てのカード（デッキ）を持たせる。
    public ArrayList<Integer>Cards = new ArrayList<Integer>();
    public Dealer(){
        for(int mark = 1; mark <=4; mark++){
            for(int num = 1; num <= 13; num++){
                Cards.add(num);
                if(10 <= num){
                    Cards.add(10);
                }else{
                    Cards.add(num);
                }    
            }
        }        
    }    
    
    //デッキから2枚ランダムで配布。
    public ArrayList<Integer>deal() {
        ArrayList<Integer>Result = new ArrayList<Integer>();
        for(int i = 0; i < 2; i++){
        Random rand = new Random();
        Integer index = rand.nextInt(Cards.size());
        Result.add(Cards.get(index));
        Cards.remove(index);
        }
        return Result;
    }
    //一枚追加する時
    public ArrayList<Integer>hit(){
      ArrayList<Integer>Result = new ArrayList<Integer>();
      Random rand = new Random();
      Integer index = rand.nextInt(Cards.size());
      Result.add(Cards.get(index));
      Cards.remove(index);
      return Result;
    }
             
    
    //二枚の合計値
    @Override  
    public int open() {
        int total = 0;
        for(int A :myCards){
            total = total + A;
            
        }
        return total;
    }
    
     //二枚を手札にする
    @Override 
      void setCard(ArrayList<Integer> getCard) {
        for(int A:getCard){
            myCards.add(A);
        }
    } 
    //ディーラー16以下の時一枚引くかどう判断
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
