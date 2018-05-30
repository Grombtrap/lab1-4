import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JTextField;


public class HelloWorld{
    
    private static void shadowbodylab1(){
        System.out.println("Hello Russian retard!");}
    
    private static void shadowbodylab2() throws IOException {
        
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();
        int num2 = Integer.parseInt(numa);
    
        if(num2==1){
        int i;
        float b = 0;
           for(i=1;i<=100;i++){
             b=i;
             if(b%2==0){
               System.out.println(b);}
           }
        }

        else if(num2==2){
          String m =  reader.readLine(),n = reader.readLine();
          int m1 = Integer.parseInt(m), n1 = Integer.parseInt(n);
          int j,i;
              for(i=1;i<=m1;i++){
                  System.out.print(8);
                  for(j=1;j<=n1;j++){
                    System.out.println(8);} 
              }
        }
        
        else if(num2==3){
            int i;
              String s = "8";
                  for(i=0;i<=10;i++){
                      System.out.println(s);
                      s = s + "8";}
        }
        
        else if(num2==4){
           
                String a,b;
                int cA,dB;
                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("введите a и b,");

                a=r.readLine();
                b=r.readLine();
                cA = Integer.parseInt(a);
                dB = Integer.parseInt(b);

                if (cA > dB){
                    System.out.println("минимум =  "+dB);}
                else if (cA < dB) {
                    System.out.println("минимум =  "+cA);}
                else {
                    System.out.println("минимум =  " +cA);}
        }
        
        else if(num2==5){
            String name1, name2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое имя:");
            name1=sc.nextLine();
            System.out.println("Введите второе имя:");
            name2=sc.nextLine();
            String names1=name1,names2=name2;
            
            if(names1.equals(names2)){
               System.out.println("Имена идентичны");} 
               
            else if (names1.length()==names2.length()){
                System.out.println("Длины имен равны");}
        }
        
        else if(num2==6){

                String a,b,c,d;
                int cA,cB,cC,cD;
                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("введите a,b,c и d");

                a=r.readLine();
                b=r.readLine();
                d=r.readLine();
                c=r.readLine();
                cA = Integer.parseInt(a);
                cB = Integer.parseInt(b);
                cC = Integer.parseInt(c);
                cD = Integer.parseInt(d);

                if (cA < cB && cC<cD){
                    if(cA > cC){
                    System.out.println("минимум =  "+cC);}

                    else{
                        System.out.println("минимум =  "+cA);}
                }
                
                else if (cA > cB && cC>cD) {
                    if(cB>cD){
                        System.out.println("минимум =  "+cD);}
                    
                    else{
                        System.out.println("минимум =  "+cB);}
                }
        }   
        else if(num2==7){
        
        }
    }
     
    private static void shadowbodylab3()throws IOException {
        
    }
    
      private static void shadowbodylab4()throws IOException {
          
    }
    
    public static void main(String[] args) throws IOException {
        
        int word = 0;
        int k;
        System.out.println("Выберете лабараторную работу");
        for(k=0;k<4;k++){
            word = word + 1;
        System.out.println("Лабараторная работа" + word);}
        
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();
        int num1 = Integer.parseInt(numa);
        
            if(num1==1){
                HelloWorld lab1 = new HelloWorld();
                lab1.shadowbodylab1();}
         
            else if(num1==2){ //2.1-lab
                HelloWorld lab2 = new HelloWorld();
                lab2.shadowbodylab2();}
            
            else if(num1==3){ // 2.2-lab
                HelloWorld lab3 = new HelloWorld();
                lab3.shadowbodylab3();}
            
            else if(num1==4){//lab.4
                
            }
        }
}
