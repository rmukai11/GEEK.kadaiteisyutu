/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amuro
 */
public class MOJIRETU3 {
    public static void main(String[] args){
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" ;
        //　i=い　u=う　に変換
        String word2 =(word.replace("I","い"));
        
        //2で変換済みの文でU＝うに変換
        String word3 =(word2.replace("U", "う"));
        
        //3で変換済みのものを表示System.out.print
        System.out.print(word3);
    }
    
}
