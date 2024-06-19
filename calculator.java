import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float num1=sc.nextFloat();
        float num2=sc.nextFloat();

        //Addition
        float sum=num1+num2;
        System.out.println(sum);
        //Subtraction
        float sub=num1-num2;
        System.out.println(sub);

        //Multiplication
        float mul=num1*num2;
        System.out.println(mul);

        //Division
        float div=num1/num2;
        System.out.println(div);

        
        // switch ('num1','num2') {
        //     case 1:System.out.println(sum);
        //     break;
        //     case 2:System.out.println(sub);
        //     break;
        //     case 3:System.out.println(mul);
        //     break;
        //     case 4:System.out.println(div);
        //     break;
        
        //     default:System.out.println("Invalid ");
        //     break;
        // } 

    }
    
}
