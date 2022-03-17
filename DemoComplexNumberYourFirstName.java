
import java.util.Scanner;

public class DemoComplexNumberYourFirstName {

    public static RecComplexNum addComplexNumbers(RecComplexNum x, RecComplexNum y) {
        RecComplexNum res = new RecComplexNum(x.getReal() + y.getReal(), x.getImaginary() + y.getImaginary());
        return res; 
    }

    public static RecComplexNum subtractComplexNumbers(RecComplexNum x, RecComplexNum y) {
        RecComplexNum res = new RecComplexNum(x.getReal() - y.getReal(), x.getImaginary() - y.getImaginary());
        return res; 
    }

    public static RecComplexNum divideComplexNumbers(RecComplexNum x, RecComplexNum y) {
        double finalMag = x.getMagnitude() / y.getMagnitude();
        double finalAngle = x.getAngle() - y.getAngle();
        PolarComplexNum pc = new PolarComplexNum(finalMag,finalAngle); 
        RecComplexNum res = new RecComplexNum(pc.getRealValue(), pc.getImaginaryValue());
        return res; 
    }

    public static RecComplexNum multiplyComplexNumbers(RecComplexNum x, RecComplexNum y) {
        double finalMag = x.getMagnitude() * y.getMagnitude();
        double finalAngle = x.getAngle() + y.getAngle();
        PolarComplexNum pc = new PolarComplexNum(finalMag,finalAngle);
        RecComplexNum res = new RecComplexNum(pc.getRealValue(), pc.getImaginaryValue());
        return res; 
    }

    public static void main(String[] args){
        System.out.println("\n");
        MyMethod.myHeader();
        RecComplexNum rec1 = new RecComplexNum(1, -2);
        RecComplexNum rec2 = new RecComplexNum(-3, 4);
        RecComplexNum result = new RecComplexNum();

        Scanner input = new Scanner(System.in);
        System.out.print("You have entered the following two complex numbers x and y:\nx = ");
        rec1.displayRecForm();
        System.out.print(", Magnitude: ");
        System.out.printf("%.2f", rec1.getMagnitude()); 
        System.out.print(", Angle: "); 
        System.out.printf("%.2f", rec1.getAngle()); 
        System.out.print(" degrees\ny = ");
        
        rec2.displayRecForm();
        System.out.print(", Magnitude: ");
        System.out.printf("%.2f", rec2.getMagnitude()); 
        System.out.print(", Angle: "); 
        System.out.printf("%.2f", rec2.getAngle()); 
        System.out.println(" degrees\n");

        System.out.print("Complex Number Calculator:");
        while(true){
            System.out.println("\n==================\na: Addition\nb: Subtraction\nc: Multiplication\nd: Devision\ne: exit\n==================");
            System.out.print("Enter your choice: ");
            char choice = input.next().charAt(0);
            switch (choice){
                case 'a':
                    result = addComplexNumbers(rec1, rec2);
                    System.out.print("x + y = ");
                    result.displayRecForm();
                    System.out.print(", Magnitude: ");
                    System.out.printf("%.2f", result.getMagnitude()); 
                    System.out.print(", Angle: ");
                    System.out.printf("%.2f", result.getAngle());
                    System.out.print(" degrees"); 
                    break;
                case 'b':
                    result = subtractComplexNumbers(rec1, rec2);
                    System.out.print("x - y = ");
                    result.displayRecForm();
                    System.out.print(", Magnitude: ");
                    System.out.printf("%.2f", result.getMagnitude()); 
                    System.out.print(", Angle: ");
                    System.out.printf("%.2f", result.getAngle());
                    System.out.print(" degrees"); 
                    break;
                case 'c':
                    result = multiplyComplexNumbers(rec1, rec2);
                    System.out.print("x * y = ");
                    result.displayRecForm();
                    System.out.print(", Magnitude: ");
                    System.out.printf("%.2f", result.getMagnitude()); 
                    System.out.print(", Angle: ");
                    System.out.printf("%.2f", result.getAngle());
                    System.out.print(" degrees"); 
                    break;
                case 'd':
                    result = divideComplexNumbers(rec1, rec2);
                    System.out.print("x / y = ");
                    result.displayRecForm();
                    System.out.print(", Magnitude: ");
                    System.out.printf("%.2f", result.getMagnitude()); 
                    System.out.print(", Angle: ");
                    System.out.printf("%.2f", result.getAngle());
                    System.out.print(" degrees"); 
                    break;
                case 'e':
                    break;
                default:
                    System.out.print("Invalid Choice!");
            }
            if(choice == 'e'){
                MyMethod.myFooter();
                System.out.println(); 
                break;
            }
        }
    }

} 