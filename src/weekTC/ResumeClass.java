/**Avril Douglas
 * Java Bootcamp
 * June 2nd, 2017
 */

package weekTC;


import java.util.*;

public class ResumeClass {

    public static void main(String[] args) {
  		
       String fName, lName;
	   String eMail;
	   Boolean result;
	   String answer;;
	   
		//Declare variables for Education input
       ArrayList<String> listEd = new ArrayList<String>();
       int edI=0;
	   
       ArrayList<String> listExp = new ArrayList<String>();
	   int expI=0;
	   
       ArrayList<String> listSkills = new ArrayList<String>();
	   int skI=0;

       //Scanner input = new Scanner(System.in);
         
	   System.out.println("Enter your first name: ");
       Scanner inputFname = new Scanner(System.in);  
	   fName = inputFname.next();
	   System.out.println("Enter your last name: ");
       Scanner inputLname = new Scanner(System.in);  
	   lName = inputLname.next();

	   do{
			System.out.println("Enter your email address: ");
            Scanner inputEmail = new Scanner(System.in);  
			eMail = inputEmail.next();
			if (eMail == null)
				result = false;
		}while(eMail == null);
	   	
		do{
	        System.out.println("Current Education shows " + listEd);
            System.out.println("Add more details? (y/n)");
            Scanner inputEdr = new Scanner(System.in);  
            answer = inputEdr.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("Enter Education Details: ");
                Scanner inputEd = new Scanner(System.in);    
                String eInput = inputEd.nextLine();
                listEd.add(eInput);
                edI++; 
            	}           
		  } while (answer.equalsIgnoreCase("y"));

        do {
            System.out.println("Current Experience shows " + listExp);
            System.out.println("Add more details? (y/n)");
            Scanner inputExpr = new Scanner(System.in);  
            answer = inputExpr.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("Enter Experience Details: ");
                Scanner inputExp = new Scanner(System.in);  
                String xInput = inputExp.nextLine();
                listExp.add(xInput);
                expI++;       
            }   
		  } while (answer.equalsIgnoreCase("y"));
        
        do {
            System.out.println("Current Skills shows " + listSkills);
            System.out.println("Add more details? (y/n)");
            Scanner inputSkr = new Scanner(System.in);  
            answer = inputSkr.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("Enter Skills Details: ");
                Scanner inputSkills = new Scanner(System.in);  
                String sInput = inputSkills.nextLine();
                listSkills.add(sInput);
                skI++; 
            }   
		  } while (answer.equalsIgnoreCase("y"));
        
        //*********Output for Resume************//
        
        System.out.println(fName + "" + lName);
        System.out.println(eMail);
    	System.out.println("\r\t\n\tEducation \n");
        for (int i = 0; i < listEd.size(); i++){
           	System.out.print(listEd.get(i)+"\n");
        }

        System.out.println("\r\t\n\tExperience");
        for (int x = 0; x < listExp.size(); x++){
           	System.out.print(listExp.get(x)+"\n");
        }

        System.out.println("\r\t\n\tSkills");
        for (int y = 0; y < listSkills.size(); y++){
           	System.out.print(listSkills.get(y));
        }

  }
}