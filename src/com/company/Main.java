package com.company;

import com.company.MenuItem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
public static final String TITLE="CE QUE JE VEUX";

    public static void main(String[] args){

        List<MenuItem> entries = new ArrayList<MenuItem>();
        Scanner sc= new Scanner(System.in);
        entries.add(new Exo1(sc));
        entries.add(new Exo2(sc));
        entries.add(new Exo3(sc));
        // ...
        for(Menu menu = new Menu(TITLE, entries,sc); true; menu.run()){
        }
    }
}