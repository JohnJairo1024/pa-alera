package com.panalera.controlador;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String unico = "tes";
        boolean isUnico = esUnicoCaracter(unico);
        System.out.println(isUnico);
    }

    public static boolean esUnicoCaracter(String test) {

        char[] charArray = test.toCharArray();
        List<Character> newCharArray = new ArrayList<>();

        for (char c : charArray) {
            if (newCharArray.contains(c)) {
                return false;
            } else {
                newCharArray.add(c);
            }
        }

        return true;
    }

}