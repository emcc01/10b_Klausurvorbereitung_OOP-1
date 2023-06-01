package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    // test --> Referenzvariable / RAM-Adresse des Objekts/Instanz (object/instance)
    // Test --> Referenztyp (reference type)
    // Object <--> Instanz

    //das kleine test enthält die Ram Adresse, ist Referenzvariable, vrgl mit this als Instanzvariable

    Test test  = new Test(); // mit new Default Constructor aufrufen, damit Objekt anlegen
    System.out.println("Referenzvariable: " + test);
    test.showAddress();

    }

}
