import java.util.Scanner;
import java.util.Random;

public class DemoBinaryToDecimal{
    public static void main(String[] args){

        
        MyMethod.myHeader();
        
        int[] rand = new int[4];
        for(int i = 1;i < rand.length; i++){
            rand[i] = ((int)Math.random() * 2);
        }

        BinaryToDecimal ob = new BinaryToDecimal(rand);
        ob.displayArray();
        double b_to_d = ob.getDecimalValue();
        System.out.println(b_to_d);
        ob.doubleTheSizeZeroPadding();
        ob.displayArray();
        b_to_d = ob.getDecimalValue();
        System.out.println(b_to_d);

        BinaryToDecimal ob2 = new BinaryToDecimal(ob.reverseArray());
        ob2.displayArray();
        b_to_d = ob2.getDecimalValue();
        System.out.println(b_to_d);
        ob2.shiftRight();
        b_to_d = ob2.getDecimalValue();
        System.out.println(b_to_d);
        ob2.shuffleArray();
        b_to_d = ob2.getDecimalValue();
        System.out.println(b_to_d);
    
        MyMethod.myFooter();


    }
}