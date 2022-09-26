import java.util.Random;
import java.util.Scanner;
public class Main {
    //Part1: method for array input by user
    public static int[] newArray(int lengthOfNewArray) {
        System.out.println("Please enter " + lengthOfNewArray + " integers");
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[lengthOfNewArray];
        for (int i = 0; i < lengthOfNewArray; i++) {
            userArray[i] = scanner.nextInt();
        }
        return userArray;
    }

    // Part2: array with random values method
    public static int[] randomArray(int lengthOfRandomArray) {
        Random random = new Random();
        int[] ranArray = new int[lengthOfRandomArray];
        for (int i = 0; i < lengthOfRandomArray; i++) {
            ranArray[i] = random.nextInt(100);
        }
        return ranArray;
    }

    // Part3: print array method
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Part4: sum of array elements
        System.out.println("Please enter the array length for your array");
        Scanner scanner = new Scanner(System.in);
        int lengthOfNewArray = scanner.nextInt();
        int[] userArray = newArray(lengthOfNewArray);
        int sum = 0;
        for (int i = 0; i < lengthOfNewArray; i++) {
            sum += userArray[i];
        }
        System.out.println("The sum of your array is " + sum);
        //Part5: largest value in an array
        System.out.println("Please enter the array length for random");
        int lengthOfRandomArray = scanner.nextInt();
        int[] ranArray = randomArray(lengthOfRandomArray);
        printArray(ranArray);
        int largestNumber = 0;
        for (int i = 0; i < lengthOfRandomArray; i++) {
            if (largestNumber < ranArray[i]) {
                largestNumber = ranArray[i];
            }

        }
        System.out.println("The largest number of random array is " + largestNumber);


    }
}