// Programmer: Zachariah Magee
// Class: CS145 Towers of Hanoi
// Date: July 29th 2022


public class TowersOfHanoi {


    public static void main(String[] args) {
        int n = 4; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }

    // recursive method to solve the puzzle
    static void towerOfHanoi(int n, char source, char destination, char auxiliary)
    {
        if (n == 0)
        {
            return;
        }
        towerOfHanoi(n - 1, source, auxiliary, destination); // recursive call 1
        System.out.println("Move disk "+ n + " from rod " + source +" to rod " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source); // recursive call 2
    }
    // move the rods around to have it print correctly which rod the disk is being moved to
}
