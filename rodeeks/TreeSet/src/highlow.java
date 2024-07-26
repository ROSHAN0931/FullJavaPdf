import java.util.TreeSet;

public class highlow {
    public static void main(String[] args) {
//        TreeSet<Integer> set = new TreeSet<Integer>();
//        set.add(5);
//        set.add(20);
//        set.add(3);
//        set.add(45);
//        System.out.println("Set " + set);
//        System.out.println("PollFirst " + set.pollFirst());
//        System.out.println("After PollFirst " + set);
//        TreeSet<Integer> set1 = new TreeSet<Integer>();
//        set1.add(5);
//        set1.add(20);
//        set1.add(3);
//        set1.add(45);
//        System.out.println("Set " + set1);
//        System.out.println("PollLast " + set1.pollLast());
//        System.out.println("After PollLast " + set1);

        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(20);
        set.add(3);
        set.add(45);
        System.out.println("Values in set " + set);
        Integer ceil = set.ceiling(45);
        System.out.println("Ceil value is " + ceil);
        Integer floor = set.floor(20);
        System.out.println("Floor value is " + floor);
        Integer high = set.higher(3);
        System.out.println("Higher value is " + high);
        Integer low = set.lower(20);
        System.out.println("Lower value is " + low);

//        System.out.println(set.hashCode());
    }
}
