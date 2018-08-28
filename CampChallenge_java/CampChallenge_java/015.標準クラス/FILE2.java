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
public class FILE2 {
    public static void main(String[] args){
        File fp = new File("test.txt");
        
    try{
        // FileReader作成
    FileReader fr = new FileReader(fp);
    
    // BufferedReader作成
    BufferedReader br = new BufferedReader(fr);
    
    // 1行読み出し
    System.out.print(br.readLine());

    br.close();
    }catch(IOException e){
       e.printStackTrace();
    }  
    }
        
}
    

