import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld{
    
    private static void shadowbodylab1(){
        System.out.println("Hello Worlds!");}
    
    private static void shadowbodylab2() throws IOException {
        
        int num2;   
        Scanner sc = new Scanner(System.in);
         do {
             System.out.println("Please enter a positive number!");
             while (!sc.hasNextInt()) {
                 System.out.println("That not a number!");
                 sc.next(); // this is important!
             }
             num2 = sc.nextInt();
         } 
        while (num2 <= 0 || num2 > 7);
         
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
            int m,n;
        do {
            System.out.println("Please enter a positive number M!");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // this is important!
            }
            m = sc.nextInt();
        } while (m <= 0);
        
        do {
            System.out.println("Please enter a positive number N!");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // this is important!
            }
            n = sc.nextInt();
        } while (n <= 0);
        
          int j,i;
              for(i = 0; i < m; i++){
                  System.out.print(8);
                  for(j = 1; j < n; j++){
                    System.out.print(8);}
                  System.out.println();
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
           
                int A,B;
                System.out.println("введите a");
                do {
                System.out.println("Please enter a positive number N!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That not a number!");
                        sc.next(); // this is important!
                    }
                    A = sc.nextInt();
                } while (A <= 0);
                
                System.out.println("введите b");
                do {
                System.out.println("Please enter a positive number!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That not a number!");
                        sc.next(); // this is important!
                    }
                    B = sc.nextInt();
                } while (B <= 0);

                if (A > B){
                    System.out.println("минимум =  "+B);}
                else if (A < B) {
                    System.out.println("минимум =  "+A);}
                else {
                    System.out.println("минимум =  " +A);}
        }
        
        else if(num2==5){
            String name1, name2;
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
            
                int A,B,C,D;
                System.out.println("введите a");
                do {
                System.out.println("Please enter a positive number B!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That not a number!");
                        sc.next(); // this is important!
                    }
                    A = sc.nextInt();
                } while (A <= 0);
                
                System.out.println("введите b");
                do {
                System.out.println("Please enter a positive number B!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That not a number!");
                        sc.next(); // this is important!
                    }
                    B = sc.nextInt();
                } while (B <= 0);
                
                System.out.println("введите c");
                do {
                System.out.println("Please enter a positive number C!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That not a number!");
                        sc.next(); // this is important!
                    }
                    C = sc.nextInt();
                } while (C <= 0);
                
                System.out.println("введите d");
                do {
                System.out.println("Please enter a positive number D!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That not a number!");
                        sc.next(); // this is important!
                    }
                    D = sc.nextInt();
                } while (D <= 0);

                if (A < B && C < D){
                    if(A > C){
                    System.out.println("минимум =  "+C);}

                    else{
                        System.out.println("минимум =  "+A);}
                }
                
                else if (A > B && C > D) {
                    if(B > D){
                        System.out.println("минимум =  "+D);}
                    
                    else{
                        System.out.println("минимум =  "+B);}
                }
        }   
        else if(num2==7){
            int x, y;
        while(true) {
            System.out.print("Введите X: ");
            try {
                x = sc.nextInt();
                if(x<0 || x>0)
                break; 
                else 
                   System.out.println("Число X не должно равнятся 0!"); 
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        while(true) {
            System.out.print("Введите Y: ");
            try {
                y = sc.nextInt();  
                if(y<0 || y>0)
                break; 
                else
                    System.out.println("Число Y не должно равнятся 0!");
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        if (x>0)
            if(y>0)
                System.out.println("Точка находится в первой четверти");
            else System.out.println("Точка находится в четвертой четверти");
        else 
            if (y>0)
                System.out.println("Точка находится во второй четверти");
            else System.out.println("Точка находится в третьей четверти");
        }
    }
     
    private static void shadowbodylab3()throws IOException {
        int num3;
        Scanner sc = new Scanner(System.in);
             System.out.println("введите какую работу вы хотели проверить");
                do {
                System.out.println("Please enter a positive number!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That not a number!");
                        sc.next(); // this is important!
                    }
                    num3 = sc.nextInt();
                } while (num3 <= 0 || num3 > 5);
                
                if(num3==1){
                
                    int arr[]=new int[10];
                    for(int i=0,n=2; i<10; n=n+2,i++){
                        arr[i]=n;
                    }
                    for(int i=0; i<10; i++) {
                        System.out.print(arr[i]+" ");
                    }
                        System.out.println();
                    for(int i=0; i<10; i++) {
                        System.out.println(arr[i]);               
                    }
                }
                
                else if(num3==2){
                
                        int arr[]=new int[50];
                        for(int i=0,n=1; i<arr.length; n=n+2,i++){
                            arr[i]=n;
                        }
                        for(int i=0; i<arr.length; i++) {
                            System.out.print(arr[i]+" ");
                        }
                         System.out.println();
                        for(int i=arr.length-1; i>=0; i--) {
                            System.out.print(arr[i]+" ");

                        }
                            }
                
                else if(num3==3){
                
                    int arr[]=new int[15];
                    for (int i=0;i<arr.length;i++) {
                        arr[i]=(int)(Math.random()*10);
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    int col=0;
                    for(int i=0;i<arr.length;i++){
                        if (arr[i]%2==0 && (arr[i]!=0))
                            col++;}
                    
                    System.out.println("Количество четных чисел: "+col);
                    
                }
                
                else if(num3==4){
                
                    int[] arr[]=new int[8][5];
                    for(int i=0;i<8;i++){
                        for(int j=0;j<5;j++){
                        arr[i][j]=(int)(Math.random()*90+10);
                        System.out.print(arr[i][j]+" ");} 
                    System.out.println();}                    
                }
                
                else if(num3==5){
                
                   int[]arr[]=new int[7][4];
                   int max=0;
                   int index=0;
                   for(int i=0;i<7;i++){ 
                      int p=1; 
                        for(int j=0;j<4;j++){
                         arr[i][j]=(int)(Math.random()*11-5);
                         System.out.print(arr[i][j]+" ");
                         p*=arr[i][j];
                     }
                   
                        System.out.println();
                        if (max<Math.abs(p)) {
                            max=Math.abs(p);
                            index=i;}
                
                   }
                   
            System.out.println("Индекс строки с наибольшим произведением: " + index);}
    }
    
    
    public static void main(String[] args) throws IOException {
        
        int word = 0;
        int k,num1;
        System.out.println("Выберете лабараторную работу");
        for(k=0;k<3;k++){
            word = word + 1;
        System.out.println("Лабараторная работа" + word);}
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // this is important!
            }
            num1 = sc.nextInt();
        } while (num1 <= 0);
            if(num1==1){
                HelloWorld lab1 = new HelloWorld();
                lab1.shadowbodylab1();}
         
            else if(num1==2){ //2.1-lab
                HelloWorld lab2 = new HelloWorld();
                lab2.shadowbodylab2();}
            
            else if(num1==3){ // 2.2-lab
                HelloWorld lab3 = new HelloWorld();
                lab3.shadowbodylab3();}
        }
}
