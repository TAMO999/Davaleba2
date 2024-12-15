package org.example;

import java.sql.SQLOutput;

public class InterfaceClass implements InterfaceA , InterfaceB {

    public  String  replaceSymbolA (String text) {
       return  text.replace('a', 'z');

    }

    public  String  replaceSymbolB ( String text) {
       return  text.replace('b','w');

    }

}
