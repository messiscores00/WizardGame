public class Spells{
    String learnTime, accuracy, timesCanBeUsed, speed, health, healthPerRound, type;
    //if health is negative it is damage to the opponent inf health is positive it gives health to you.
    public String dej(String againstType){
        if(againstType == "Water"){
            health = "-10";
        }else if(againstType == "Fire"){
            health = "-12";
        }else if(againstType == "Grass"){
            health = "-8";
        }else if(againstType == "Normal"){
            health = "-10";
        }
        learnTime = "1";
        accuracy = "100";
        timesCanBeUsed = "15";
        speed = "9";
        type = "Water";
        healthPerRound = "0";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String voda(String againstType){
        if(againstType == "Water"){
            health = "-23";
        }else if(againstType == "Fire"){
            health = "-31";
        }else if(againstType == "Grass"){
            health = "-15";
        }else if(againstType == "Normal"){
            health = "-23";
        }
        learnTime = "3";
        accuracy = "85";
        timesCanBeUsed = "8";
        speed = "8";
        type = "Water";
        healthPerRound = "0";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type;
    }
    public String dlo(String againstType){
        if(againstType == "Water"){
            health = "75";
        }else if(againstType == "Fire"){
            health = "50";
        }else if(againstType == "Grass"){
            health = "50";
        }else if(againstType == "Normal"){
            health = "50 ";
        }
        learnTime = "7";
        accuracy = "95";
        timesCanBeUsed = "3";
        speed = "1";
        type = "Water";
        healthPerRound = "0";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type;
    }
    public String brand(String againstType){
        if(againstType == "Water"){
            health = "-9";
        }else if(againstType == "Fire"){
            health = "-12";
        }else if(againstType == "Grass"){
            health = "-15";
        }else if(againstType == "Normal"){
            health = "-12";
        }
        learnTime = "2";
        accuracy = "95";
        timesCanBeUsed = "20";
        speed = "7";
        type = "Fire";
        healthPerRound = "0";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String apoy(String againstType){
        if(againstType == "Water"){
            health = "-5";
        }else if(againstType == "Fire"){
            health = "-8";
        }else if(againstType == "Grass"){
            health = "-10";
        }else if(againstType == "Normal"){
            health = "-8";
        }
        learnTime = "4";
        accuracy = "100";
        timesCanBeUsed = "5";
        speed = "6";
        type = "Fire";
        healthPerRound = "-8";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String feier(String againstType){
        if(againstType == "Water"){
            health = "-40";
        }else if(againstType == "Fire"){
            health = "-50";
        }else if(againstType == "Grass"){
            health = "-60";
        }else if(againstType == "Normal"){
            health = "-50";
        }
        learnTime = "6";
        accuracy = "50";
        timesCanBeUsed = "4";
        speed = "10";
        type = "Fire";
        healthPerRound = "0";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String herba(String againstType){
        if(againstType == "Water"){
            health = "15";
        }else if(againstType == "Fire"){
            health = "5";
        }else if(againstType == "Grass"){
            health = "10";
        }else if(againstType == "Normal"){
            health = "10";
        }
        learnTime = "4";
        accuracy = "95";
        timesCanBeUsed = "10";
        speed = "5";
        type = "Grass";
        healthPerRound = "-3";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String grama(String againstType){
        if(againstType == "Water"){
            health = "-50";
        }else if(againstType == "Fire"){
            health = "-5";
        }else if(againstType == "Grass"){
            health = "-8";
        }else if(againstType == "Normal"){
            health = "-8";
        }
        learnTime = "2";
        accuracy = "100";
        timesCanBeUsed = "10";
        speed = "9";
        type = "Grass";
        healthPerRound = "0";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String utshani(String againstType){
        if(againstType == "Water"){
            health = "-50";
        }else if(againstType == "Fire"){
            health = "-30";
        }else if(againstType == "Grass"){
            health = "-40";
        }else if(againstType == "Normal"){
            health = "-40";
        }
        learnTime = "7";
        accuracy = "45";
        timesCanBeUsed = "7";
        speed = "4";
        type = "Grass";
        healthPerRound = "1";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String zachibadwa(String againstType){
        if(againstType == "Water"){
            health = "-1";
        }else if(againstType == "Fire"){
            health = "-1";
        }else if(againstType == "Grass"){
            health = "-1";
        }else if(againstType == "Normal"){
            health = "-1";
        }
        learnTime = "1";
        accuracy = "100";
        timesCanBeUsed = "20";
        speed = "10";
        type = "Normal";
        healthPerRound = "-10";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String normaal(String againstType){
        if(againstType == "Water"){
            health = "-10";
        }else if(againstType == "Fire"){
            health = "-10";
        }else if(againstType == "Grass"){
            health = "-10";
        }else if(againstType == "Normal"){
            health = "-10";
        }
        learnTime = "4";
        accuracy = "75";
        timesCanBeUsed = "10";
        speed = "5";
        type = "Normal";
        healthPerRound = "0";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
    public String normali(String againstType){
        if(againstType == "Water"){
            health = "-20";
        }else if(againstType == "Fire"){
            health = "-20";
        }else if(againstType == "Grass"){
            health = "-20";
        }else if(againstType == "Normal"){
            health = "-20";
        }
        learnTime = "5";
        accuracy = "50";
        timesCanBeUsed = "10";
        speed = "3";
        type = "Normal";
        healthPerRound = "-10";
        return "health: " + health + " healthPerRound: " + healthPerRound+ " learnTime: " + learnTime + " accuracy: " + accuracy + " timesCanBeUsed: " + timesCanBeUsed + " speed: " + speed + " Type: " + type; 
    }
}
