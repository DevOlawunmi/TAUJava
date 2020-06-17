package caleb;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] studentGrades = {
                {4,5,2,9,7,1,0},
                {8,4,2,6,0,3,5,12,45,56,444},
                {9,7,5,3,1,6,8},
                {23,29,32,31,87,233,99,93}
        };
        System.out.println(studentGrades[2][6]);
        System.out.println(Arrays.deepToString(studentGrades));
        System.out.println(studentGrades.length);
    }
}
