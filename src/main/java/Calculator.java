import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    public static double sq_root(double a){
        logger.info("Calculating Square Root of : " + a + "\n Result : " + Math.sqrt(a));
        return java.lang.Math.sqrt(a);
    }

    public static double factorial(int n){
        if(n<0) {
            logger.info("Factorial of a negative number is not possible!");
            return Double.NaN;
        }
        double fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        logger.info("Factorial of the number : " + n + "\n Result is : " + fact);
        return fact;
    }

    public static double logarithm(double a){
        logger.info("Calculating Natural Logarithm of : " + a + "\n Result : " + Math.log(a));
        return java.lang.Math.log(a);
    }
    public static double power(double a,double b){
        logger.info("Power : " + a + "^" + b + "/n Result : " + Math.pow(a, b));
        return java.lang.Math.pow(a,b);
    }

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter your Choice: \n 1.Square Root \n 2.Factorial \n 3.Natural Log\n 4.Power \n 5.Exit\n");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            try {
                switch (ch) {
                    case 1:
                        System.out.println("Enter a number to find its square root: ");
                        double a = sc.nextDouble();
                        System.out.println("Square root of " + a + " is: " + sq_root(a));
                        break;
                    case 2:
                        System.out.println("Enter a number to find its factorial: ");
                        int b = sc.nextInt();
                        System.out.println("Factorial of " + b + " is: " + factorial(b));
                        break;
                    case 3:
                        System.out.println("Enter number to find its natural log: ");
                        double c = sc.nextDouble();
                        System.out.println("Natural log of " + c + " is: " + logarithm(c));
                        break;
                    case 4:
                        System.out.print("Enter the number: ");
                        double d = sc.nextDouble();
                        System.out.print("Enter power: ");
                        double e = sc.nextDouble();
                        System.out.println("The number " + d + " raised to power " + e + " is: " + power(d, e));
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("The Input is wrong");

            } catch (IllegalArgumentException e) {
                System.out.println("Input cant be negative");
            }


        }
    }


}



