import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("Kindly enter your name");
        Scanner name = new Scanner(System.in);
        String nm = name.nextLine();

        // selecting choice of preference
        System.out.println("Please which kind of operation do you prefer to do: Kindly press 1: Sorting  2: Searching");
        Scanner operation = new Scanner(System.in);
        int Opera = operation.nextInt();

        System.out.println("How many values do you plan to enter");
        Scanner numb = new Scanner(System.in);
        int number = numb.nextInt();

        System.out.println("Kindly enter your values");
        ArrayList<Integer> sortNumb = new ArrayList<Integer>();
        // looping the number of times the user intends to insert a number
        for (int i = 0; i < number; i++) {
            int increase = i + 1;
            Scanner sortNumbers = new Scanner(System.in);
            System.out.println("Number " + increase + " ");
            sortNumb.add(sortNumbers.nextInt());
        }

        if (Opera == 1) {

            // selecting the sorting option
            System.out.println(
                    "Select the sorting option you desire: 1. selection sort, 2. insertion sort, 3. nearly sorted, 4. shell sort, 5. Merge sort, 6. Radix sort");
            Scanner sortingType = new Scanner(System.in);
            int switchType = sortingType.nextInt();

            // using the switch case
            switch (switchType) {
                case 1:
                    sort.selection_sort(sortNumb, nm);
                    break;

                case 2:
                    sort.insertion_sort(sortNumb, nm);
                    break;

                case 3:
                    sort.nearly_sort(sortNumb, nm);
                    break;

                case 4:
                    sort.shell_sort(sortNumb, nm);
                    break;

                case 5:
                    sort.mergeSort(sortNumb);
                    System.out.println(nm.toUpperCase() + " your sorted numbers are " + sortNumb);
                    break;

                case 6:
                    sort.radixSort(sortNumb);
                    System.out.println(nm.toUpperCase() + " your sorted numbers are " + sortNumb);
                    break;
                default:
                    System.out.println("check input and try again");
                    break;
            }
        } else if (Opera == 2) {
            // selecting the sorting option
            System.out.println("Select the search option you desire: 1. Linear search 2. Binary search");
            Scanner searchingType = new Scanner(System.in);
            int switchType = searchingType.nextInt();
            System.out.println("Finally enter the number you want to search from the list of Numbers");
            Scanner key = new Scanner(System.in);
            int searchKey = key.nextInt();

            switch (switchType) {

                case 1:
                    search.linear_search(sortNumb, searchKey, nm);
                    break;

                case 2:
                    search.binary_search(sortNumb, searchKey, nm);
                    break;

                default:
                    System.out.println("check input and try again");
                    break;
            }

        } else {
            System.out.println("Kindly check input and try again");
        }
    }
}
