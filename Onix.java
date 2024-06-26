package pokemonkantoadventure;

import java.util.Scanner;
import java.util.Stack;
import java.io.*;

public class Onix extends Pokemon {

    public Onix() {
        super("Onix","Rock/Ground",5,112,0);
    }
    
    public Onix(String location) {
        super("Onix","Rock/Ground",112,location);
    }
    
    public Onix(int level) {
        super("Onix","Rock/Ground",level,112);
    }

    @Override
    public String[] setStrength() {
        return new String[]{"Fire","Poison","Electric","Flying","Bug","Ice"};
    }

    @Override
    public String[] setWeakness() {
        return new String[]{"Water","Grass","Fighting","Ice","Ground","Steel"};
    }

    @Override
    public Stack<Skill> allMoves() {
        Stack<Skill> moveset = new Stack<>();
        moveset.push(new Skill("Stone Edge",90.0,35));
        moveset.push(new Skill("Sand Tomb",55.0,19));
        moveset.push(new Skill("Dragon Breath",36.0,10));
        moveset.push(new Skill("Smack Down",24.0,5));
        moveset.push(new Skill("Rock Throw",15.0,1));
        moveset.push(new Skill("Bind",13.0,1));
        
        return moveset;
    }
    
    public void display() {
        try{
            Scanner sc = new Scanner(new FileInputStream("onix.txt"));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch(IOException e) {
            System.out.println("Onix picture is not found.");
        }
    }
}
