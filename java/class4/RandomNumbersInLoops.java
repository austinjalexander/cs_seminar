import java.util.Random;

public class RandomNumbersInLoops {

    public static void main (String[] args) {
        
        Random rand = new Random();
        
        int random_value = rand.nextInt(10); // [0,9]
        
        System.out.println("\nRandom value [0,9]: " + random_value);
        
        System.out.println("\n20 Random Values [1,10]:");
        System.out.print("\t");
        for (int i = 0; i < 20; i++) { // 0 .. 19   (so 20 loops total)
            random_value = (rand.nextInt(10) + 1); // [1,10]
             System.out.print(random_value + " ");
        }
        System.out.println();
    }

}

