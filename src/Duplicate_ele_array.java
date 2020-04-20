import java.util.HashSet;
import java.util.Scanner;

public class Duplicate_ele_array {
    public static void duplicate(int[] array){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    set.add(array[i]);
                }
            }
        }
        for (int a : set) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] myArray = {2, 5, 6, 4, 1, 2, 6, 7, 1, 3, 4};
        System.out.print("Duplicates --> ");
        duplicate(myArray);


    }
}
