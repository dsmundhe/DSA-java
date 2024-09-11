import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        boolean result = list.contains(50);
        System.out.println(result);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);

        // 2D ArrayList
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(10);
            }
        }
        System.out.println(list1);
    }
}
