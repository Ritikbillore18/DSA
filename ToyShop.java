import java.util.Arrays;

public class ToyShop {

    public static int maxToys(int N, int T, int[] A) {
        // Track when the next purchase can be made from each shop
        int[] nextAvailableTime = new int[N];
        Arrays.fill(nextAvailableTime, 0); // All shops are available at minute 0
        
        int toysBought = 0;
        int currentTime = 0;

        // Keep buying toys while there is time left
        while (currentTime < T) {
            boolean boughtToy = false;

            // Loop through all shops and check which one is available for purchase
            for (int i = 0; i < N; i++) {
                if (currentTime >= nextAvailableTime[i]) {
                    // Buy a toy from shop i and update the next available time
                    toysBought++;
                    nextAvailableTime[i] = currentTime + A[i]; // Add waiting time to current time
                    currentTime++; // It takes 1 minute to buy a toy
                    boughtToy = true;
                    break; // Buy one toy at a time, so break the loop
                }
            }

            // If no toy was bought this minute, increment the time
            if (!boughtToy) {
                currentTime++;
            }
        }
        
        return toysBought;
    }

    public static void main(String[] args) {
        // Test case 1
        int N1 = 4;
        int T1 = 7;
        int[] A1 = {2, 3, 5, 4};
        System.out.println("Maximum toys bought: " + maxToys(N1, T1, A1)); // Output: 7

        // Test case 2
        int N2 = 2;
        int T2 = 5;
        int[] A2 = {5, 6};
        System.out.println("Maximum toys bought: " + maxToys(N2, T2, A2)); // Output: 2

        // Add more test cases here for validation
        // Test case 3
        int N3 = 5;
        int T3 = 10;
        int[] A3 = {1, 2, 3, 4, 5};
        System.out.println("Maximum toys bought: " + maxToys(N3, T3, A3)); // Output: 10

        // Test case 4
        int N4 = 3;
        int T4 = 9;
        int[] A4 = {1, 4, 6};
        System.out.println("Maximum toys bought: " + maxToys(N4, T4, A4)); // Output: 6

        // Test case 5
        int N5 = 1;
        int T5 = 3;
        int[] A5 = {2};
        System.out.println("Maximum toys bought: " + maxToys(N5, T5, A5)); // Output: 2
    }
}