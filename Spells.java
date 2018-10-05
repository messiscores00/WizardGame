import javax.swing.JOptionPane;
/*
 * Purpose: handels te creation of the spells
 * Progress: 4/4
 * 1)all paramiters of a spell
 * 2)spell Summary
 * 3)get Learn time
 * 4)Get name
 */
public class Spells
{
    int learnTime, accuracy, timesCanBeUsed, speed, health, healthPerRound, damage, damagePerRound;
    String type, name, level;

    public Spells(int lt , int a, int tcbu, int s, int h, int hpr, int d, int dpr, String t , String n, String le){
        learnTime = lt;
        accuracy = a;
        timesCanBeUsed = tcbu;
        speed = s;
        health = h;
        healthPerRound = hpr;
        damage = d;
        damagePerRound = dpr;
        type = t;
        name = n;
        level = le;//H=hard , M=Medium, E=easy
    }
    public void spellSummary(){
        JOptionPane.showMessageDialog(null,"*********" + "\n" + "Spell name: " + this.name + "\n" +  "  health: " + this.health + "\n" + "  healthPerRound: " + this.healthPerRound + "\n" + "  learnTime: " + this.learnTime + "\n" + "  accuracy: " + this.accuracy +
        "\n" + "  timesCanBeUsed: " + this.timesCanBeUsed + "\n" + "  speed: " + this.speed + "\n" + "  damage: " + this.damage + "\n" + "  damagePerRound: " + this.damagePerRound + "\n" + "  type: " + this.type);
    } 
    public int getLearnTime(){
        return this.learnTime;
    }
    public String getName(){
        return this.name;
    }
}
