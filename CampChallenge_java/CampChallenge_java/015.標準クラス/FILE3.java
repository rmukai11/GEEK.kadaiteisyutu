
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amuro
 */
public class FILE3 {
    public static void main(String[] args) throws IOException{
        try{
            //ファイル標識の指示
            File fp = new File("test.txt");
            FileWriter fw = new FileWriter(fp);
        
            //日付の指定
            Date now = new Date();
            SimpleDateFormat today = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");

            fw.write("スタート時刻は" +today.format(now)+"\n");
            
            //mathクラスで絶対値を求める
            for(int i = 1; i <=10; i++){
                fw.write(i + "の絶対値は" + Math.abs(i) + "です。" + "\n");
                
            }
            //日付指定
            Date end = new Date();
            SimpleDateFormat today2 = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");

            fw.write("終了時刻は"+ today2.format(end));
            
            fw.close();
        
        }catch(IOException e){
            e.printStackTrace();
            
        }
    }
    
}
