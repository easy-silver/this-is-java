package ch15.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
ArrayList와 LinkedList의 실행 성능 비교
 */
public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArryList 걸린 시간:\t" + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간:\t" + (endTime - startTime) + " ns");
    }
}
