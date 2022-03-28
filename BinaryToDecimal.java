public class BinaryToDecimal {
    private int[] binaryArray;

    public BinaryToDecimal(){

    }
    public BinaryToDecimal(int[] binary){
        binaryArray = binary;
        
    }
    public void displayArray(){
        System.out.print("[");
        for(int i=0; i<binaryArray.length; i++){
            System.out.print(i);
        }
        System.out.print("]");
    }
    public double getDecimalValue(){
        double result = 0;
        for(int i=binaryArray.length; i>0; i--){
            result += (binaryArray[binaryArray.length - i] * MyMethod.myPow(2, (binaryArray.length - i)));
        }
        return result;
    }

    public void doubleTheSizeZeroPadding(){
        int[] arrB = new int[2 * binaryArray.length]; //Declaring a new array arrB with twice the size of binaryArray
        System.arraycopy(binaryArray, 0, arrB, 0, binaryArray.length);  //copying binaryArray to arrB
        binaryArray = arrB; 
        arrB = null; 
    }
    public void shuffleArray(){
        int j; int temp;
        for(int i = 0; i<binaryArray.length; i++) {
            j = (int)(Math.random()*binaryArray.length); //Swapping elements
            temp = binaryArray[i];
            binaryArray[i]= binaryArray[j]; 
            binaryArray[j]=temp;
        }
    }
    public int[] reverseArray(){
        int[] arrB = new int[4];
        for(int i = binaryArray.length - 1; i >= 0; i--) {
            arrB[binaryArray.length - i] = binaryArray[i];
        }
        return arrB;
    }
    public void shiftRight(){
        int temp = binaryArray[binaryArray.length - 1];//setting aside the last element 
        for(int i = binaryArray.length; i>0; i--) {
            binaryArray[i]= binaryArray[i-1]; }
            binaryArray[0]=temp;
    }
}
