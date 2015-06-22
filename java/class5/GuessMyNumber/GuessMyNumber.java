import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        
        System.out.println("\n\t<<<< GUESS MY NUMBER : THE GAME >>>>\n");
        
        Random rand = new Random();
        int random_value = rand.nextInt(20) + 1;
        
        System.out.print("\nPlease guess my number (1-20): ");
        Scanner keyboard = new Scanner(System.in);
        int user_input = keyboard.nextInt();
        
        if (user_input == random_value) {
            System.out.println("\n\tYOU DID IT!!!\n");
        }
        else {
            System.out.println("\n\tYOU'RE WRONG!!!   >:(\n");
            System.out.println("\tThe number was: " + random_value + "\n");
            
            int new_random_value = rand.nextInt(20) + 1;
            while (random_value == new_random_value) {
                new_random_value = rand.nextInt(20) + 1;
            }
            System.out.println("\tThe number was also definitely not: " + new_random_value + "\n");
        }
    }
    
    
}
