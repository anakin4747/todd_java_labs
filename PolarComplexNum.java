
public class PolarComplexNum {
    private static double magnitude;
    private double angle;

    public PolarComplexNum(){
        magnitude = 0;
        angle = 0;
    }

    public PolarComplexNum(double bitchMagnitude, double bitchAngle){
        magnitude = bitchMagnitude;
        angle = bitchAngle;
    }

    public double getRealValue(){
        return magnitude * MyMethod.myCos(angle / 180.00 * Math.PI);
    }

    public double getImaginaryValue(){
        return magnitude * MyMethod.mySin(angle / 180.00 * Math.PI);
    }
}