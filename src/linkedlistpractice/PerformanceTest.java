package linkedlistpractice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PerformanceTest {
    public static void main(String[] args) {
        long arrayListTime = testPerformance(new ArrayList<>());
        long linkedListTime = testPerformance(new LinkedList<>());

        System.out.println("ArrayList time: " + arrayListTime + " ms");
        System.out.println("LinkedList time: " + linkedListTime + " ms");
    }

    private static long testPerformance(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt());
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}