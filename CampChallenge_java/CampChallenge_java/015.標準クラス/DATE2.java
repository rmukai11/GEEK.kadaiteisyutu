/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author amuro
 */
public class DATE2 {
    public static void main(String[] args) {
        // 当日の日時で日付情報を作成
        Date d = new Date();
        System.out.println(d);
        
        //何月何日に置き換え
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        System.out.print(sdf.format(d));

    }
}
    
    

