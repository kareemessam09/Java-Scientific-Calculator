package practical;

import java.util.Scanner;

public class FunctionAnalysis {
	
	private double a,b,c;
	Scanner scanner = new Scanner(System.in);
	public void setCoeficients(){
		System.out.println("Enter coefficients of the function:");
		System.out.print("Enter a: ");
		 a = scanner.nextDouble();
		System.out.print("Enter b: ");
		 b = scanner.nextDouble();
		System.out.print("Enter c : ");
		 c = scanner.nextDouble();
	}

    public  double[] findRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else {
            return new double[]{Double.NaN, Double.NaN};
        }
    }

    public  double findMinimum() {
        return -b / (2 * a);
    }

    public double getSlope(){
    	return a;
    }
    
    public  void drawLinearGraph() {
        // Draw a simple graph for linear function using text
        int scale = 10; // Scale for graph size
        for (int y = scale; y >= -scale; y--) {
            for (int x = -scale; x <= scale; x++) {
                if (x == 0 && y == 0) {
                    System.out.print("+"); // Origin
                } else if (y == (int) (a * x)) {
                    System.out.print("*"); // Plot point on the line
                } else if (x == 0) {
                    System.out.print("|"); // Y-axis
                } else if (y == 0) {
                    System.out.print("-"); // X-axis
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    

