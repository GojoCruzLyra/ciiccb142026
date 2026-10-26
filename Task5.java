import java.util.Scanner;

class Task5{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2= input.nextDouble();

        System.out.print("Enter third number: ");
        double num3= input.nextDouble();

        if (num1 == num2 && num2 == num3){
        System.out.println("All numbers are equal");

        }else{
            double largest = num1;

            if (num2 > largest){
                largest = num2;
            }
            
            if (num3 > largest){
                largest = num3;
            }

            System.out.println("The largest numer is " + largest);
        }

        input.close();

    }
}