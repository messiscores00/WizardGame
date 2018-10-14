import javax.swing.JOptionPane;
import java.util.Random;
import java.lang.reflect.Array;
import java.lang.Object;
/*
 * Purpose: Handle the creation of the user's Wizard and the AiWizard, and the spellBooks for each wizard, and hanles the game logic
 * Progress: 3/6
 * 1) create wizard
 *     √-Ask the user for name
 *     √-wizard object
 * 2) create spellbook
 *     √-print All the spells
 *     √-get user input
 *     √-return number of days left
 *     √-etc
 *     √-@ end of days ask the user to remove some spells
 *     √-etc
 * 3) create AiWizard
 * 4) Explain rules
 * 5) Play
 *     √-player picks there spell
 *     √-Ai picks its spell
 *     √-comepare speed
       √-tell user who's spell goes first
       √-compare spell types to caculate damage or health
       √-caculate accuracy
       √-apply the faster spell's damage or health
       -check if health is 0 or below
       -remove one from times that can be used
       -report what happened to the user
       -caculate accuracy
       -apply the slower spell's damage or health
       -check if health is 0 or below
       -remove one from times that can be used
       -report what happened to the user
       -apply damage or health over time
       -check if health is 0 or below
       -report what happened to the user
 * 6) Win or Die screen
 */
