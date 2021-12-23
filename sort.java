import java.util.*;

public class sort {
    // Initializing the bucket
    private static final ArrayList[] bucket = new ArrayList[10];

    // methods to perform each searching or sorting function

    // selection_sort method
    public static void selection_sort(ArrayList<Integer> sortNumb, String nm) {
        for (int n = 0; n < sortNumb.size() - 1; n++) { // comparing the value size of two numbers
            int smallest = n;
            for (int a = n + 1; a < sortNumb.size(); a++) {
                if (sortNumb.get(a) < sortNumb.get(smallest)) {
                    smallest = a;
                }
            }
            // swapping values of various indexes
            int swap = sortNumb.get(n);
            sortNumb.set(n, sortNumb.get(smallest));
            sortNumb.set(smallest, swap);
        }
        System.out.println(nm.toUpperCase() + " your sorted values are " + sortNumb);// print our the sorted arraylist
    }

    // A quick_sort method
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> whole) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int center;

        if (whole.size() == 1) {
            return whole;
        } else {
            center = whole.size() / 2;
            for (int i = 0; i < center; i++) {
                left.add(whole.get(i));
            }

            for (int i = center; i < whole.size(); i++) {
                right.add(whole.get(i));
            }

            mergeSort(left);
            mergeSort(right);

            merge(left, right, whole);
        }
        return whole;
    }

    private static void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }

        ArrayList<Integer> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }

        for (int i = restIndex; i < rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }

    // shell_sort method
    public static void shell_sort(ArrayList<Integer> sortNumb, String nm) {
        int increment = sortNumb.size() / 2;
        while (increment > 0) {
            for (int n = increment; n < sortNumb.size(); n++) {
                int a = n;
                int swap = sortNumb.get(n);
                while (a >= increment && sortNumb.get(a -
                        increment) > swap) {
                    sortNumb.set(a, sortNumb.get(a - increment));
                    a = a - increment;
                }
                sortNumb.set(a, swap);
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
        System.out.println(nm.toUpperCase() + " your sorted values are " + sortNumb);// printing out the arraylist
    }

    // insertion_sort method
    public static void insertion_sort(ArrayList<Integer> sortNumb, String nm) {
        for (int n = 1; n < sortNumb.size(); ++n) {
            int a = n;
            while (a > 0 && sortNumb.get(a) < sortNumb.get(a -
                    1)) {
                // swappiing values
                int swap = sortNumb.get(a);
                sortNumb.set(a, sortNumb.get(a - 1));
                sortNumb.set((a - 1), swap);
                --a;
            }
        }
        System.out.println(nm.toUpperCase() + " your sorted values are " + sortNumb);// printing out the arraylist
    }

    // nearly_sort method
    public static void nearly_sort(ArrayList<Integer> sortNumb, String nm) {
        for (int a = 1; a < sortNumb.size(); a++) {
            int swap = sortNumb.get(a);
            int n = a - 1;
            while ((n > -1) && (swap < sortNumb.get(n))) {
                sortNumb.set(n + 1, sortNumb.get(n));
                n--;
            }
            sortNumb.set(n + 1, swap);
        }
        System.out.println(nm.toUpperCase() + " your sorted values are " + sortNumb);
    }

    // radix sort
    public static void radixSort(ArrayList<Integer> x) {
        for (int i = 0; i < 10; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        int power = 1;
        for (int j = 0; j < 3; j++) {

            for (int k = 0; k < x.size(); k++) {
                bucket[(x.get(k) / power) % 10].add(x.get(k));
            }
            x.clear();

            for (int l = 0; l < 10; l++) {
                x.addAll(bucket[l]);
                bucket[l].clear();
            }

            power = power * 10;
        }

    }

}
