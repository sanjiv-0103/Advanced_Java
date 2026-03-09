import java.util.*;

public class TwoSum {

    public static void findPair(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair: " + arr[i] + " " + complement);
                return;
            }

            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 500, 300, 200 };

        findPair(arr, 500);
    }
}