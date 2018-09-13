import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
public class Wizard{
    String name;
    int health;
    static ArrayList<Spells> spellBook;
    //Spells
    static Spells dej = new Spells(1, 100, 15, 9, 0 , 0, 10, 0 , "Water", "dej");
    static Spells[] allSpells = {dej};
    
    public Wizard(String n){
        name = n;
        health = 100;
        spellBook = new ArrayList<Spells>();
    }
    
    public static void main(String[] arg){
        System.out.println("Please enter the name of your wizard: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Wizard wizard = new Wizard(name);
        pickSpells();
    }
    
    public static void addSpelltoSpellBook(Spells someSpell){
        spellBook.add(someSpell);
    }

    public static void spellsSummary(){
        for(int i = 0; i < allSpells.length; i++){
            allSpells[i].spellSummary();
        }
    }
    
    public static void pickSpells(){
        int totalDays = 0;
        System.out.println("Please type the name of the spells that you want. You only have 10 days to learn your spells.");
        spellsSummary();
        while(10 - totalDays >= 0){
            System.out.println("************" + "\n" + "You have " + (10 - totalDays) + " days left.");
            Scanner in = new Scanner(System.in);
            String spell = in.nextLine();
            spell = spell.toLowerCase();
            for(int i = 0; i< allSpells.length; i++){
                if(spell == allSpells[i].getName()){
                    totalDays = totalDays + allSpells[i].getLearnTime();
                    addSpelltoSpellBook(allSpells[i]);
                }
            }
        }
    }
}