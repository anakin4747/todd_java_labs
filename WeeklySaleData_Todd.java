

public class WeeklySaleData_Todd {
    //7.a
    private double[] sale;

    //7.b
    public WeeklySaleData_Todd(){
        sale = null;
    }

    //7.c
    public WeeklySaleData_Todd(double[] saleCon){
        sale = saleCon;
    }

    //7.d
    public double getAverageSale(){
        double total = 0;
        for(int i=0; i<sale.length;i++){
            total += sale[i];
        }
        return total/sale.length;                  
    }

    //7.e
    public double getHighestSale(){
        double highest = sale[0];
        for(int i=0; i<sale.length;i++){
            if(sale[i]>highest) {highest = sale[i];}
        }
        return highest;                   
    }

    //7.f
    public double getLowestSale(){
        double lowest = sale[0];
        for(int i=0; i<sale.length; i++){
            if(sale[i]<lowest) {lowest = sale[i];}
        }
        return lowest;                   
    }

    //7.g
    public void displaySaleData(){
        System.out.print("Here is this week's sale-data...\n[");
        for(int i=0; i<sale.length; i++){
            System.out.print(sale[i]);
            if(i != (sale.length - 1)){System.out.print(", ");}
        }
        System.out.print("]");                  
    }

    //7.h
    public double getStandardDeviation(){
        double numerator = 0;
        for(int i=0; i<sale.length; i++){
            numerator += Math.pow((sale[i] - getAverageSale()), 2);
        }
        double stdDev = Math.sqrt(numerator/sale.length);
        return stdDev;
    }
}
