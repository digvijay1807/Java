import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*//ADULT or NOT ADULT
        int age=sc.nextInt();

        if(age > 18){
            System.out.println("You are Adult");
        }else{
            System.out.println("You are not Adult");
        }*/

        /* //EVEN & ODD
        int x=sc.nextInt();

        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/


        /*//EQUAL,GREATER,SMALLER
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("Numbers are equal");
        }else if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("a is lesser");
        }*/
        

        //SWITCH
        //PRINT GREETING
        int button=sc.nextInt();
        switch (button) {
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid button");
            
        }

    }
    
}
