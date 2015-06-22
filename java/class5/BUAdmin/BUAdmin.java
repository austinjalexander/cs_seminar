// run using make

public class BUAdmin {

    public static void main(String[] args) {
        
        System.out.println("\n\t***BU ADMIN***\n");
        
        // INSTANTIATE NEW PERSON OBJECTS
        Person person1 = new Person("U23452323", "Pethe", "Nathan");
        
        Person person2 = new Person("U90238343", "Goldman", "Sara");
        
        // CALL METHODS ON OBJECTS
        person1.display();
        person2.display();
        
    }
    
    
}