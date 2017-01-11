import java.util.Scanner;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter your plan letter (A,B or C)");
        String x = in.nextLine();
        x = x.trim();
        x = x.toUpperCase();
        char y = x.charAt(0);
        
        System.out.println("Enter your number of hours worked:");
        Scanner Hours = new Scanner(System.in); 
        double h = Hours.nextDouble(); 
        h = Math.ceil(h);
       
       
        if (y == 'A')  {                    
           System.out.println("Your usage charge is for " + h);
           System.out.println("Your charges for Package A is $ " + (10 + ((h-10)*2.5))); 
           System.out.println("With Package B you would of saved $ " + (10 + ((h-10)*2.5) - ((h-20)*2.0)));
           System.out.println("With Package C you would of saved $ " + (10 + ((h-10)*2.5) - ((h-35)))); }
           
        else if (y == 'B') {
           System.out.println("Your usage charge is " + h);
           System.out.println("Your charges for Package B is $ " + (10 + ((h-20)*2.0)));
           System.out.println("With Package C you would of saved $ "  + (10 + ((h-20)*2.0) - ((h-35))));}
    
        else if (y == 'C') {     
           System.out.println("Your usage charge is " + h);
           System.out.println("Your charges for Package C is $35"); }
           
        else if  (y != 'A') {
           System.out.println("Invaild plan code " + y);}
	}

}
