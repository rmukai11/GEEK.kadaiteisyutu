/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amuro
 */
public class Main2 {
     public static void main(String[] args){
            Class2 hito = new Class2();    //インスタンスの生成
            hito.setProfile("名前", 1 , "住所");     //profileに返す内容
            hito.clearProfile();        //printに（）内のprofileに返す
            hito.setprintProfile();
        }     

}
