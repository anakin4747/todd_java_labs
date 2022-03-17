
public class RecComplexNum {
    private double real;
    private double imaginary;

    public RecComplexNum(){
        real = 0;
        imaginary = 0;
    }
    public RecComplexNum(double bitchReal, double bitchImaginary){
        real = bitchReal;
        imaginary = bitchImaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public double getMagnitude(){
        return Math.sqrt(MyMethod.myPow(real,2) + MyMethod.myPow(imaginary, 2));
    }
    public double getAngle(){
        return Math.toDegrees(Math.atan2(imaginary, real));
    }
    public void displayRecForm(){

        System.out.printf("%.2f", real);
        if(imaginary < 0){System.out.print(" - ");} else {System.out.print(" + ");}
        System.out.printf("%.2f", Math.abs(imaginary));
        System.out.print("j");    
    }
}
