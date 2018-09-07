import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
public class Wizard
{
    String name;
    int health;
    ArrayList<String> spellBook = new ArrayList<String>();
    public Wizard(String n, ArrayList<String> spells ){
        name = n;
        health = 100;
        spellBook = spells;
    }
    public static void main(String[] arg){
        System.out.println("Please enter the name of your wizard: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Please pick the spells that you want. You only have 10 days to learn your spells.");
    }
}
