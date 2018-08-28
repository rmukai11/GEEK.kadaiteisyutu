/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author amuro
 */
public class File1 {
    public static void main(String[] args){
        
        try{
         // ファイルオープン
        File fp = new File("test.txt");

        // FileWriter作成
        FileWriter fw = new FileWriter(fp);
        
        // 書き込み
        fw.write("向井ですよろしく");
        
        // クローズ
        fw.close();
        
        }catch(IOException e){
           e.printStackTrace();
        }
        
    }
    
}
