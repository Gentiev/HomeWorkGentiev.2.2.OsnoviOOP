public class Puffendui extends Hogwarts{
    private int trudolubie;
    private int vernost;
    private int chestnost;

    public Puffendui(String name, int magicPower, int transgressivPower, int trudolubie, int vernost, int chestnost) {
        super(name, magicPower, transgressivPower);
        this.trudolubie = trudolubie;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    public int getTrudolubie() {
        return trudolubie;
    }

    public int getVernost() {
        return vernost;
    }

    public int getChestnost() {
        return chestnost;
    }

    public void setTrudolubie(int trudolubie) {
        this.trudolubie = trudolubie;
    }

    public void setVernost(int vernost) {
        this.vernost = vernost;
    }

    public void setChestnost(int chestnost) {
        this.chestnost = chestnost;
    }

    public void comparePowerPuffendui(Puffendui otherPuffendui) {
        String thisName = this.getName();
        String otherName = otherPuffendui.getName();
        int thisTotalPower = this.vernost + this.chestnost + this.trudolubie;
        int otherTotalPower = otherPuffendui.getVernost() + otherPuffendui.getChestnost() + otherPuffendui.getTrudolubie();

        if (thisTotalPower > otherTotalPower) {
            System.out.println(thisName + " более выраженный пуффендуец, чем " + otherName);
        } else if (thisTotalPower < otherTotalPower) {
            System.out.println(otherName + " более выраженный пуффендуец, чем " + thisName);
        } else {
            System.out.println("В совокупности " + thisName + " и " + otherName + " оба достойные пуффендуйцы");
        }
    }
}
