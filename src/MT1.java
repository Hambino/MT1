
import java.util.Scanner;


public class MT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        // Declare variables
       // int int0=0, int1=0, int2=0;
       // double real0=0.0, real1=0.0, real2=0.0;
        String string0="", string1="", string2="";
        boolean p = true, q = true, r = false;
 
 
            // Open input stream
            Scanner scan = new Scanner(System.in);
 
             // Read contents
           System.out.print("String: ");
           string0 = scan.nextLine();
           System.out.print("String: ");
           string1 = scan.nextLine();
           System.out.print("String: ");
           string2 = scan.nextLine();
           System.out.print("What is it?: ");
           p = scan.nextBoolean();
           System.out.print("What is it?: ");
           q = scan.nextBoolean();
           System.out.print("What is it?: ");
           r = scan.nextBoolean();
           
	
           System.out.println("Java programming is " + string0.charAt(14) + string0.charAt(12) + string0.charAt(15) + string0.charAt(13));
           System.out.println(string0.charAt(1) + "," + string1.charAt(1) + "," + string2.charAt(1));
          
           boolean result = string0.equals(string2);
           System.out.println("Are they equal?: " + result);
           
           if (string1.length() < 10)
           {
        	   System.out.println("9 characters or fewer!");
           }
           if (string1.length() >=10)
           {
        	   System.out.println("10 characters or more!");
          
           }
           switch (string1)
           {
           case "Mexico City || Denver":
           		System.out.println("North America");
           	break;
           	
           case "Santiago || Lima":
          		System.out.println("South America");
          	break;
          	
           default:
        	   System.out.println("Unknown City");
        	   break;
           }
           
		} 
		
		
	

	
	}

