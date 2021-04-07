package com.company;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    private final static String PROMPT= "Saisissez le numéro de votre choix (entier entre 1 et %d):";
    private final static String ENTRY_MESSAGE = "%d. %s";
    private final static String ERROR_MESSAGE= "Saisie invalide";

    private String title;
    private final List<MenuItem> entries;
    private static Scanner sc=new Scanner(System.in);

    public Menu(String title, List<MenuItem> entries, Scanner sc){
        this.title = title;
        this.entries = entries;
        this.sc = sc;
    }
    /*retourn l'indice commençant à 0 et non la saisie (à partir de 1)
     */
    private int getChoice(){
        int res = -1;
        do{
            try {
                System.out.println(String.format(PROMPT, entries.size()));
                res = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                System.err.println(ERROR_MESSAGE);
                sc.nextLine();
            }
        }while((res < 1) || (res > entries.size()));
        return res - 1;
    }

    public void run(){
        System.out.println(title);
        for(int i= 0; i != entries.size(); ++i){
            System.out.println(String.format(ENTRY_MESSAGE, i+1, entries.get(i).getLabel()));
        }
        entries.get(getChoice()).run();
    }
}