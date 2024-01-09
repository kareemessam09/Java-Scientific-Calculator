package practical;

import java.util.Scanner;

public class baseConvertor{

    private String valueN;
    private int fromBase;
	public int toBase;
    public long numberN;

    public void setValueN(){
        Scanner cin= new Scanner(System.in);
        System.out.println( "Enter the following data : \n" + "Value to convert = ");
        valueN = cin.nextLine();
    }

    public void setNumberN(){
        Scanner cin= new Scanner(System.in);
        System.out.println( "Enter the following data : \n" + "Value to convert = ");
        numberN= cin.nextLong();
    }

    public void setFromBase(){
        Scanner cin= new Scanner(System.in);
        System.out.println( "\n" + "Base to convert from = " + "(base should be <= 36)\n");
        fromBase = cin.nextInt();
    }

    public void setToBase(){
        Scanner cin= new Scanner(System.in);
        System.out.println( "\n" + "Base to convert to = " + "(base should be <= 36)\n");
        toBase = cin.nextInt();
    }
    
    long checkIntgerOrChar( char c){ // t4of elly da5lk da int wla char
	    if( c>= '0' && c<='9') 
	    return (int) c-'0'; // minus askii bta3h
	    else
	    return (int) c-'A'+10; // 10 de bta3t 0->9 ++++ 5ly balkkk
    }

    String baseToDecimal(){                                                        // 1#first option base to decimal
	    long ans=0L, power =1L;
	    for(int i= valueN.length()-1; i>=0; --i){ // bdl ma t3ml reverse
		    ans += ( checkIntgerOrChar ( valueN.charAt(i) ) * power );
		    power*= fromBase; // update el power
	    }
	    return String.valueOf(ans);
    }
 
    String decimalToBase( long numberN ){                                        // 2#second option decimal to base
	    String all= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String ans="";
	    while( numberN > 0 ){
		    ans += all. charAt( (int) numberN % toBase ); // 34an m4 1,0 bs elly m3ak
		    numberN = numberN / toBase;             // base < 35 f htfr2 3nd kol base
	    }                      						// eh el possible outcomes
	    // reverse our ans string
        String ansRev="";
        char ch;
        for (int i=0; i<ans.length(); i++){
            ch= ans.charAt(i); //extracts each character
            ansRev= ch + ansRev; //adds each character in front of the existing string
        }
	    return ansRev;
    }
 
    String baseToBase (){        // 3#third option base to base
        return decimalToBase ( Integer.valueOf( baseToDecimal()));
    }  
}