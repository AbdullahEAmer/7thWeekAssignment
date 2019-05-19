
import java.util.*;
public class emailCheck {
	
	public static boolean checkEmail(String tempEmail) {
		boolean x;
		String firstCheck=null;
		String secondCheck=null;
		int location=0;
		
		if (tempEmail.contains("@")) {
			location = tempEmail.indexOf("@");
			firstCheck = tempEmail.substring(location);
		}	
		else {
			x=false;
		}
		
		if (firstCheck.matches("@([\\w-]+\\.)+[com]+")) {
			
			secondCheck = tempEmail.substring(0, location);
		}
		else {
			 x = false;
			
		}
		
		if (secondCheck.isBlank()) {
			x=false;
		}
		else {
			x=true;
		}
		return x;
	}

	
	public static void main(String args[]) {

		List<String> validEmails = new ArrayList<String>();
		List<String> invalidEmails = new ArrayList<String>();
		List<String> tempEmails = new ArrayList<String>();
		
		boolean y;
		String temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PLease insert how many emails you'd like to check");		
		int choice = sc.nextInt();
		
		for (int i=0; i < choice; i++) {
			
			System.out.println("PLease insert the email to check");
		    temp = sc.next();
			tempEmails.add(temp);
			y = checkEmail(temp);
			
			if (y == true) {
				validEmails.add(temp);
			}
			else {
				invalidEmails.add(temp);
			}
				
		}
		
		
		
		for (int i=0; i<validEmails.size(); i++) {
			System.out.printf("valid emails: " + "%s ", validEmails.get(i));
		}
		
		System.out.println();
		
		
		for (int i=0; i<invalidEmails.size(); i++) {
			System.out.printf("inValid emails: " + "%s ", invalidEmails.get(i));
		}
		
	}
}