public class GameLogic
{
    static int daysLeftToLearn = 10;
    static int daysLeftToLearnForAiWizard = 10;
    static String wizardName;
    static Wizard userWizard;
    static Wizard AiWizard;
    public static void main(String[] arg){
        GameLogic.createUserWizard();
        GameLogic.userSpellBookCreatedAndEdited();
    }
    //1______________________________________
    public static void createUserWizard(){
        wizardName = JOptionPane.showInputDialog("Please enter the name of your wizard: ");
        userWizard = new Wizard(wizardName);
    }
    //2______________________________________
    public static void userSpellBookCreatedAndEdited(){
        int yes_No_EditToSpellBook = 0;
        while(yes_No_EditToSpellBook == 0){
            GameLogic.addToSpellBookHandeling();
            GameLogic.removeToSpellBookHandeling();
            yes_No_EditToSpellBook = JOptionPane.showConfirmDialog(null, "Would you like to edit your spell book?");
        }
    }
    public static void removeToSpellBookHandeling(){
        int yes_No_RemoveToSpellBook = JOptionPane.showConfirmDialog(null, "Would you like to remove spells to your spell book?");
        if(yes_No_RemoveToSpellBook == 0){
            while((daysLeftToLearn > 0 && daysLeftToLearn <= 10) || yes_No_RemoveToSpellBook == 0){
                JOptionPane.showMessageDialog(null,"You have " + daysLeftToLearn + "days left to learn your spells" );
                userWizard.getSpellBookObject().spellBookSummary();
                String spellName = JOptionPane.showInputDialog("What spell would you like to remove from your spell book " + userWizard.name + "?");
                userWizard.getSpellBookObject().removeFromSpellBook(spellName);
                daysLeftToLearn += userWizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
                yes_No_RemoveToSpellBook = JOptionPane.showConfirmDialog(null, "Do you want to remove more spells?");
            }
            if(yes_No_RemoveToSpellBook != 0){
                JOptionPane.showMessageDialog(null,"You have reached your max days to learn spells.");
            }
        }
    }
    public static void addToSpellBookHandeling(){
        int yes_No_AddToSpellBook = JOptionPane.showConfirmDialog(null, "Would you like to add spells to your spell book?");
        if(yes_No_AddToSpellBook == 0){
            while((daysLeftToLearn > 0 && daysLeftToLearn <= 10)|| yes_No_AddToSpellBook == 0){
                JOptionPane.showMessageDialog(null,"You have " + daysLeftToLearn + "days left to learn your spells" );
                AllSpells.printAllSpellSummaries();
                String spellName = JOptionPane.showInputDialog("What spell would you like to add to your spell book " + userWizard.name + "?");
                userWizard.getSpellBookObject().addToSpellBook(spellName);
                daysLeftToLearn -= userWizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
                yes_No_AddToSpellBook = JOptionPane.showConfirmDialog(null, "Do you want to add more spells?");
            }
            if(yes_No_AddToSpellBook != 0){
                JOptionPane.showMessageDialog(null,"You have ran out of days to learn spells.");
            }
        }
    }
    //3___________________________________
    public static void createAiWizard(){
        AiWizard = new Wizard("AiWizard");
        Random ran = new Random();
        int spellNumber;
        String spellName;
        while(GameLogic.daysLeftToLearnForAiWizard > 0){
            spellNumber = ran.nextInt(AllSpells.allSpells.length);
            spellName = Array.get(AllSpells.allSpells , spellNumber).toString();
            AiWizard.getSpellBookObject().addToSpellBook(spellName);
            daysLeftToLearnForAiWizard -= AiWizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
        }
    }
    //4________________________________________
    public static void explainRules(){
        System.out.println("");
        
    }
    //5________________________________________
    public static void playGame(){
        GameLogic.playerPicksSpell();
        GameLogic.aiPicksSpell();
    }
    public static Spells playerPicksSpell(){
        userWizard.getSpellBookObject().spellBookSummary();
        String spellName = JOptionPane.showInputDialog("What Spell are you going to attack with?");
        userWizard.getSpellBookObject().getSpellNameFromSpellBook(spellName);
        return 
    }
    public static Spells aiPicksSpell(){
        Random ran = new Random();
        int spellRandomNumber = ran.nextInt(AiWizard.getSpellBookObject().spellBook.size());
        return AiWizard.getSpellBookObject().;
    }
    public static Spells compareSpellsSpeed (Spells spell1 , Spells spell2){
        if(spell1.speed > spell2.speed){
            JOptionPane.showMessageDialog(null,"Your spell goes first.");
            return spell1;   
        }else if(spell1.speed < spell2.speed){
            JOptionPane.showMessageDialog(null,"Your opponent's spell goes first.");
            return spell2;
        }else if(spell1.speed == spell2.speed){
            Random ran = new Random();
            int randomNum = ran.nextInt(10) + 1;
            if(randomNum <= 5){
                JOptionPane.showMessageDialog(null,"Your spell goes first.");
                return spell1;
            }else{
                JOptionPane.showMessageDialog(null,"Your opponent's spell goes first.");
                return spell2;
            }
        }
        return spell1;
    }
    public static double caculateDamage(Spells spell1, Spells spell2){
        // "Water" "Fire" "Grass" "Normal"
        if(spell1.type == "Water" && (spell2.type == "Normal" || spell2.type == "Water")){
            return spell1.damage;
        }else if(spell1.type == "Water" && spell2.type == "Fire"){
            return spell1.damage * 1.125;
        }else if(spell1.type == "Water" && spell2.type == "Grass"){
            return spell1.damage * 0.875;
        }else if(spell1.type == "Fire" && (spell2.type == "Normal" || spell2.type == "Fire")){
            return spell1.damage;
        }else if(spell1.type == "Fire" && spell2.type == "Water"){
            return spell1.damage * 0.875;
        }else if(spell1.type == "Fire" && spell2.type == "Grass"){
            return spell1.damage * 1.125;
        }else if(spell1.type == "Grass" && (spell2.type == "Normal" || spell2.type == "Grass")){
            return spell1.damage;
        }else if(spell1.type == "Grass" && spell2.type == "Water"){
            return spell1.damage * 1.125;
        }else if(spell1.type == "Grass" && spell2.type == "Fire"){
            return spell1.damage * 0.875;
        }else if(spell1.type == "Normal"){
            return spell1.damage;
        }
        return 0.0;
    }
    public static boolean caculateAccuracy(Spells spellName){
        Random ran = new Random();
        int randomNum = ran.nextInt(100) + 1;
        if(randomNum <= spellName.accuracy){
            return true;
        }else{
            return false;
        }
    }
    public static void applyDamage(Wizard wizardName , int damage){
        int newHealth = wizardName.health - damage;
        wizardName.setHealth(newHealth);
    }
}





