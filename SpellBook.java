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
            if(AllSpells.allSpells[i].name.equalsIgnoreCase(spellName)){
                spellBook.add(AllSpells.allSpells[i]);
            }
        }
    }
    public void removeFromSpellBook(String spellName){
        for(int i = 0; i<spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                spellBook.remove(i);
            }
        }
    }
    public void spellBookSummary(){
        System.out.println("Start: *****************************************Spell Book*****************************************");
        for(int i = 0; i < spellBook.size(); i++){
            spellBook.get(i).spellSummary();
        }
        System.out.println("End: *****************************************Spell Book*****************************************");
    }   
    public Spells getSpellFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i);
            }
        }
        return spellBook.get(0);
    }
    public double getSpellLearnTimeFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).learnTime;
            }
        }
        return 0;
    }
    public double getDamageFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).damage;
            }
        }
        return 0;
    }
    public double getHealthFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).health;
            }
        }
        return 0;
    }
    public double getDamagePerRoundFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).damagePerRound;
            }
        }
        return 0;
    }
    public double getHealthPerRoundFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).healthPerRound;
            }
        }
        return 0;
    }
    public double getAccuracyFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).accuracy;
            }
        }
        return 0;
    }
    public double getTimesCanBeUsedFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).timesCanBeUsed;
            }
        }
        return 0;
    }
    public double getSpeedFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).speed;
            }
        }
        return 0;
    }
    public String getTypeFromSpellBook(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                return spellBook.get(i).type;
            }
        }
        return "";
    }
    public void setTimesCanBeUsed(String spellName){
        for(int i = 0; i < spellBook.size(); i++){
            if(spellBook.get(i).name.equalsIgnoreCase(spellName)){
                spellBook.get(i).timesCanBeUsed = spellBook.get(i).timesCanBeUsed - 1;
            }
        }
    }
}
