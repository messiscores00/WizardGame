/*
 * Purpose: handels te creation of the spells
 */
public class Spells
{
    int learnTime, accuracy, timesCanBeUsed, speed, health, healthPerRound, damage, damagePerRound;
    String type, name;

    public Spells(int lt , int a, int tcbu, int s, int h, int hpr, int d, int dpr, String t , String n){
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
    }
    public void spellSummary(){
        System.out.println("*********" + "\n" + "Spell name: " + this.name + "\n" +  "  health: " + this.health + "\n" + "  healthPerRound: " + this.healthPerRound + "\n" + "  learnTime: " + this.learnTime + "\n" + "  accuracy: " + this.accuracy +
        "\n" + "  timesCanBeUsed: " + this.timesCanBeUsed + "\n" + "  speed: " + this.speed + "\n" + "  damage: " + this.damage + "\n" + "  damagePerRound: " + this.damagePerRound + "\n" + "  type: " + this.type);
    }  
    public int getLearnTime(){
        return this.learnTime;
    }
    public String getName(){
        return this.name;
    }
}
