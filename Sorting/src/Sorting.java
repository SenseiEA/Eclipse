import java.util.*;

public class Sorting {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums;
        char methodChoice;
        char sortPattern;
        int[] sorted;
        while (true) {

            // Ask for input numbers and verify validity
            try {
                nums = askNums();
                if (nums.length > 10)
                    throw new ArrayIndexOutOfBoundsException();
            } catch (NumberFormatException nfe) {
                System.out.println("Integers only! Try again.");
                continue;
            } catch (ArrayIndexOutOfBoundsException oub) {
                System.out.println("Max of 10 numbers only! Try again.");
                continue;
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
                continue;
            }

            while (true) {
                methodChoice = askMethod();
                if (methodChoice == 'b' || methodChoice == 'u' || methodChoice == 's' || methodChoice == 'i')
                    break;

                System.out.println("Select B, U, S, or I! Try again.");
            }

            while (true) {
                sortPattern = askPattern();
                if (sortPattern == 'a' || sortPattern == 'd')
                    break;

                System.out.println("Select A or D! Try again.");
            }

            // Bin Sort
            if (methodChoice == 'b') {
                sorted = binSort(nums, sortPattern);

            // Bubble Sort
            } else if (methodChoice == 'u') {
                sorted = bubbleSort(nums, sortPattern);

            // Selection Sort
            } else if (methodChoice == 's') {
                sorted = selectionSort(nums, sortPattern);

            // Insertion Sort
            } else {
                sorted = insertionSort(nums, sortPattern);


            } System.out.print("Sorted Values: ");
            for (int n: sorted)
                System.out.print(n+" ");

            System.out.println();
            char repeatChoice;
            while (true) {
                System.out.print("Sort again? [y/n]: ");
                repeatChoice = scanner.next().toLowerCase().charAt(0);
                if (!(repeatChoice == 'y' || repeatChoice == 'n')) {
                    System.out.println("Please enter y or n only! Try again.");
                    continue;
                }
                scanner.nextLine();
                break;
            }

            if (repeatChoice == 'n')
                break;
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    /* END OF MAIN METHOD */

    public static int[] askNums() {
        System.out.print("Input number/(s) to sort [max 10 numbers]: ");
        String[] numStr = scanner.nextLine().split(" ");
        int[] numArr = new int[numStr.length];
        for (int i = 0; i < numStr.length; i++) {
            numArr[i] = Integer.parseInt(numStr[i]);
        }
        return numArr;
    }

    public static char askMethod() {
        System.out.print("Select Sorting Method:\n\tB - Bin Sort" +
                "                               \n\tU - Bubble Sort" +
                "                               \n\tS - Selection Sort" +
                "                               \n\tI - Insertion Sort" +
                "                               \n\nInput letter of choice: ");
        char methodChoice = scanner.next().toLowerCase().charAt(0);
        return methodChoice;
    }

    public static char askPattern() {
        System.out.print("Select Sorting Arrangement\n\tA - Ascending\n\tD - Descending\n\nInput choice: ");
        char sortPattern = scanner.next().toLowerCase().charAt(0);
        return sortPattern;
    }

    public static int[] binSort(int[] nums, char sortPattern) {

        /* Limitation:
        * cannot accept 0
        * cannot accept negative integers
        * cannot accept the same multiple integers
        * */

        // determine the max value
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        int[] rawBucket = new int[max + 1];
        int[] sorted = new int[nums.length];

        // ascending
        if (sortPattern == 'a') {
            for (int i = 0; i < nums.length; i++) {
                rawBucket[nums[i]] = nums[i];
            }

            int sortArrPointer = 0;
            for (int i = 0; i < rawBucket.length; i++) {
                if (rawBucket[i] != 0) {
                    sorted[sortArrPointer] = rawBucket[i];
                    sortArrPointer++;
                }
            }


        } else {
            for (int i = (nums.length-1); i >= 0; i--) {
                rawBucket[nums[i]] = nums[i];
            }

            int sortArrPointer = 0;
            for (int i = (rawBucket.length-1); i >= 0; i--) {
                if (rawBucket[i] != 0) {
                    sorted[sortArrPointer] = rawBucket[i];
                    sortArrPointer++;
                }
            }

        } return sorted;
    }

    public static int[] bubbleSort(int[] nums, char sortPattern) {
        int temp;

        // ascending
        if (sortPattern == 'a') {
            for (int x = 0; x < nums.length; x++)
                for (int i = 0; i < (nums.length-1); i++)
                    if (nums[i+1] < nums[i]) {
                        temp = nums[i+1];
                        nums[i+1] = nums[i];
                        nums[i] = temp;
                    }

        // descending
        } else {
            for (int x = 0; x < nums.length; x++)
                for (int i = 0; i < (nums.length-1); i++)
                    if (nums[i+1] > nums[i]) {
                        temp = nums[i+1];
                        nums[i+1] = nums[i];
                        nums[i] = temp;
                    }

        } return nums;
    }

    public static int[] selectionSort(int[] nums, char sortPattern) {

        // ascending
        if (sortPattern == 'a') {
            for (int i = 0; i < nums.length; i++) {
                int idxMin = i;
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] < nums[idxMin])
                        idxMin = j;
                }
                int temp = nums[idxMin];
                nums[idxMin] = nums[i];
                nums[i] = temp;
            }

        // descending
        } else {
            for (int i = 0; i < nums.length; i++) {
                int idxMax = i;
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] > nums[idxMax])
                        idxMax = j;
                }
                int temp = nums[idxMax];
                nums[idxMax] = nums[i];
                nums[i] = temp;
            }

        } return nums;
    }

    public static int[] insertionSort(int[] nums, char sortPattern) {

        // ascending
        if (sortPattern == 'a') {
            for (int i = 1; i < nums.length; i++) {
                int current = nums[i]; 
                int j = i - 1; 
                while (j >= 0 && nums[j] > current) { 
                    nums[j+1] = nums[j];
                    j--; 
                }
                nums[j+1] = current;
            } 

        // descending
        } else {
            for (int i = 1; i < nums.length; i++) {
                int current = nums[i];
                int j = i - 1;
                while (j >= 0 && nums[j] < current) {
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1] = current;
            }

        } return nums;
    }
}