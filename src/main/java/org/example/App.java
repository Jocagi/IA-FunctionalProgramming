package org.example;

import org.example.functional.MyFunctionalInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    private static void doSomethingTraditional()
    {
        var tux = new Tux();
        System.out.println(tux.doSomething("Hola"));
    }

    private static void doSomethingClassy()
    {
        //Clase anonima
        var duke = new MyFunctionalInterface() {
            @Override
            public String doSomething(String param) {
                return "Hola soy DUKE y he recibido: " + param;
            }
        };

        System.out.println(duke.doSomething("Clase anonima"));
    }

    private static void doSomethingFunctional()
    {
        MyFunctionalInterface wilbert = (p) -> "Hola soy Wilbert y he recibido: " + p;
        System.out.println(wilbert.doSomething("Parametro Funcional"));
    }

    public static void main( String[] args )
    {
        doSomethingFunctional();
    }
}
