package practical;

import java.util.Scanner;

public class Trigonometry {
    private static double angle;
    Scanner cin = new Scanner(System.in);

    public void setAngle(){
      
			System.out.println( "Enter the angle measurement ");
			angle = cin.nextDouble();
		
    }

    public  double sin() {
    	setAngle();
        return Math.sin(Math.toRadians(angle));
    }

    public  double cos() {
    	setAngle();
        return Math.cos(Math.toRadians(angle));
    }

    public  double tan() {
    	setAngle();
        return Math.tan(Math.toRadians(angle));
    }

    public  double degreeToRadian() {
    	setAngle();
        return Math.toRadians(angle);
    }

    public  double radianToDegree(){
    	setAngle();
        return Math.toDegrees(angle);
    }
}

