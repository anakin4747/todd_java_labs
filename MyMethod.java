
import java.util.Scanner;

public class MyMethod {
    public static void main(String[] args){
        myHeader();
        Scanner input = new Scanner(System.in);
        System.out.println("Testing Mathematical Functions: ");
        while(true){
            System.out.println("\n==================\na: Power Function\nb: Factorial Function\nc: Sine Function\nd: Cosine Function\ne: exit\n==================\n");
            System.out.print("Enter your choice: ");
            char choice = input.next().charAt(0);
            switch (choice){
                case 'a':
                    System.out.print("\nPOWER FUNCTION: Calculating x to the power of y.\nEnter x: ");
                    double x = input.nextDouble();
                    System.out.print("Enter y: ");
                    int y = input.nextInt();
                    System.out.printf("%.2f", x);
                    System.out.print("^" + y + " = " + myPow(x, y) + "\n");
                    break;
                case 'b':
                    System.out.print("\nFACTORIAL FUNCTION: Calculating factorial of n.\nEnter n: ");
                    int n = input.nextInt();
                    System.out.print(n + "! = ");
                    System.out.printf("%.2f", Double.valueOf(myFactorial(n)));
                    System.out.println();
                    break;
                case 'c':
                    System.out.print("\nSINE FUNCTION: Calculating sin(k) degree.\nEnter k in degrees: ");
                    double k = input.nextDouble();
                    System.out.print("sin(");
                    System.out.printf("%.2f", k);
                    System.out.print(") degree = ");
                    System.out.printf("%.2f", mySin(k / 180 * Math.PI));
                    System.out.println();
                    break;
                case 'd':
                    System.out.print("\nCOSINE FUNCTION: Calculating cos(m) degree.\nEnter m in degrees: ");
                    double m = input.nextDouble();
                    System.out.print("cos(");
                    System.out.printf("%.2f", m);
                    System.out.print(") degree = ");
                    System.out.printf("%.2f", myCos(m / 180 * Math.PI));
                    System.out.println();
                    break;
                case 'e':

                    break;
                default:
                    System.out.println("\nInvalid Choice!");
            }
            if(choice == 'e'){
                myFooter();
                System.out.println(); 
                break;
            }
        }
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
   
    public static String myFactorial(int n) {
        return myFactorial(n, 300);
    }

    private static String myFactorial(int n, int maxSize) {
        int res[] = new int[maxSize];
        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x <= n; x++) {
            res_size = multiply(x, res, res_size);
        }

        StringBuffer buff = new StringBuffer();
        for (int i = res_size - 1; i >= 0; i--) {
            buff.append(res[i]);
        }

        return buff.toString();
    }

    private static int multiply(int x, int res[], int res_size) {
        int carry = 0; 

        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; 
            carry = prod / 10;  
        }

        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }

        return res_size;
    }

    public static double mySin(double x){
        double sum = 0;
        double term = 0;
        double numerator;
        double denominator;
        double factor;
        for(int n = 0; n <= 20; n++){
            numerator = myPow(-1,n);
            denominator = Double.valueOf(myFactorial((2*n) + 1));
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
        for(int n = 0; n <= 20; n++){
            numerator = myPow(-1,n);
            denominator = Double.valueOf(myFactorial(2*n));
            factor = myPow(x, (2*n));
            term = ((numerator / denominator) * factor);
            sum = sum + term;
        }
        return sum;
    }

    public static void myHeader() {
        System.out.println("***************************");
        System.out.print("Name: Todd Childerhose \nLab number: 7\nQuestion number: 1\n");
        System.out.println("***************************");
    }

    public static void myFooter() {
        System.out.println("*** Goodbye from Todd Childerhose ***");
    }

}