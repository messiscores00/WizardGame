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
       √-check if health is 0 or below
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
 * -implement damage per round and health per round
 */
public class GameLogic
{
    static double daysLeftToLearn = 10;
    static double daysLeftToLearnForAiWizard = 10;
    static String wizardName;
    static Wizard userWizard;
    static Wizard AiWizard;
    static Wizard fasterWizard;
    static Wizard slowerWizard;
    public static void main(String[] arg){
        GameLogic.createUserWizard();
        GameLogic.userSpellBookCreatedAndEdited();
        GameLogic.createAiWizard();
        GameLogic.explainRules();
        GameLogic.playGame();
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
            userWizard.getSpellBookObject().spellBookSummary();
            while(daysLeftToLearn <= 10 && yes_No_RemoveToSpellBook == 0){
                JOptionPane.showMessageDialog(null,"You have " + daysLeftToLearn + " days left to learn your spells" );
                String spellName = JOptionPane.showInputDialog("What spell would you like to remove from your spell book " + userWizard.name + "?");
                daysLeftToLearn = daysLeftToLearn + userWizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
                userWizard.getSpellBookObject().removeFromSpellBook(spellName);
                userWizard.getSpellBookObject().spellBookSummary();
                JOptionPane.showMessageDialog(null,"You have " + daysLeftToLearn + " days left to learn your spells" );
                yes_No_RemoveToSpellBook = JOptionPane.showConfirmDialog(null, "Do you want to remove more spells?");
            }
            if(yes_No_RemoveToSpellBook == 0){
                JOptionPane.showMessageDialog(null,"You have reached your max days to learn spells.");
            }
        }
    }
    public static void addToSpellBookHandeling(){
        int yes_No_AddToSpellBook = JOptionPane.showConfirmDialog(null, "Would you like to add spells to your spell book?");
        if(yes_No_AddToSpellBook == 0){
            AllSpells.printAllSpellSummaries();
            while(daysLeftToLearn > 0 && yes_No_AddToSpellBook == 0){
                JOptionPane.showMessageDialog(null,"You have " + daysLeftToLearn + " days left to learn your spells" );
                String spellName = JOptionPane.showInputDialog("What spell would you like to add to your spell book " + userWizard.name + "?");
                userWizard.getSpellBookObject().addToSpellBook(spellName);
                daysLeftToLearn = daysLeftToLearn - userWizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
                yes_No_AddToSpellBook = JOptionPane.showConfirmDialog(null, "Do you want to add more spells?");
            }
            if(yes_No_AddToSpellBook == 0){
                JOptionPane.showMessageDialog(null,"You have ran out of days to learn spells.");
            }
        }
    }
    //3___________________________________
    public static void createAiWizard(){
        AiWizard = new Wizard("Your opponent");
        Random ran = new Random();
        int spellNumber;
        String spellName;
        while(GameLogic.daysLeftToLearnForAiWizard > 0){
            spellNumber = ran.nextInt(AllSpells.allSpells.length);
            spellName = AllSpells.allSpells[spellNumber].name;
            AiWizard.getSpellBookObject().addToSpellBook(spellName);
            daysLeftToLearnForAiWizard = daysLeftToLearnForAiWizard - AiWizard.getSpellBookObject().getSpellLearnTimeFromSpellBook(spellName);
        }
    }
    //4________________________________________
    public static void explainRules(){
        JOptionPane.showMessageDialog(null,"*****RULES OF THE GAME*****" + "\n" + 
        "1) You will pick a spell from your spell book and you opponet will pick a spell from their spell book." + "\n" + 
        "2) The faster spell will hit first then the slower spell will hit." + "\n" +
        "3) The first wizard to get below or equal to 0 health looses." + "\n" +
        "Pick your spells wisely because you can only use your spells a certain number of times.");
    }
    //5________________________________________
    public static void playGame(){
        Spells userSpell;
        Spells aiSpell;
        Spells fasterSpell;
        Spells slowerSpell;
        double fasterSpellsDamage;
        double slowerSpellsDamage;
        boolean fasterSpellsAccuracy;
        boolean slowerSpellsAccuracy;
        double damagePerRoundOnFaster = 0;
        double damagePerRoundOnSlower = 0;
        double healthPerRoundOnFaster = 0;
        double healthPerRoundOnSlower = 0;
        while(userWizard.health > 0 && AiWizard.health > 0){
            userSpell = GameLogic.playerPicksSpell();
            aiSpell = GameLogic.aiPicksSpell();
            fasterSpell = GameLogic.compareSpellsSpeed(userWizard, userSpell, AiWizard, aiSpell);
            slowerSpell = GameLogic.compareSlowerSpellsSpeed(userSpell, aiSpell);
            fasterSpellsDamage = GameLogic.caculateDamage(fasterSpell, slowerSpell);
            slowerSpellsDamage = GameLogic.caculateDamage(slowerSpell, fasterSpell);
            fasterSpellsAccuracy = GameLogic.caculateAccuracy(fasterSpell);
            slowerSpellsAccuracy = GameLogic.caculateAccuracy(slowerSpell);
            if(fasterSpellsAccuracy == true){
                GameLogic.applyDamage(slowerWizard, fasterSpellsDamage);
                GameLogic.applyHealth(fasterWizard, fasterSpell.health);
                damagePerRoundOnSlower = damagePerRoundOnSlower + fasterSpell.damagePerRound;
                healthPerRoundOnFaster = healthPerRoundOnFaster + fasterSpell.healthPerRound;
                fasterWizard.getSpellBookObject().setTimesCanBeUsed(fasterSpell.getName());
                JOptionPane.showMessageDialog(null, slowerWizard.name + " has taken " + String.valueOf(fasterSpellsDamage) + " damage" + "\n" +
                userWizard.name + "'s health is: " + userWizard.health + "\n" +
                AiWizard.name + "'s health is: " + AiWizard.health);
            }else{
                JOptionPane.showMessageDialog(null,fasterWizard.name + "'s spell has missed.");
                fasterWizard.getSpellBookObject().setTimesCanBeUsed(fasterSpell.getName());
            }
            if(slowerSpellsAccuracy == true){
                GameLogic.applyDamage(fasterWizard, slowerSpellsDamage);
                GameLogic.applyHealth(slowerWizard, slowerSpell.health);
                damagePerRoundOnFaster = damagePerRoundOnFaster + slowerSpell.damagePerRound;
                healthPerRoundOnSlower = healthPerRoundOnSlower + slowerSpell.healthPerRound;
                slowerWizard.getSpellBookObject().setTimesCanBeUsed(slowerSpell.getName());
                JOptionPane.showMessageDialog(null, fasterWizard.name + " has taken " + String.valueOf(slowerSpellsDamage) + " damage" + "\n" +
                userWizard.name + "'s health is: " + userWizard.health + "\n" +
                AiWizard.name + "'s health is: " + AiWizard.health);
            }else{
                JOptionPane.showMessageDialog(null,slowerWizard.name + "'s spell has missed.");
                slowerWizard.getSpellBookObject().setTimesCanBeUsed(slowerSpell.getName());
            }
            if(damagePerRoundOnFaster > 0){
                JOptionPane.showMessageDialog(null, fasterWizard.name + " is injured for " + damagePerRoundOnFaster + " damage per round.");
            }
            if(damagePerRoundOnSlower > 0){
                JOptionPane.showMessageDialog(null, slowerWizard.name + " is injured for " + damagePerRoundOnSlower + " damage per round.");
            }
            if(healthPerRoundOnFaster > 0){
                JOptionPane.showMessageDialog(null, fasterWizard.name + " is healing for " + healthPerRoundOnFaster + " health per round.");
            }
            if(healthPerRoundOnSlower > 0){
                JOptionPane.showMessageDialog(null, slowerWizard.name + " is healing for " + healthPerRoundOnSlower + " health per round.");
            }
            GameLogic.applyDamage(fasterWizard, damagePerRoundOnFaster);
            GameLogic.applyDamage(slowerWizard, damagePerRoundOnSlower);
            GameLogic.applyHealth(fasterWizard, healthPerRoundOnFaster);
            GameLogic.applyHealth(slowerWizard, healthPerRoundOnSlower);
            JOptionPane.showMessageDialog(null, userWizard.name + "'s health is: " + userWizard.health + "\n" +
            AiWizard.name + "'s health is: " + AiWizard.health);
        }
        Wizard winnerWizard;
        if(userWizard.health >= 0){
            winnerWizard = userWizard;
        }else{
            winnerWizard = AiWizard;
        }
        GameLogic.endGame(winnerWizard);
    }
    
    public static Spells playerPicksSpell(){
        userWizard.getSpellBookObject().spellBookSummary();
        String spellName = JOptionPane.showInputDialog("What Spell are you going to attack with?");
        if(userWizard.getSpellBookObject().getSpellFromSpellBook(spellName).timesCanBeUsed <= 0 ){
            return AllSpells.ifNoMoreSpells;
        }else{
            return userWizard.getSpellBookObject().getSpellFromSpellBook(spellName);
        }
    }
    public static Spells aiPicksSpell(){
        Random ran = new Random();
        int spellRandomNumber = ran.nextInt(AiWizard.getSpellBookObject().spellBook.size());
        return AiWizard.getSpellBookObject().spellBook.get(spellRandomNumber);
    }
    public static Spells compareSpellsSpeed (Wizard spell1Wizard, Spells spell1 , Wizard spell2Wizard, Spells spell2){
        if(spell1.speed > spell2.speed){
            JOptionPane.showMessageDialog(null,"Your spell goes first.");
            fasterWizard = spell1Wizard;
            slowerWizard = spell2Wizard;
            return spell1;   
        }else if(spell1.speed < spell2.speed){
            JOptionPane.showMessageDialog(null,"Your opponent's spell goes first.");
            fasterWizard = spell2Wizard;
            slowerWizard = spell1Wizard;
            return spell2;
        }else if(spell1.speed == spell2.speed){
            Random ran = new Random();
            int randomNum = ran.nextInt(10) + 1;
            if(randomNum <= 5){
                JOptionPane.showMessageDialog(null,"Your spell goes first.");
                fasterWizard = spell1Wizard;
                slowerWizard = spell2Wizard;
                return spell1;
            }else{
                JOptionPane.showMessageDialog(null,"Your opponent's spell goes first.");
                fasterWizard = spell2Wizard;
                slowerWizard = spell1Wizard;
                return spell2;
            }
        }
        return spell1;
    }
    public static Spells compareSlowerSpellsSpeed(Spells spell1, Spells spell2){
        if(spell1.speed > spell2.speed){
            return spell2;   
        }else if(spell1.speed < spell2.speed){
            return spell1;
        }else if(spell1.speed == spell2.speed){
            Random ran = new Random();
            int randomNum = ran.nextInt(10) + 1;
            if(randomNum <= 5){
                return spell2;
            }else{
                return spell1;
            }
        }
        return spell2;
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
    public static void applyDamage(Wizard wizardName , double damage){
        double newHealth = wizardName.health - damage;
        wizardName.setHealth(newHealth);
    }
    public static void applyHealth(Wizard wizardName, double health){
        double newHealth = wizardName.health + health;
        wizardName.setHealth(newHealth);
    }
    //6_______________________________________
    public static void endGame(Wizard winnerWizard){
        JOptionPane.showMessageDialog(null,winnerWizard.name + " has won the game!");
    }
}





