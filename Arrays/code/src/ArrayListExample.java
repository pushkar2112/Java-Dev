import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(57);
//        list.add(6756);
//        list.add(47);
//        list.add(437);
//        list.add(347);
//        list.add(6724);
//        list.add(6742);
//        list.add(6766);
//        list.add(678);
//        list.add(67543);
//        list.add(67909);
//        list.add(6799);
//        list.add(6711);
//
//        System.out.println(list.contains(654));
//
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here

        }

        System.out.println(list);
    }
}
