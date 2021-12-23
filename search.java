import java.util.*;

public class search {
    // binary search method
    public static void binary_search(ArrayList<Integer> sortNumb, int searchKey, String nm) {
        sort.radixSort(sortNumb);
        int left = 0;
        int right = sortNumb.size() - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (sortNumb.get(mid) < searchKey) {
                left = mid + 1;
            } else if (sortNumb.get(mid) == searchKey) {
                System.out.println(nm.toUpperCase() + " your value is located in index number " + mid);
                break;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
    }

    // linear_search method
    public static void linear_search(ArrayList<Integer> sortNumb, int searchKey, String nm) {
        for (int n = 0; n < sortNumb.size(); n++) {
            if (sortNumb.get(n) == searchKey) {
                System.out.println(nm.toUpperCase() + " your value is located in index number " + n);
            }
        }
    }
}
