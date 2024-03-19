// Name: Sri Shanka
// version 1
// Monster class for A1

public class Monster
{
    // code your task 2a here
    private String monsterName;
    private int attackValue,defenceValue,healthValue;

    //Constructor
    public Monster()
    {

        monsterName = "Tom";
        attackValue = 5;
        defenceValue = 5;
        healthValue = 5;

    }

    //Constructor
    public Monster(String newName,int newAttackVal, int newDefenceVal, int newHealthVal)
    {

        monsterName = newName;
        attackValue = newAttackVal;
        defenceValue = newDefenceVal;
        healthValue = newHealthVal;

    }

    public int getAttackVal()
    {

        return attackValue;

    }

    public int getDefenceVal()
    {

        return defenceValue;

    }

    public int getHealthVal()
    {

        return healthValue;

    }

    public String getMonsterName()
    {

        return monsterName;

    }

    public void setAttackVal(int newAttackVal)
    {

        attackValue = newAttackVal;

    }

    public void setDefenceVal(int newDefenceVal)
    {

        defenceValue = newDefenceVal;

    }

    public void setHealthVal(int newHealthVal)
    {

        healthValue = newHealthVal;

    }

    public void setMonsterName(String newName)
    {

        monsterName = newName;

    }


}
