import javax.swing.JOptionPane;
/*
 * Purpose: handels te creation of the spells
 * Progress: 2/2
 * 1)all paramiters of a spell
 * 2)spell Summary
 */
public class Spells
{
    double learnTime, accuracy, timesCanBeUsed, speed, health, healthPerRound, damage, damagePerRound;
    String type, name, level;

    public Spells(double lt , double a, double tcbu, double s, double h, double hpr, double d, double dpr, String t , String n, String le){
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
        System.out.println("*********" + "\n" + "Spell name: " + this.name + "\n" +  "  health: " + this.health + "\n" + "  healthPerRound: " + this.healthPerRound + "\n" + "  learnTime: " + this.learnTime + "\n" + "  accuracy: " + this.accuracy +
        "\n" + "  timesCanBeUsed: " + this.timesCanBeUsed + "\n" + "  speed: " + this.speed + "\n" + "  damage: " + this.damage + "\n" + "  damagePerRound: " + this.damagePerRound + "\n" + "  type: " + this.type);
    } 
}
