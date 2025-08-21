package array;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 20, 30, 40};

        maximumElement(arr);
        int sum = sumOfElements(arr);
        System.out.println("Sum of array elements: " + sum);

        reverseArray(arr);
        printArrays(arr);
        System.out.println();

        countEvenNumbers(arr);
    }

    static void printArrays(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void maximumElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    static void countEvenNumbers(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The count of odd numbers in array " + oddCount);
        System.out.println("The count of even  numbers in array " + evenCount);
    }

    static void secondLargestElements(int[] arr) {
//        int max = arr[0];
//        int secondMax = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max && arr[i] != max) {
//                secondMax = arr[i];
//            }
//        }
//        return secondMax;
    }

}
