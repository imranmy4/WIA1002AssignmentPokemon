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
import java.util.Scanner;
import java.io.*;
public class MrMime extends Pokemon{

    public MrMime() {
        super("Mr. Mime","Psychic/Fairy",5,95,0);
    }
    
    public MrMime(String location){
        super("Mr. Mime","Psychic/Fairy",95,location);
    }
    
    public MrMime(int level){
        super("Mr. Mime","Psychic/Fairy",level,95);
    }

    @Override
    public String[] setStrength() {
        return new String[]{"Fighting","Poison","Dragon","Dark"};
    }

    @Override
    public String[] setWeakness() {
        return new String[]{"Ghost","Poison","Steel"};
    }

    @Override
    public Stack<Skill> allMoves() {
        Stack<Skill> moveset = new Stack<>();
        moveset.push(new Skill("Teeter Dance",97.0,43));
        moveset.push(new Skill("Dazzling Gleam",65.0,28));
        moveset.push(new Skill("Sucker Punch",38.0,15));
        moveset.push(new Skill("Psybeam",26.0,9));
        moveset.push(new Skill("Confusion",14.0,5));
        moveset.push(new Skill("Pound",15.0,5));
        
        return moveset;
    }
    
    public void display(){
        try{
            Scanner sc = new Scanner(new FileInputStream("mrmime.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(IOException e){
            System.out.println("Mr Mime picture is not found");
        }
    }
    
}
