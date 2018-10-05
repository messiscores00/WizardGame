import java.util.ArrayList;
/*
 * Purpose: Handels everything with the SpellBook
 * Progress: 3/3
 * 1) create the spellbook(arraylist) of the Wizard
 * 2) add/remove spells to the spellbook
 * 3) summary of the SpellBook
 */
public class SpellBook
{
    ArrayList<Spells> spellBook;
    public SpellBook(){
        spellBook = new ArrayList<Spells>();
    }    
    public void addToSpellBook(String spellName){
        for(int i = 0; i<AllSpells.allSpells.length; i++){
            if(spellName == AllSpells.allSpells[i].getName()){
                spellBook.add(AllSpells.allSpells[i]);
            }
        }
    }
    public void removeFromSpellBook(String spellName){
        for(int i = 0; i<spellBook.size(); i++){
            if(spellName == spellBook.get(i).getName()){
                spellBook.remove(i);
            }
        }
    }
    public void spellBookSummary(){
        for(int i = 0; i < spellBook.size(); i++){
            spellBook.get(i).spellSummary();
        }
    }   
}
