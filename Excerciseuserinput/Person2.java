/**
 * <p>The Person2 class provides a simple representation of 
 * a person, but also includes mutator methods and a default constructor.</p> 
 *
 * <p> An instance of Person2 can store information about a person,
 * including that person's name (first and surnames), his/her age
 * and gender.
 * </p>
 *
 * @author Michael Hoffmann
 * @version 1.0.1, Sept2007
 */


public class Person2 {

    //
    /* Attribute Declarations */
    //

    /**
     *
     */

    /** 
     * Indicates that the gender is unknown.
     */
    public static final int UNKNOWN = 0;

    /** 
     * Indicates a <em>male</em> person.
     */
    public static final int MALE = 1;

    /** 
     * Indicates a <em>female</em> person.
     */
    public static final int FEMALE = 2;


    /** Specifies the first name of the person.
     *
     */
    private String firstName;

    /** Specifies the surname of the person.
     */
    private String surname;

    /** Specifies the age of the person, in
     *  the number of years of age (whole number of years)
     */
    private int age;


    /** This attribute indicates whether the person is 
     *  male or female.
     */
    private int gender;


    //
    /* Constructor Declarations */
    //


    /**
     * Creates a default instance of Person2 with default values for the 
     * first name ("N/A"), surname ("N/A"), age (0) and gender (UNKNOWN)
     * of that person2.
     *
     *
     */
    public Person2 () {
	firstName = "N/A";
	surname = "N/A";
	// age = 0;
	// gender = UNKNOWN;

    } // end of default constructor


    /**
     * Creates an instance of Person2 with specified values for the 
     * first name, surname, age and gender of that person.
     *
     * @param pFirstName is the first name of the person
     * @param pSurname is the surname of the person
     * @param pAge is the age of the person, a whole number of years
     * @param pGender is a value that specifies whether the person is male
     * or female.
     *
     */

    public Person2 (String pFirstName, String pSurname, int pAge,
		   int pGender) {

	// assign argument values to instance attributes 

	firstName = pFirstName;
	surname = pSurname;
	age = pAge;
	gender = pGender;

    } // end of construnctor Person2 four parameters


    //
    /* Method Declarations */
    //

    /**
     *  This method returns the first name of the person.
     * 
     * @return the first name
     */
    public String getFirstName  () {

	 return firstName;

    } // end of method


    /**
     * This method returns the surname of the person. 
     * 
     * @return the surname
     */
    public String getSurname  () {

	 return surname;

    } // end of method


    /**
     *  This method acquires the gender information in the form
     * of a string.
     * 
     * @return the textual description of the gender 
     */
    public String getGenderName  () {

	if ( gender == Person2.MALE ) {
	    return "male";
	} else  if ( gender == Person2.FEMALE ) {
	    return "female";
	} else {
	    return "unknown"; 
	}

    } // end of method


    /**
     *  This method simply returns the numerical representation of the
     * gender of the person.
     *
     * @return  gender value
     */
    public int getGender  () {

	 return gender;

    } // end of method


    /**
     * Gets the age of the person as of their most recently passed birthday 
     *
     * @return age in number of years
     */
    public int getAge  () {

	 return age;

    } // end of method

    
    /**
     * Sets the first name of the person
     *
     * @param pFirstName is the first name of the person
     */
    public void setFirstName (String pFirstName) {

	firstName = pFirstName;

    } // end of method


    /**
     * Sets the surname of the person
     *
     * @param pSurname is the surname of the person
     */
    public void setSurname (String pSurname) {

	surname = pSurname;

    } // end of method


    /**
     * Sets the gender of the person
     *
     * @param pGender is the gender of the person
     */
    public void setGender (int pGender) {

	gender = pGender;

    } // end of method

    
    /**
     * Sets the age of the person
     *
     * @param pAge is the age of the person, in years, at his/her most
     * recent birthday.
     */
    public void setAge (int pAge) {

	age = pAge;

    } // end of method

    
    /**
     * Obtains a textual representation of the Person2 object.
     *
     * @return string representation of this instance of Person2
     */
    public String toString () {
	
	return "FirstName: " + firstName + "\nSurname: " + surname +
	    "\nAge: " + age + "\nGender: " + getGenderName () + "\n\n";
	
    } // end of toString method


} // end of class Person
