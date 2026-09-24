package opgave4;

public class Player {
    private String name;
    private int skillLevel;

    public Player(String name, int skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }
    @Override
    public String toString() {
        return "name " + name + "skillLevel" + skillLevel;

    }
    public int getAverageSkill(){
        return skillLevel;

    }
}
