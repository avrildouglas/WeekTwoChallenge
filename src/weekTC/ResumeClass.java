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
       int edI = 0;
	   
       ArrayList<String> listExp = new ArrayList<String>();
	   int expI = 0;
	   
       ArrayList<String> listSkills = new ArrayList<String>();
	   int skI = 0;

       Scanner input = new Scanner(System.in);
         
	   System.out.println("Enter your first name: ");
	   fName = input.next();
	   System.out.println("Enter your last name: ");
	   lName = input.next();

	   do{
			System.out.println("Enter your email address: ");
			eMail = input.next();
			if (eMail == null)
				result = false;
		}while(eMail == null);
	   	
		do{
	        System.out.println("Current Education shows " + listEd);
            System.out.println("Add more details? (y/n)");
            answer = input.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("Enter Education Details: ");
                String eInput = input.nextLine();
                listEd.add(eInput);
                edI++; 
            	}           
		  } while (answer.equalsIgnoreCase("y"));

        do {
            System.out.println("Current Experience shows " + listExp);
            System.out.println("Add more details? (y/n)");
            answer = input.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("Enter Experience Details: ");
                String xInput = input.nextLine();
                listExp.add(xInput);
                expI++;       
            }   
		  } while (answer.equalsIgnoreCase("y"));
        
        do {
            System.out.println("Current Skills shows " + listSkills);
            System.out.println("Add more details? (y/n)");
            answer = input.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("Enter Skills Details: ");
                String sInput = input.nextLine();
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
        for (int i = 0; i < listExp.size(); i++){
           	System.out.print(listExp.get(i)+"\n");
        }

        System.out.println("\r\t\n\tSkills");
        for (int i = 0; i < listSkills.size(); i++){
           	System.out.print(listSkills.get(i));
        }

  }
}