package org.example;

import org.example.functional.MyFunctionalInterface;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
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
}
