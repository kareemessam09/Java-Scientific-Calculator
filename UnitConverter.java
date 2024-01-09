package practical;
import java.util.Scanner;


public class UnitConverter {
	// Length
	private double Length;
	
	public UnitConverter() {
		
	}
	public void setLength() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter the length value: ");
        Length = cin.nextDouble();
	}
	public double MeterToCm() {
		System.out.println("Length in CM = " + (Length*100));
		return Length;	
	}
	public double CmToM() {
		System.out.println("Length in Meter = " + (Length/100));
		return Length;	
	}


	// Temperature
	public double DegreeInCelsius;
	public double Fahrenheit;
	public double Kelvin;

	public void setDegreeInCelsius() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter degree in celsius: ");
        DegreeInCelsius = cin.nextDouble();
	}
	public void setFahrenheit() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter degree in Fahrenheit ");
        Fahrenheit = cin.nextDouble();
	}
	public void setKelvin() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter degree in Kelvin ");
        Kelvin = cin.nextDouble();
	}

	public double CelsiusToF() {
		System.out.println("Temperature in Fahrenheit= " + (DegreeInCelsius * 9/5) + 32);
		return Fahrenheit;	
	}
	public double fahrenheitToC() {
		System.out.println("Temperature in Degree Celsius= " + (Fahrenheit - 32) * 5/9);
		return DegreeInCelsius;
	}
	public double fahrenheitToK() {
		System.out.println("Temperature in Kelvin= " + (Fahrenheit -32) * 5/9 + 273.15 );
		return Kelvin;
	}
	public double KelvinToC() {
		System.out.println("Temperature in Degree Celsius= " + (Kelvin - 273.15 ));
		return DegreeInCelsius;
	}
	public double KelvinToF() {
		System.out.println("Temperature in Fahrenheit= " + ((Kelvin - 273.15)* 9/5) + 32);
		return Fahrenheit;	
	}
	public double CelsiusToK() {
		System.out.println("Temperature in Kelvin= " + (DegreeInCelsius+273.15));
		return Kelvin;
		
	}
	

	// Speed
	public double MperSec;
	public double KMperH;
	public double MileperH;
	
	public void setMperSec() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter Speed in Meter Per Sec ");
        MperSec = cin.nextDouble();
	}
	public void setKMperH() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter Speed in Kilo-Meter Per Hour ");
        KMperH = cin.nextDouble();
	}
	public void setMileperH() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter Speed in Mile Per Hour ");
        MileperH = cin.nextDouble();
	}
	public double MperSecToKMperh() {
		System.out.println("Speed in KM per Hour= " + MperSec*3.6);
		return KMperH;
	}
	public double KMperhToMperSec() {
		System.out.println("Speed in Meter per Sec= " + KMperH/3.6);
		return KMperH;
	}
	public double MileperHToMperSec() {
		System.out.println("Speed in Meter per Sec= " + MileperH/2.237);
		return MperSec;	
	}
	public double MileperHToKMperh() {
		System.out.println("Speed in KM per Hour= " + (MileperH*1.609));
		return KMperH;	
	}
	
	
	// Mass
	public double Gram;
	public double Kilogram;
	public double Tone;
	public double Pound;
	
	public void setGram() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter Mass in Gram: ");
        Gram = cin.nextDouble();
	}
	public void setKilogram() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter Mass in Kilogram: ");
        Kilogram = cin.nextDouble();
	}
	public void setTone() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter Mass in Tone: ");
        Tone = cin.nextDouble();
	}
	public void setPound() {
		Scanner cin= new Scanner(System.in);
        System.out.println( "Enter Mass in Pound: ");
        Pound = cin.nextDouble();
	}
	public double ToneToKg() {
		System.out.println("Mass in Kilogram= " + Tone*1000);
		return Kilogram;
	}
	public double KgToTone() {
		System.out.println("Mass in Tone= " + Kilogram/1000);
		return Tone;
	}
	public double KgToGram() {
		System.out.println("Mass in Gram= " + Kilogram*1000);
		return Gram;
	}
	public double GramToKg() {
		System.out.println("Mass in Kilogram= " + Gram/1000);
		return Kilogram;
	}
	public double PoundToGram() {
		System.out.println("Mass in Gram= " + Pound*453.6);
		return Gram;
	}
}