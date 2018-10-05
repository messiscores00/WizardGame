import javax.swing.JOptionPane;
/*
 * Purpose: Handle the creation of the user's Wizard and the AiWizard, and the spellBooks for each wizard, and hanles the game logic
 * Progress: 1/6
 * 1) create wizard
 *     √-Ask the user for name
 *     √-wizard object
 * 2) create spellbook
 *     √-print All the spells
 *     -get user input
 *     -return number of days left
 *     -etc
 *     -@ end of days ask the user to remove some spells
 *     -etc
 * 3) create AiWizard
 * 4) Explain rules
 * 5) Play
 * 6) Win or Die screen
 */
public class GameLogic
{
    static int daysLeftToLearn = 10;
    public static void main(String[] arg){
        GameLogic.createUserWizard();
        GameLogic.userSpellBookcreated();
    } 
    public static void createUserWizard(){
        String name = JOptionPane.showInputDialog("Please enter the name of your wizard: ");
        Wizard wizard = new Wizard(name);
    }
    public static void userSpellBookcreated(){
        AllSpells.printAllSpellSummaries();
        JOptionPane.showMessageDialog(null,"You only have " + daysLeftToLearn + "days left to learn your spells" );
        String spellName = JOptionPane.showInputDialog("
    }
}

