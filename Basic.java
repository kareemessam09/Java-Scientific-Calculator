package practical;

import java.util.Scanner;

public class Basic {
	 Scanner input = new Scanner(System.in);
     private double num1;
     private double num2;
      double result=0;
      int flag=0,choice;
      public void setnum1() {
	        System.out.print("Enter first number: ");
	        num1 = input.nextDouble();
	        }
      
      public void setnum2() {
      System.out.print("Enter second number: ");
      num2 = input.nextDouble();
      }
      public void test() {
    	  while(choice != 6) {
    	  System.out.println("Hello!");
    	  System.out.println("what do you want to do ?" +"(pleas,choose a number)");
    	  System.out.println("1: Add(+)");
    	  System.out.println("2: Subtract(-)");
			System.out.println("3: Multiply(*)");
			System.out.println("4: Divide(/)");
			System.out.println("5: Modulus(%)");
			System.out.println("6: Quit");
			choice = input.nextInt();
			
			if(choice == 1) {
				setnum1();
				setnum2();
				System.out.println(num1 +" + "+num2+ " " + " = " + (num1+num2));
				 }
			else if(choice == 2) {
				setnum1();
				setnum2();
				System.out.println(num1 +" - "+num2+ " " + " = " + (num1-num2));
				 }
			 else if(choice == 3) {
					setnum1();
					setnum2();
					System.out.println(num1 + " * " +num2+ " " + " = "+ (num1*num2));
				 }
			 else if(choice == 4) {
					setnum1();
					setnum2();
					if(num2 == 0)
						System.out.println("error : You cannot divide by zero");
					else
					System.out.println(num1 + " / " +num2+ " " + " = "+ (num1/num2));
				 }
			 else if(choice == 5) {
					setnum1();
					setnum2();
					System.out.println(num1 + " % " +num2+ " " + " = "+ (num1%num2));
				 }
    	 
			}
    	  System.out.println("Have a nice day!");
      }
}
