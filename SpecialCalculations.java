package practical;
import java.util.Scanner;


public class SpecialCalculations {
    private double number;
	private double dividend;
	private  double divisor;
	Scanner cin = new Scanner(System.in);
    
	public double getNumber() {
		return number;
	}
	
    public void setNumber(){
    	System.out.println( "Enter value to work on ");
			number = cin.nextDouble();
		
    }
    public void setDividend(){   
			System.out.println( "Enter dividend ");
			dividend = cin.nextDouble();
    }
    public void setDivisor(){
        
			System.out.println( "Enter divisor ");
			divisor = cin.nextDouble();
		
    }


    public double factorial(double x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public double squareRoot() {
        return Math.sqrt(number);
    }

    public double cubicRoot() {
        return Math.cbrt(number);
    }

    public double absoluteValue() {
        return Math.abs(number);
    }

    public double log() {
        return Math.log10(number);
    }

    public double naturalLog() {
        return Math.log(number);
    }
    public double modulus() {
        return dividend % divisor;
    }

}
