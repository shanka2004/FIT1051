public class Monster
{
    // code your task 2a here
    private String monsterName;
    private int attackVal,defenceVal,healthVal;

    //Constructor
    public Monster()
    {
        monsterName = "Tom";
        attackVal = 5;
        defenceVal = 5;
        healthVal = 5;
    }

    //Constructor
    public Monster(String newName,int newAttackVal, int newDefenceVal, int newHealthVal){
        monsterName = newName;
        attackVal = newAttackVal;
        defenceVal = newDefenceVal;
        healthVal = newHealthVal;
    }

    public String getMonsterName(){
        return monsterName;
    }
    public int getAttackVal(){
        return attackVal;
    }
    public int getDefenceVal(){
        return defenceVal;
    }
    public int getHealthVal(){
        return healthVal;
    }

    public void setMonsterName(String newName){
        monsterName = newName;
    }
    public void setAttackVal(int newAttackVal){
        attackVal = newAttackVal;
    }
    public void setDefenceVal(int newDefenceVal){
        defenceVal = newDefenceVal;
    }
    public void setHealthVal(int newHealthVal){
        healthVal = newHealthVal;
    }

}
