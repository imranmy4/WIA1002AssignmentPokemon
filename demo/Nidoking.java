/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author ahmad
 */
import java.util.Scanner;
import java.util.Stack;
import java.io.*;

public class Nidoking extends Pokemon {

    public Nidoking() {
        super("Nidoking","Poison/Ground",5,96,0);
    }
    
    public Nidoking(String location) {
        super("Nidoking","Poison/Ground",96,location);
    }
    
    public Nidoking(int level) {
        super("Nidoking","Poison/Ground",level,96);
    }

    @Override
    public String[] setStrength() {
        return new String[]{"Fire","Electric","Poison","Rock","Grass","Fairy"};
    }

    @Override
    public String[] setWeakness() {
        return new String[]{"Water","Ice","Psychic","Ground"};
    }

    @Override
    public Stack<Skill> allMoves() {
        Stack<Skill> moveset = new Stack<>();
        moveset.push(new Skill("Megahorn",100.0,40));
        moveset.push(new Skill("Peck",74.0,28));
        moveset.push(new Skill("Poison Jab",51.0,17,"POISONED"));
        moveset.push(new Skill("Double Kick",30.0,6));
        moveset.push(new Skill("Sludge Wave",19.0,1,"POISONED"));
        moveset.push(new Skill("Fury Attack",18.0,1));
        
        return moveset;
    }
    
    public void display() {
        try{
            Scanner sc = new Scanner(new FileInputStream("nidoking.txt"));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch(IOException e) {
            System.out.println("Nidoking picture is not found.");
        }
    }
}