/**
 * Class Popstars: 
 * This class collects user input to populate instances
 * of the Person2 class. 
 * 
 * This class is a class that collects details of a user's
 * favourite male and female popstars and prints that information.
 * 
 * @version 1.0
 */
    import java.util.*;

public final class Popstars {


	
	
    public static void main  (String [] args) {
	    

	    
	    

	// (1) Collect details of your favourite male popstar
	// using the Scanner class and create an instance of Person2 with the 
	// the collected information
	
	Scanner scanner = new Scanner(System.in);
	    
	    Person2  malePopstar;

	   malePopstar = new Person2();
	    
	    System.out.println ("Enter the name of your favourite male popstar below: ");
	    String manswer = scanner.nextLine();
	    
	    System.out.println ("Enter the your favourite's popstars surname: ");
	    String mSurname = scanner.nextLine();
	    
	    System.out.println ("Enter the age of your favourite popstar: ");
	    int mAge = scanner.nextInt();
	    
	
	 malePopstar.setFirstName (manswer) ;
	malePopstar.setSurname (mSurname);  
         malePopstar.setGender (Person2.MALE);
	 malePopstar.setAge (mAge);   
	
	
	
	   
	    
	    
	  


	    
	
	    
	// (2) Collect details of your favourite female popstar
	// using the scanner class and create an instance of Person2 with the 
	// the collected information
	
	
           Person2  femalePopstar;
	   
	    femalePopstar = new Person2 ();


	    System.out.println("Enter the name of your favourite female popstar below: ");
	    String fanswer = scanner.next();
	    
	    System.out.println ("Enter the name of your favourite female popstars surname: ");
	    String fsurname = scanner.next ();
	    
	    System.out.println ("Enter the age of your favourite female popstar: ");
	    int fAge = scanner.nextInt();
	   
	   femalePopstar.setFirstName(fanswer);
	   femalePopstar.setSurname (fsurname);
	   femalePopstar.setAge(fAge);
	   femalePopstar.setGender (Person2.FEMALE); 
	
	   
	   System.out.println (malePopstar.toString());
	   System.out.println (femalePopstar.toString());
	   
	
	    
	    
	   
	   
	// (3) Display the details of the favourite popstars 
	

	System.out.println ("The following attributes of your favourite Male popstar" );
	System.out.println("Your favourite actor is FirstName:  " + manswer);
	System.out.println ("The surname of your favourite male popstar is " + mSurname);
	System.out.println ("The age of your favouitre male popstar is " + mAge);
	
	
	System.out.println ("The attributes of your favourite femalepopstart");
	System.out.println ("Your favourite actor's firstname is " + fsurname);
	System.out.println ("The age of your favourite female popstar " + fAge);
	


	
}	
    } // end of method main




 // end of class Popstars
