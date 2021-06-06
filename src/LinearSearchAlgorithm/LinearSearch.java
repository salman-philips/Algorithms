package LinearSearchAlgorithm;

import java.util.Scanner;

public class LinearSearch {

    public static void showElements(int array[]) {
        System.out.println("\n entered elements are");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] readElements() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the row");
        int n = in.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element");
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int linearSearch(int array[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the key element");
        int key=in.nextInt();
        for (int i = 0; i < array.length; i++) {
           if(array[i]==key) return i+1;
        }
        return -1;
    }

    public static void main(String args[]) {

        int[] array = readElements();
        showElements(array);
        int answer=linearSearch(array);
        if(answer>0) System.out.println("Element found at "+answer+" position");
        else System.out.println("Element not found");
        }

}
