/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author amuro
 */
public class DATE {
    public static void main(String[]args){
        
        // カレンダーインスタンスの作成
        Calendar c = Calendar.getInstance();

        // 2016年1月0日 00時00分00秒
        c.set(2016, 0, 1, 00, 00, 00);
        
        //calenderクラスをDATE型に変換
        Date d = c.getTime();

       
        System.out.print(d.getTime());
    }
}
