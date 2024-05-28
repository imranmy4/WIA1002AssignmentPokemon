
package pokemon.kanto.adventure;

import java.util.Stack;

public class Victreebel extends Pokemon{

    public Victreebel() {
        super("Victreebel","Grass/Poison",5,105,0);
    }
    
    public Victreebel(String location){
        super("Victreebel","Grass/Poison",105,location);
    }
    
    public Victreebel(int level){
        super("Victreebel","Grass/Poison",level,105);
    }

    @Override
    public String[] setStrength() {
        return new String[]{"Water","Ground","Rock","Fairy"};
    }

    @Override
    public String[] setWeakness() {
        return new String[]{"Fire","Ice","Flying","Psychic"};
    }

    @Override
    public Stack<Skill> allMoves() {
        Stack<Skill> moveset = new Stack<>();
        moveset.push(new Skill("Leaf Blade",85.0,37));
        moveset.push(new Skill("Leaaf Storm",57.0,25));
        moveset.push(new Skill("Power Whip",38.0,15));
        moveset.push(new Skill("Spit Up",21.0,7));
        moveset.push(new Skill("Razor Leaf",15.0,5));
        moveset.push(new Skill("Vine Whip",14.0,5));
        
        return moveset;
    }
    
}