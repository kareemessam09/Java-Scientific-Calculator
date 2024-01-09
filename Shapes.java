package practical;

import java.util.Scanner;

public abstract class Shapes {
	public abstract void calcAreas();
	public abstract void calcPer();
}

class Circle extends Shapes
{
	double radius;
	final double pi= 3.14;
	Scanner sol = new Scanner(System.in);
	public void setRadius() {
		radius = sol.nextDouble();
	}
	public void calcAreas(){
		System.out.println("area = " + 2*pi*radius);
	}
	public void calcPer(){
		System.out.println("perimeter = " + pi*radius*radius);
	}
}

class Square extends Shapes
{
	double side;
	Scanner sol = new Scanner(System.in);
	public void setSide() {
		side = sol.nextDouble();
	}
	public void calcAreas(){
		System.out.println("area = " + side*side);
	}
	public void calcPer(){
		System.out.println("perimeter = " + side*4);
	}
}
class Rectangle extends Shapes
{
	double length;
	double width;
	Scanner sol = new Scanner(System.in);
	public void setlength() {
		length = sol.nextDouble();
	}
	public void setWidth() {
		width = sol.nextDouble();
	}
	public void calcAreas(){
		System.out.println("area = " + length*width);
	}
	public void calcPer(){
		System.out.println("perimeter = " + (length+width)*2);
	}
}