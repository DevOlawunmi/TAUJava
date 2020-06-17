package caleb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracArrayList {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(6, 32, 31, 7, 9,91,78,87);
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
    }
}