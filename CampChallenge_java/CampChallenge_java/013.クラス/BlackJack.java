

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amuro
 */
public class BlackJack {
    public static void main(String[] args){
        Dealer dealer = new Dealer();
        User user = new User();
        
       //ユーザー手札合計
    user.setCard(dealer.deal());
        while(user.checkSum()){
            System.out.println("ユーザー「 HIT 」" +user.open() +"一枚引く");
            user.setCard(dealer.hit());
        }
    System.out.println("ユーザー「 stand 」" + user.open() + "ターンEND");
    
      //ディーラー手札合計
    dealer.setCard(dealer.deal());
        while(dealer.checkSum()){
            System.out.println("ディーラー「 HIT 」" + dealer.open() + "一枚引く");
            dealer.setCard(dealer.hit());
        }
    System.out.println("ディーラー「 stand 」" + dealer.open() + "ターンEND");
    
    //二人でブラックジャック
    if(dealer.open() > user.open()){
        if(dealer.open() <=21){
            System.out.println("ディーラー勝利");
        }else {
            System.out.println("ディーラー負け");
        }
    }else if(user.open() > dealer.open()){
        if(user.open() <=21){
            System.out.println("ユーザー勝利");
        }else if(user.open() >= 21){
            System.out.println("ユーザー負け");
        
        }
    }
    if(user.open() == dealer.open()){
        System.out.println("引き分け");
    }
    
    }
    
}


    
    


  
    



