package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Laboratorio
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

    public static List<Integer> sortLambdaList(List<Integer> unsortedList)
    {
        Collections.sort(unsortedList, (o1, o2) ->  o2.compareTo(o1));
        return unsortedList;
    }

    public static boolean isPrimeNumber(int n)
    {
        if(n <= 1)
            return false;

        var contador = 0;

        for (int i = n - 1; i > 1; i--)
        {
            if(n % i == 0)
                contador++;
        }

        return contador <= 0;
    }

    public static int fibonacci(int n)
    {
        int p1 = 0;
        int p2 = 1;
        int ans = 0;

        for (int i = 1; i <= n; i++)
        {
            ans = p1 + p2;
            p1 = p2;
            p2 = ans;
        }
        return ans;
    }

    public static void main(String args[])
    {
        //int n = 11;
        //System.out.println("Fibonnaci de " + n + " es " + fibonacci(n));


        System.out.println("Calculando Fibonacci de Primos...");

        var listadoPrimos =
                createRandomList(Integer.valueOf(args[0])).parallelStream()
                .filter(n -> isPrimeNumber(n))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Calculo Finalizado");
        System.out.println("Primer primo: " + listadoPrimos.get(0));
        //System.out.println(listadoPrimos);


        /*
        var primos =
                IntStream.range(0, 100).boxed()
                .filter(n -> isPrimeNumber(n))
                .collect(Collectors.toList());

        System.out.println(primos);

        var randomNumbers = createRandomList(10);
        System.out.println(randomNumbers);
        sortLambdaList(randomNumbers);
        System.out.println(randomNumbers);
        */
    }
}
