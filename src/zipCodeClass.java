import java.util.Scanner;
public class zipCodeClass {
	public static String temp1;
	
	public static void main (String args[]) {
		boolean space = false;
		boolean character = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert your zipCode");
		temp1= sc.next();
		temp1.trim();
		String suggested = null;
		
		int y = (int)(Math.random()*((10-0)+1))+0;
		char c=(char)'y';
		
		for (int i=0; i<temp1.length(); i++) {
			
			if (temp1.valueOf(i)==" ") {
				
				space = true;

				String temp2 = temp1.substring(i++);
				String temp3 = temp1.substring(0, i);
				temp1 = temp3.concat(temp2);
				suggested = temp1;
				
			}
		}
			
		for (int x=0; x<temp1.length(); x++) {
			char c1 = temp1.charAt(x);
			 if (Character.isLetter(c1)) {
				  character = true;
				temp1.replace(c1, c);
				suggested = temp1;
			 }
		}
			 
		if (temp1.length()==5 && space == false && character == false) {
			System.out.println("you have entered a valid ZipCode, Thank you! " + temp1);
			
		}	
		else if ((space == true && character == true) || (space == false && character == true) || (character == false && space == true)) {
			if (suggested.length()==5) {
			System.out.println("Did you mean: "+suggested+"?");
			}
		}
		else  {
			System.out.println("you have entered a zipCode of length more than 5");
		}
		
		
			
		}	 
	
			
		}
			
			
		
	

