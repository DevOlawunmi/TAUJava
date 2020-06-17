package caleb;

import java.util.Arrays;

public class ArraysLessons {
    public static void main(String[] args) {
        //create a new array with 8 elements
        int[]grades = new int[8];
        //Populate the array with the value 88
        Arrays.fill(grades,88);
        System.out.println(Arrays.toString(grades));
        System.out.println(grades.length);
    }
}
