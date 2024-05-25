
package pokemon.kanto.adventure;

import java.util.Stack;

public class Weezing extends Pokemon{

    public Weezing() {
        super("Weezing","Poison",5,98,0);
    }
    
    public Weezing(String location){
        super("Weezing","Poison",98,location);
    }
    
    public Weezing(int level){
        super("Weezing","Poison",level,98);
    }

    @Override
    public String[] setStrength() {
        return new String[]{"Grass","Fairy"};
    }

    @Override
    public String[] setWeakness() {
        return new String[]{"Ground","Psychic"};
    }

    @Override
    public Stack<Skill> allMoves() {
        Stack<Skill> moveset = new Stack<>();
        moveset.push(new Skill("Destiny Bond",106.0,45));
        moveset.push(new Skill("Memento",76.0,33));
        moveset.push(new Skill("Explosion",43.0,17));
        moveset.push(new Skill("Double Hit",29.0,10));
        moveset.push(new Skill("Clear Smog",17.0,5));
        moveset.push(new Skill("Heat Wave",19.0,5));
        
        return moveset;    
    }
    
}
