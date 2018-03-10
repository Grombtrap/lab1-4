
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloWorld{
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
    String numa = reader.readLine();
    int num1 = Integer.parseInt(numa);
      if(num1==1){  //1-lab
        System.out.print("Hello World!"); }
      else if(num1==2){ //2.1-lab
        int i;
        float b = 0;
            for(i=1;i<=100;i++){
                b=i;
                if(b%2==0){
                 System.out.println(b);} } }
   else if(num1==3){ // 2.2-lab
    String m =  reader.readLine(),n = reader.readLine();
    int m1 = Integer.parseInt(n), n1 = Integer.parseInt(n);
    int j,i;
        for(i=1;i<=m1;i++){
            for(j=1;j<=n1;j++){
                } } } 
    } 
}
