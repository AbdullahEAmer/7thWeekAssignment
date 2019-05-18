import java.util.*;
public class ZipCode {
	
	
	
	public static void main (String args[]) {
		
	     Scanner sc = new Scanner(System.in);
	     
	        System.out.println("Enter the value");
	        
	        String temp = sc.next();
	      
	        char ch1;
	     
	        List<String> L = new ArrayList<String>();
	     
	     
	        for (int i=0 ; i <= temp.length() ; i++)	{
	        	
	        	L.add(temp.valueOf(i));
	        }
	        
	        Iterator itr = L.iterator();
	        
	        
	        
	        for (int i=0 ; i <= L.size() ; i++) {
	        	
	        String s = L.get(i);
	       
	        char c1 = temp.charAt(i);
	        
	        
	        if (Character.isLetter(c1)) {
	        	System.out.println("you have entered an invalid zipCode");
	        	break;
	        } 
	        
	   /*     else if (L.get(i)== " ") {
	        	
	        	int x = L.indexOf(" ");
            	itr.remove();
            	temp.concat(L.get(i++));     
            	
            	System.out.println(L);
            	
            } */
	        
	        else if (temp.valueOf(i)==" ") {
	        	
	        	temp.concat(temp.valueOf(i++));
	        	
	        }

            else {
            	System.out.println("you have entered a worng value");
            }
            	
            
	        
           }
		         
	        }
	       
	}


