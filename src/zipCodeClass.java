import java.util.Scanner;
public class zipCodeClass {
	
	
	public static void main (String args[]) {
		boolean space = false;
		boolean character = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert your zipCode");
		String temp1= sc.next();
		temp1.trim();
		
		int y = (int)(Math.random()*((10-0)+1))+0;
		char c=(char)'y';
		
		for (int i=0; i<=temp1.length(); i++) {
			
			if (temp1.valueOf(i)==" ") {
				
				space = true;

				String temp2 = temp1.substring(i++);
				String temp3 = temp1.substring(0, i);
				temp1 = temp2.concat(temp3);
				
			}
		}
			
		for (int x=0; x<=temp1.length(); x++) {
			char c1 = temp1.charAt(x);
			 if (Character.isLetter(c1)) {
				  character = true;
				temp1.replace(c1, c);
			 }
		}
			 
		if (temp1.length()==5 && space == false && character == false) {
			System.out.println("you have entered a valid ZipCoe, Thank you! " + temp1);
			
		}	 
		else  {
			System.out.println("Did you mean: "+temp1+"?");
		}
			
		}	 
	
			
		}
			
			
		
	

