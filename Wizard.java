
import java.lang.String;
/*
 * Purpose: create the wizard
 * Progress: 1/1
 * 1) cunstructor of the wizard 
 *  - with name and health =100
 */
public class Wizard{
    //Wizard
    String name;
    int health;
    public Wizard(String n){
        name = n;
        health = 100;
        SpellBook spellBook = new SpellBook();
    }
}
    