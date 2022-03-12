
import java.util.Scanner;

public class MyMethod {
    public static void main(String[] args){
        myHeader();
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("==================\na: Power Function\nb: Factorial Function\nc: Sine Function\nd: Cosine Function\ne: exit\n==================\n");
            char choice = input.next().charAt(0);
            switch (choice){
                case 'a': 
                    System.out.print("Enter x value: ");
                    double x = input.nextDouble();
                    System.out.print("Enter y value: ");
                    int y = input.nextInt();
                    System.out.println(x + "^" + y + " = " + myPow(x,y));
                    exit = false;
                case 'b': 
                    //factorial
                case 'c': 
                    //sin
                case 'd': 
                    //cos
                case 'e': 
                    exit = true;

            }
            //bitch what???

            
        }
        myFooter();
    }

    public static double myPow(double x, int y){
        double result = 1;
        if(y>0){
            while(y>0) {
                result = result*x;
                y--;
            }
            return(result);
        }else{
            while(y<0) {
                result = result/x;
                y++;
            }
            return(result);
        }
    }

    public static double myFactorial(int n){
        int result = 1;
        while(n > 0){
            result = result * n;
            n--;
        }
        return result;
    }

    public static double mySin(double x){
        double sum = 0;
        double term = 0;
        double numerator;
        double denominator;
        double factor;
        for(int n = 0; n <= 16; n++){
            numerator = myPow(-1,n);
            denominator = myFactorial((2*n) + 1);
            factor = myPow(x, ((2*n) + 1));
            term = ((numerator / denominator) * factor);
            sum = sum + term;
        }
        return sum;
    }

    public static double myCos(double x){
        double sum = 0;
        double term = 0;
        double numerator;
        double denominator;
        double factor;
        for(int n = 0; n <= 16; n++){
            numerator = myPow(-1,n);
            denominator = myFactorial(2*n);
            factor = myPow(x, (2*n));
            term = ((numerator / denominator) * factor);
            sum = sum + term;
        }
        return sum;
    }

    public static void myHeader() {
        System.out.println("***************************");
        System.out.print("Name: Todd Childerhose \nLab number: 6\nQuestion number: 1\n");
        System.out.println("***************************");
    }// Prints header for screen

    public static void myFooter() {
        System.out.println("*** Goodbye from Todd Childerhose ***");
    }// Prints footer for screen

}