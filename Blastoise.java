/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonkantoadventure;

/**
 *
 * @author ahmad
 */
import java.util.Stack;
import java.io.*;
import java.util.Scanner;

public class Blastoise extends Pokemon{

    public Blastoise() {
        super("Blastoise","Water",5,115,0);
    }
    
    public Blastoise(String location){
        super("Blastoise","Water",115,location);
    }
    
    public Blastoise(int level){
        super("Blastoise","Water",level,115);
    }

    @Override
    public String[] setStrength() {
        return new String[]{"Fire","Ground","Rock"};
    }

    @Override
    public String[] setWeakness() {
        return new String[]{"Electric","Grass"};
    }

    @Override
    public Stack<Skill> allMoves() {
        Stack<Skill> moveset = new Stack<>();
        moveset.push(new Skill("Wave Crash",103.0,41));
        moveset.push(new Skill("Hydro Pump",72.0,29));
        moveset.push(new Skill("Rain Dance",45.0,18));
        moveset.push(new Skill("Flash Cannon",28.0,9));
        moveset.push(new Skill("Water Gun",18.0,5));
        moveset.push(new Skill("Tail Whip",15.0,5));
        
        return moveset;
    }
    
    public void display(){
        try{
            Scanner sc = new Scanner(new FileInputStream("Blastoise(kecik sikit).txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(IOException e){
            System.out.println("Blastoise picture is not found");
        }
    }
    
}
