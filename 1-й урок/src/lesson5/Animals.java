package lesson5;



public abstract class Animals {

    protected String name;//Бег
   //Ограничения
    protected int restriction;//Бег
    protected double jumpRestriction;//Прыжки вверх
    protected int swim;//Плаванье

    public Animals( String name, int restriction, double jumpRestriction, int swim) {

        this.name = name;
        this.restriction = restriction;
        this.jumpRestriction = jumpRestriction;
        this.swim = swim;
    }

    public String getCanRun(int run) {
        if (run>=this.restriction){
            return this.name + " не смогла пробежать: " +run;
        }else {
            return this.name + " пробежала: "+run;
        }
    }

    public String getCanjump(double jump) {
        if (jump>=this.jumpRestriction){
            return this.name + " не смогла прыгнуть: " +jump;
        }else {
            return this.name + " прыгнула: " +jump;
        }
    }
    public String getCanswim(double swimlp) {
        if (swimlp>=this.swim){
            return this.name + " не смогла проплыть: "+swimlp;
        }else {
            return this.name + "проплыть: "+swimlp;
        }
    }


}
