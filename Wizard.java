import java.util.ArrayList;

/**
 * Write a description of class Wizard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wizard
{
    // instance variables - replace the example below with your own
    String name;
    int health;
    ArrayList<String> spellBook = new ArrayList<String>();
    public Wizard(String n, ArrayList<String> spells ){
        name = n;
        health = 100;
        spellBook = spells;
    }
}
