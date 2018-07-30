/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amuro
 */
    public class Class1 {
        public String name = "";       //ここには固定値がわからないので空白
        public int age = 0;            //数字は0固定
        public String address = "";
    
        public void setProfile(String name, int age, String address){
            this.name= name;   //this この情報の大元（この人の名前は〇〇だ）
            this.age= age;
            this.address= address;
        }
        void setprintProfile(){
            System.out.print(name);    //(中身は上の引数)
            System.out.print(age);
            System.out.append(address);
        }
        
}
        
    