import StacksAndQues.kworkers;

public class temp {

    public static void main(String[] args) {

        int a[] = { 31, 25, 72, 79, 74, 65, 84, 91, 18, 59, 27, 9, 81, 33, 17, 58
        };
        int a1[] = { 17, 12, 10, 2, 7, 2, 11, 20, 8
        };
        int b[] = { 1, 2, 4, 1 };
        kworkers k = new kworkers();

        System.out.println(k.totalCost(a1, 3, 4));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(k.totalCost(a, 11, 2));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(k.totalCost(b, 3, 3));

    }
}