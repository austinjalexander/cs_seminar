public class Person {
    
    // INSTANCE VARIABLES
    public String buid;
    public String lastname;
    public String firstname;
    
    // CONSTRUCTORS
    public Person() {
        this.buid = "";
        this.lastname = "";
        this.firstname = "";
    }
    public Person(String buid, String lastname, String firstname) {
        this.buid = buid;
        this.lastname = lastname;
        this.firstname = firstname;
    }
    
    // METHODS
    public void display() {
        System.out.println("BUID: " + this.buid +
                           "\nLastname: " + this.lastname +
                           "\nFirstname: " + this.firstname + "\n\n");
    }
    
    
    
    
    
}