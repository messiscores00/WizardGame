import java.lang.String;
/*
 * Purpose: create the wizard
 * Progress: 1/1
 * 1) cunstructor of the wizard 
 *  - with name and health =100
 */
public class Wizard{
    //Wizard
    public String name;
    double health;
    SpellBook spellBook;
    public Wizard(String n){
        name = n;
        health = 100;
        spellBook = new SpellBook();
    }
    public SpellBook getSpellBookObject(){
        return spellBook;
    }
    public void setHealth(double newHealth){
        health = newHealth;
    }
}
    