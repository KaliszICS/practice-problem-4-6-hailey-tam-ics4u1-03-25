import java.util.Arrays;

/**
 * creates a person that is represented by their first name, last name, date of birth, ssn, and their slibings
 */
class Person{
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    /**
     * Constructs the person's first name, last name, date of birth, and ssn.
     * By default, the person's number of Siblings is set to zero and the person's array is empty
     * @param firstName a string that represents the person's first name
     * @param lastName a string that represents the person's last name
     * @param birthDay a integer that represents the person's day of birth
     * @param birthMonth a integer that represents the person's birth month
     * @param birthYear a integer that represents the year of birth 
     * @param ssn a string that represents the person's social security number
     */
    public Person(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String ssn){
        this.firstname = firstName;
        this.lastname = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    /**
     * Gets the person's first name
     * @return returns a String with the person's first name
     */
    public String getFirstname(){
        return this.firstname;
    }

    /**
     * Gets the person's last name
     * @return returns a String with the person's last name
     */
    public String getLastname(){
        return this.lastname;
    }

    /**
     * Sets the person's first name
     * @param newFirstName a string that assigns the person a new first name
     */
    public void setFirstname(String newFirstName){
        this.firstname = newFirstName;
    }

    /**
     * Sets the person's last name
     * @param newLastName a string that assigns the person a new last name
     */
    public void setLastname(String newLastName){
        this.lastname = newLastName;
    }

    /**
     * Gets the date of birth of the person
     * @return returns a string representing the date of birth in the format of day/month/year
     */
    public String getBirthday(){
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**
     * Adds a sibling to the person's array list of slibings.
     * Makes the copy of the orginal array list larger to accomadate for new slibings that are added to the end of the list
     * @param person a Person object that represents the new silbing to be added in the list
     */
    public void addSibling (Person person){
        siblings = Arrays.copyOf(this.siblings, this.siblings.length + 1);
        siblings[siblings.length - 1] = person;
        numberOfSiblings++;
    }

    /**
     * Gets the array of slibings for this person
     * @return returns an array of Person objects that represents the person's siblings
     */
    public Person[] getSiblings(){
        return siblings;
    }
}