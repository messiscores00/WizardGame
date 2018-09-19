import javax.swing.JOptionPane;
/*
 * Purpose: Handle the creation of the wizard, and the spellBook, and hanle the game logic
 * 1) create wizard
 * 2) create spellbook
 * 3) create oponent
 * 4) Explain rules
 * 5) Play
 * 6) Win or Die screen
 */
public class GameLogic
{
    public static void main(String[] arg){
        JOptionPane.showInputDialog( "Please enter the name of your wizard: ");
        String name = JOptionPane.showMessageDialog(null, _message_)
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
                String nameOfSpell = allSpells[i].getName();
                if(spell.equals(nameOfSpell)){
                    totalDays = totalDays + allSpells[i].getLearnTime();
                    addSpelltoSpellBook(allSpells[i]);
                }
            }
        }
    }
}
}
