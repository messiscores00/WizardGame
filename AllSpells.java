import java.lang.reflect.Array;
/*
 * Purpose: To handel all the spells
 * Progress: 3/3
 * 1) create all of the spell objects
 * 2) Array with all of the spells
 * 3) print all spells's summaries
 */
public class AllSpells
{
   //Spells
    /*
     * learnTime, accuracy, timesCanBeUsed, speed, health, healthPerRound, damage, damagePerRound, type , name , level 
     */
   static Spells dej = new Spells(1, 100, 15, 9, 0 , 0, 10, 0 , "Water", "dej", "easy");
   static Spells voda = new Spells(3, 85, 8, 8, 0, 0, 0, 23, "Water", "voda", "medium");
   static Spells dlo = new Spells(7, 95, 3, 1, 50, 0, 0, 0, "Water" , "dlo", "hard");
   static Spells brand = new Spells(2, 95, 20, 7, 0, 0, 12, 0, "Fire" , "brand", "easy");
   static Spells apoy = new Spells(4, 100, 5, 6, 0, 0, 8, 8, "Fire" , "apoy", "medium");
   static Spells feier = new Spells(6, 50, 4, 10, 0, 0, 50, 0, "Fire" , "feier" , "hard");
   static Spells herba = new Spells(4, 95, 10, 5, 10, 0, 0, 3, "Grass" , "herba", "medium");  
   static Spells grama = new Spells(2, 100, 10, 9, 0, 0, 8, 0, "Grass", "grama", "easy"); 
   static Spells utshani = new Spells(7, 45, 7, 4, 0, 1, 40, 0, "Grass" , "utshani", "hard"); 
   static Spells zachibadwa = new Spells(1, 100, 20, 10, 0, 0, 1, 10, "Normal" , "zachibadwa", "easy");
   static Spells deede = new Spells(4, 75, 10, 5, 0, 0, 10, 0, "Normal", "deede", "medium");
   static Spells normali = new Spells(5, 50, 10, 3, 0, 0, 20, 10, "Normal", "normali" , "hard");
   static Spells ifNoMoreSpells = new Spells(0, 100, 10000, 1, 0, 0, 2, 0, "Normal", "ifNoMoreSpells" , "easy");
   static Spells[] allSpells = {dej, voda, brand, apoy, feier, herba, grama, utshani, zachibadwa, deede, normali};
   
   public static void printAllSpellSummaries(){
        for(int i = 0; i<allSpells.length; i++){
           allSpells[i].spellSummary();
        }
   }     
}
