package com.company;



import java.util.Scanner;
public class Exo1 implements MenuItem {
    private final static String LABEL= "Règle graduée";


    public Exo1(Scanner sc){

    }
    public String getLabel(){
        return LABEL;
    }
    public void run(){
        /*
         * code de l'exercice 1 pour afficher une règle graduée
         */

        System.out.println("détail du code de l'exo 1");
    }
}
