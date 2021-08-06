package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int list : intList) {
            if (list > 0) {
                if (list % 2 == 0) {
                    newList.add(list);
                }
            }
        }
        Collections.sort(newList);
        for (int list : newList) {
            System.out.println(list);
        }
    }
}
