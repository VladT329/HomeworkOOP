public class Griffindor extends GeneralProperties{
    String nobility;
    String honor;
    String bravery;

    public Griffindor (String name, String surname, int powerOfMagic, int transgressionRange, String nobility, String honor, String bravery){
        super(name, surname, powerOfMagic, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        nobility = "благородство";
        honor = "честь";
        bravery = "храбрость";
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public String getBravery() {
        return bravery;
    }

    public void setBravery(String bravery) {
        this.bravery = bravery;
    }
}
