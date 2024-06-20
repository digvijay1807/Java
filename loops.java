import java.util.*;

public class loops {
    public static void main(String[] args) {
        // for(int n=0;n<10;n++){
        //     System.out.println("Hello world");
        // }

        // for(int n=0;n<=10;n++){
        //     System.out.println(n);
        // }

       /* //while loop
        int i =0;
        while (i<11) {
            System.out.println(i);
            i++;
            
        }
             */


        /*//do while
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<11);
        */


       /* //Sum of first n numbers
        //n=5
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

         */

        //Table of 2
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(i*n);

        }



    }
    
}
