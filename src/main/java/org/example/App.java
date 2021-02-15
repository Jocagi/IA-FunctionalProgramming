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
        MyFunctionalInterface clippy = (String param) -> {
            return "Hola soy Clippy y he recibido: " + param;
        };
        MyFunctionalInterface wilbert = (p) -> "Hola soy Wilbert y he recibido: " + p;

        doSomethingHighOrder(clippy);
        doSomethingHighOrder(wilbert);
        doSomethingHighOrder(x -> "Hola soy anonymus y he recibido: " + x);

        var tux = new Tux();
        doSomethingHighOrder(tux::doSomething);
    }

    private static void doSomethingHighOrder(MyFunctionalInterface comportamiento)
    {
        //Ejecuta el comportamiento recibido
        var respuesta = comportamiento.doSomething("Java 11 es genial");
        System.out.println(respuesta);
    }

    public static void main( String[] args )
    {
        doSomethingFunctional();
    }
}
