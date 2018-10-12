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
            if(spellName == AllSpells.allSpells[i].name){
                spellBook.add(AllSpells.allSpells[i]);
            }
        }
    }
    public void removeFromSpellBook(String spellName){
        for(int i = 0; i<spellBook.size(); i++){
            if(spellName == spellBook.get(i).name){
                spellBook.remove(i);
            }
        }
    }
    public void spellBookSummary(){
        for(int i = 0; i < spellBook.size(); i++){
            spellBook.get(i).spellSummary();
        }
    }   
    public String getSpellNameFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name == spellName){
                return spellBook.get(i).name;
            }
        }
        return "";
    }
    public int getSpellLearnTimeFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name == spellName){
                return spellBook.get(i).learnTime;
            }
        }
        return 0;
    }
    public int getDamageFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name == spellName){
                return spellBook.get(i).damage;
            }
        }
        return 0;
    }
    public int getHealthFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name == spellName){
                return spellBook.get(i).health;
            }
        }
        return 0;
    }
    public int getDamagePerRoundFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name == spellName){
                return spellBook.get(i).damagePerRound;
            }
        }
        return 0;
    }
    public int getHealthPerRoundFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name == spellName){
                return spellBook.get(i).healthPerRound;
            }
        }
        return 0;
    }
    public int getAccuracyFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name == spellName){
                return spellBook.get(i).getAccuracy();
            }
        }
        return 0;
    }
    public int getTimesCanBeUsedFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).getName() == spellName){
                return spellBook.get(i).getTimesCanBeUsed();
            }
        }
        return 0;
    }
    public int getSpeedFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).getName() == spellName){
                return spellBook.get(i).getSpeed();
            }
        }
        return 0;
    }
    public String getTypeFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).getName() == spellName){
                return spellBook.get(i).getType();
            }
        }
        return "";
    }
}
