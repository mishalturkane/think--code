package junemonth;
import java.util.Scanner;
public class june23 {
   static  void primeornot(){
        Scanner kb = new Scanner(System.in);
       System.out.print("Enter range of prime numbers:");
        int n =kb.nextInt();
        int i,j,count=0;
        for(i=1;i<=n;i++){
           for(j=2;j<=n-1;j++){
               if(i%j==0)
               {

                   break;
               }

           }
           if(i==j)
           {
               count++;
               System.out.println(j);
           }


        }
       System.out.println("Total Prime Number's are:"+count);
    }
    public static void main(String[] args) {
       june23.primeornot();
    }
}
