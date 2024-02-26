import java.io.OptionalDataException;
import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
//        int[] marks = new int[5];
//        marks[0] = 97; //phy
//        marks[1] = 98; //che
//        marks[2] = 88; //math
//        marks[3] = 80; //eng
//        marks[4] = 90; // computer

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // loop

//        for (int i = 0; i < 5; i++) {
//            System.out.println(marks[i]);
//        }

        //user input

//        Scanner sc = new Scanner(System.in);
//            int size = sc.nextInt();
//            int numbers[] = new int[size];
//
//        for(int i=0; i<size; i++){
//            System.out.println(numbers[i]);


//        }
//                 //reverse order  the array element
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//                //solution
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");


        }
    }

}
















