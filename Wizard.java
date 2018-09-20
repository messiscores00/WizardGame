import java.util.ArrayList;
import java.lang.String;
/*
 * Purpose: create the wizard, creates the spellbook, and holds all of the spells possible to learn
 * 1) create all of the spell objects
 * 2) Array with all of the spells
 * 3) cunstructor of the wizard 
 *  - with name and health =100
 * 4) create the spellbook(arraylist) of the Wizard
 * 5) add/remove spells to the spellbook
 * 6) summary of the SpellBook
 */
public class Wizard{
    //Spells
    static Spells dej = new Spells(1, 100, 15, 9, 0 , 0, 10, 0 , "Water", "dej");
    static Spells[] allSpells = {dej};
    
    //Wizard
    String name;
    int health;
    ArrayList<Spells> spellBook;
    public Wizard(String n){
        name = n;
        health = 100;
        spellBook = new ArrayList<Spells>();
    }
    public void addToSpellBook(String spellName){
        for(int i = 0; i< allSpells.size(); i++){
            
        }
        spellBook.add(somespell);
    }
    public void removeFromSpellBook(Spells somespell){
        for(int i = 0; i<spellBook.size(); i++){
            if(somespell.getName() == spellBook.get(i).getName()){
                spellBook.remove(i);
            }
        }
    }
    public void spellBookSummary(){
        for(int i = 0; i < spellBook.size(); i++){
            spellBook.get(i).spellSummary();
        }
    }
    public void printAllSpellSummaries(){
        for(int i = 0; i<allSpells.length; i++){
           
        }
    }
}
    