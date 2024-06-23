public class Slytherin extends GeneralProperties{
    int cunning;
    int determination;
    int resourcefulness;
    int lustForPower;

    public Slytherin (String name, String surname, int powerOfMagic, int transgressionRange, int cunning, int determination, int resourcefulness, int lustForPower){
        super(name, surname, powerOfMagic, transgressionRange);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
}
