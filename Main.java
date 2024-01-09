package practical;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Main {

	public static boolean options() throws IOException {	
		int op =0, cur=0 , n;

		
		
		Matrix matrixObj = new Matrix(); //#1
        Basic basicObj = new Basic ();   //#2
        Trigonometry trigObj = new Trigonometry();  //#3
        baseConvertor baseConvObj = new baseConvertor(); //#4
		SpecialCalculations SpecialCalcObj = new SpecialCalculations(); //#5
        FunctionAnalysis functionObj = new FunctionAnalysis();//6
		UnitConverter unitConvObj = new UnitConverter();  //#7
		
		 
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("1.Matrix");
	    System.out.println("2.Basic operations");
	    System.out.println("3.Trignometric functions");
	    System.out.println("4.Base converter");
	    System.out.println("5.SpecialCalculations");
	    System.out.println("6.FunctionAnalysis");
	    System.out.println("7.UnitConverter");
	    System.out.println("8.Shapes");
	    System.out.println("9.quit \n");
	    System.out.print("Choose Option: ");
		
        		  
		op = sc.nextInt();		  
		switch(op) {
			case 1: cur = 1;
				break;
			case 2: cur =2;
				break;
			case 3: cur = 3;
				break;
			case 4: cur = 4;
				break;
			case 5: cur = 5;
				break;
			case 6: cur = 6;
				break;
			case 7: cur = 7;
				break;
			case 8: cur = 8;
				break;
			case 9:  System.out.println("Have a nice day!");return false;
				
			default:System.out.println("Choose from 1 --> 9");
					System.out.println("------------------------------------------------------");
					System.out.println();
					return true;
		}

//////////////////matrix
		
		if(cur == 1) {  
			System.out.println("1.Transpose");
			System.out.println("2.Inverse");
			System.out.println("3.Determinant");
			System.out.println("4.Add Two Matrices");
			System.out.println("5.subtract Two Matrices");
			System.out.println("6.Multiply two Matrices");
			n = sc.nextInt();
			if ( n == 1 ) {  
				matrixObj.setMatrix();
				matrixObj.matrixTranspose();
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if ( n == 2) {
				matrixObj.setMatrix();
				matrixObj.inverse();
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if ( n == 3) {
				matrixObj.setMatrix();
				matrixObj.determinant();
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if ( n == 4) {
				matrixObj.addTwoMatrices();
				System.out.println("------------------------------------------------------");
				System.out.println();
			}else if ( n == 5) {
				matrixObj.susbstractTwoMatrices();
				System.out.println("------------------------------------------------------");
				System.out.println();
			}else if ( n == 6) {
				matrixObj.multiplyTwoMatrices();
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else{
				System.out.println( "Wrong data, please pick an option from above.");
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
		}

		
//////////////////basic
		else if(cur == 2) {  
			basicObj.test();
			System.out.println("------------------------------------------------------");
			System.out.println();
		}

////////////////////trig
		else if(cur == 3) { 
			System.out.println("1.Sine");
			System.out.println("2.Cosine");
			System.out.println("3.Tangent");
			System.out.println("4.Degree To Radian");
			System.out.println("5.Radian To Degree");

			
			n = sc.nextInt();
			if ( n == 1 ) {
				System.out.println( trigObj.sin());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if ( n == 2) {
				System.out.println( trigObj.cos());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if ( n == 3) {
				System.out.println( trigObj.tan());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if ( n == 4) {
				System.out.println( trigObj.degreeToRadian());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if ( n == 5) {
				System.out.println( trigObj.radianToDegree());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else{
				System.out.println( "Wrong data, please pick an option from above.");
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
		}

		
////////////////////Base converter
		
		else if(cur==4){  
			System.out.println("1.Base to Decimal");
			System.out.println("2.Decimal to Base");
			System.out.println("3.Base to Base");
		
			n = sc.nextInt();
			if(n==1){
				baseConvObj.setValueN();
				baseConvObj.setFromBase();
				System.out.println( "Value in Decimal= " + baseConvObj.baseToDecimal() );
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if(n==2){
				baseConvObj.setNumberN();
				baseConvObj.setToBase();
				System.out.println( "Value in base " + baseConvObj.toBase + " = " + baseConvObj.decimalToBase( baseConvObj.numberN ) );
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if(n==3){
				baseConvObj.setValueN();
				baseConvObj.setFromBase();
				baseConvObj.setToBase();
				System.out.println( "Value in base " + baseConvObj.toBase + " = " + baseConvObj.baseToBase () );
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else{
				System.out.println( "Wrong data, please pick an option from above.");
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
		}


/////////////Special Calculations
		
		else if(cur==5){ 
			System.out.println("1.Factorial"); 
			System.out.println("2.SquareRoot"); 
			System.out.println("3.CubicRoot"); 
			System.out.println("4.AbsoluteValue"); 
			System.out.println("5.Log"); 
			System.out.println("6.Modulus"); 
			System.out.println("7.Power"); 
		
			n = sc.nextInt();
			if(n==1){
				SpecialCalcObj.setNumber();
				System.out.println( SpecialCalcObj.factorial(SpecialCalcObj.getNumber()));
				System.out.println("------------------------------------------------------");
				System.out.println();
				
			}
			else if(n==2){
				SpecialCalcObj.setNumber();
				System.out.println( SpecialCalcObj.squareRoot());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if(n==3){
				SpecialCalcObj.setNumber();
				System.out.println( SpecialCalcObj.cubicRoot());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if(n==4){
				SpecialCalcObj.setNumber();
				System.out.println( SpecialCalcObj.absoluteValue());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if(n==5){
				SpecialCalcObj.setNumber();
				System.out.println( SpecialCalcObj.log());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if(n==6){
				SpecialCalcObj.setNumber();
				System.out.println( SpecialCalcObj.naturalLog());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else if(n==7){
				SpecialCalcObj.setNumber();
				System.out.println( SpecialCalcObj.modulus());
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
			else{
				System.out.println( "Wrong data, please pick an option from above.");
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
		}


		
//Function analysis
		else if(cur==6){ 
			System.out.println("1.Linear Function"); 
			System.out.println("2.Quadratic Function"); 

			n = sc.nextInt();
			if(n==1){
				
				functionObj.setCoeficients();
				System.out.println("Root: Not applicable (linear function)");

				System.out.println("Domain: All real numbers (R)");
				System.out.println("Range: All real numbers (R)");

				functionObj.drawLinearGraph();
				System.out.println("------------------------------------------------------");
				System.out.println();

			}
			else if(n==2){
				functionObj.setCoeficients();
				double[] roots = functionObj.findRoots();
				System.out.println("Roots: " + roots[0] + ", " + roots[1]);

				System.out.println("Domain: All real numbers (R)");
				System.out.println("Range: [" + functionObj.findMinimum() + ", +∞)");
				System.out.println("------------------------------------------------------");
				System.out.println();
				
			}
		}
	
		
///////////////unit converter
		else if(cur==7){ 
			System.out.println("1.Length"); 
			System.out.println("2.Temperature"); 
			System.out.println("3.Speed"); 
			System.out.println("4.Mass"); 

			n = sc.nextInt();
			if ( n == 1 ) {
				unitConvObj.setLength();
				System.out.println("1.MeterToCm\n"+ "2.CmToMetre" ); 
				int innerOption;
				innerOption = sc.nextInt();
				if( innerOption == 1){
					unitConvObj.MeterToCm(); 
					System.out.println("------------------------------------------------------");
					System.out.println();
					
				}
				else{
					unitConvObj.CmToM();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
			}

			else if ( n == 2) {
				System.out.println("1.CelsiusToF\n"+ "2.CelsiusToK\n" + "3.fahrenheitToC\n"+ "4.fahrenheitToK\n" +"5.KelvinToC\n"+ "6.KelvinToF" ); 
				
				int innerOption;
				innerOption = sc.nextInt();
				if( innerOption == 1){
					unitConvObj.setDegreeInCelsius();
					unitConvObj.CelsiusToF();
					System.out.println("------------------------------------------------------");
					System.out.println();
					
				}
				else if( innerOption == 2) {
					unitConvObj.setDegreeInCelsius();
					unitConvObj.CelsiusToK();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 3) {
					unitConvObj.setFahrenheit();
					unitConvObj.fahrenheitToC();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 4) {
					unitConvObj.setFahrenheit();
					unitConvObj.fahrenheitToK();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 5) {
					unitConvObj.setKelvin();
					unitConvObj.KelvinToC();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else {
					unitConvObj.setKelvin();
					unitConvObj.KelvinToF();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
			}
			else if ( n == 3) {
				System.out.println("1.MperSecToKMperh\n"+ "2.KMperhToMperSec\n" + "3.MileperHToMperSec\n"+ "4.MileperHToKMperh\n"); 
				int innerOption;
				innerOption = sc.nextInt();
				if( innerOption == 1){
					unitConvObj.setMperSec();
					unitConvObj.MperSecToKMperh();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 2) {
					unitConvObj.setKMperH();
					unitConvObj.KMperhToMperSec();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 3) {
					unitConvObj.setMileperH();
					unitConvObj.MileperHToMperSec();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else{
					unitConvObj.setMileperH();
					unitConvObj.MileperHToKMperh();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
			}
			else if ( n == 4) {
				System.out.println("1.ToneToKg\n"+ "2.KgToTone\n" + "3.KgToGram\n"+ "4.GramToKg\n"+ "5.PoundToGram\n"); 
				int innerOption;
				innerOption = sc.nextInt();
				if( innerOption == 1){
					unitConvObj.setTone();
					unitConvObj.ToneToKg();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 2) {
					unitConvObj.setKilogram();
					unitConvObj.KgToTone();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 3) {
					unitConvObj.setKilogram();
					unitConvObj.KgToGram();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else if( innerOption == 4) {
					unitConvObj.setGram();
					unitConvObj.GramToKg();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				else{
					unitConvObj.setPound();
					unitConvObj.PoundToGram();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
			}
			else{
				System.out.println( "Wrong data, please pick an option from above.");
				System.out.println("------------------------------------------------------");
				System.out.println();
			}
		}
		
			
///////////////////////shape			
		else if(cur == 8) {
				System.out.println("please,choose a shape : ");
				System.out.println("1.Circle");
				System.out.println("2.Square");
				System.out.println("3.Rectangle");
				
				n = sc.nextInt();
				if(n == 1) {
					Circle c1 = new Circle();
					System.out.println("enter radius ");
					c1.setRadius();
					c1.calcAreas();
					c1.calcPer();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				if(n == 2) {
					Square s1 = new Square();
					System.out.println("enter side ");
					s1.setSide();
					s1.calcAreas();
					s1.calcPer();
					System.out.println("------------------------------------------------------");
					System.out.println();
				}
				if(n == 3) {
					Rectangle R1 = new Rectangle();
					System.out.println("enter length ");
					R1.setlength();
					System.out.println("enter width ");
					R1.setWidth();
					R1.calcAreas();
					R1.calcPer();
					System.out.println("------------------------------------------------------");
					System.out.println();
					}
			}
		
	    return true;	
	}

	
	public static void main(String[] args) throws IOException {
		File file = new File("output.txt");
		FileOutputStream f = new FileOutputStream(file); 
		System.setOut(new PrintStream(f));

		while (options()){
            options();
		}    
	
	}

}

