import java.util.*;
public class patterns {
    public static void main(String[] args) {

        //rectangle of 4 rows 5 columns
        int n=5;
        int m=6;
        /*
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for (int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
         */

       /* //Hollow Rectangle

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                if(i==1 || j==1|| i==n|| j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         */

         /*for(int i=1;i<=n;i++){ 
            for(int j=1;j<=i;j++){

                System.out.print(j+" ");

            }System.out.println();
         }*/


         //Floyd's Triangle
         int a=5;
         int number=1;

         for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println(" ");
         }
    }
    
}
