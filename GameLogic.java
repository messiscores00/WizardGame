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
 * 6) Win or Die screen
 */
public class GameLogic
{
    static int daysLeftToLearn = 10;
    static int daysLeftToLearnForAiWizard = 10;
    static String wizardName;
    static Wizard wizard;
    static Wizard userWizard;
    public static void main(String[] arg){
        GameLogic.createUserWizard();
        GameLogic.userSpellBookCreatedAndEdited();
    } 
    public static void createUserWizard(){
        wizardName = JOptionPane.showInputDialog("Please enter the name of your wizard: ");
        wizard = new Wizard(wizardName);
    }
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
                wizard.getSpellBookObject().spellBookSummary();
                String spellName = JOptionPane.showInputDialog("What spell would you like to remove from your spell book " + wizard.name + "?");
                wizard.getSpellBookObject().removeFromSpellBook(spellName);
                daysLeftToLearn += wizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
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
                String spellName = JOptionPane.showInputDialog("What spell would you like to add to your spell book " + wizard.name + "?");
                wizard.getSpellBookObject().addToSpellBook(spellName);
                daysLeftToLearn -= wizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
                yes_No_AddToSpellBook = JOptionPane.showConfirmDialog(null, "Do you want to add more spells?");
            }
            if(yes_No_AddToSpellBook != 0){
                JOptionPane.showMessageDialog(null,"You have ran out of days to learn spells.");
            }
        }
    }
    public static void createAiWizard(){
        userWizard = new Wizard("userWizard");
        Random ran = new Random();
        int spellNumber;
        String spellName;
        while(GameLogic.daysLeftToLearnForAiWizard > 0){
            spellNumber = ran.nextInt(AllSpells.allSpells.length);
            spellName = Array.get(AllSpells.allSpells , spellNumber).toString();
            userWizard.getSpellBookObject().addToSpellBook(spellName);
            daysLeftToLearnForAiWizard -= userWizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
        }
    }
    public static void explainRules(){
        System.out.println("");
        
    }
    public static void playGame(){
        
    }
}

