import javax.swing.JOptionPane;
/*
 * Purpose: Handle the creation of the wizard, and the spellBook, and hanle the game logic
 * 1) create wizard
 *     -Ask the user for name
 *     -wizard object
 * 2) create spellbook
 *     -print All the spells
 *     -get user input
 *     -return number of days left
 *     -etc
 *     -@ end of days ask the user to remove some spells
 *     -etc
 * 3) create oponent
 * 4) Explain rules
 * 5) Play
 * 6) Win or Die screen
 */
public class GameLogic
{
    int daysLeftToLearn = 10;
    public static void main(String[] arg){
        String name = JOptionPane.showInputDialog("Please enter the name of your wizard: ");
        Wizard wizard = new Wizard(name);
    } 
    public void spellBookcreated(){
        JOptionPane.showMessageDialog(null,"You only have " + daysLeftToLearn + "days left to learn" );
        while(daysLeftToLearn <= 10){
           wizard.printAllSpellSummaries();
           String spell = JOptionPane.showInputDialog("Pick your first spell: ");
    
        }
    }
}

