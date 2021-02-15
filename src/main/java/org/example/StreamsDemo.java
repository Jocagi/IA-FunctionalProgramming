package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo
{
    //Datos
    public static List<Integer> createRandomList(int qty)
    {
        var random = new Random();
        List<Integer> numbers = new LinkedList<>();

        for (int i = 0; i<qty; i++)
        {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    public static List<Integer> sortList(List<Integer> unsortedList)
    {
        Collections.sort(unsortedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return unsortedList;
    }

    public static void main(String args[])
    {
        var randomNumbers = createRandomList(10);
        System.out.println(randomNumbers);
        sortList(randomNumbers);
        System.out.println(randomNumbers);
    }
}
