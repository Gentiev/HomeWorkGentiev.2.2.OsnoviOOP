public class Griffendor extends Hogwarts {
    private int blagorodstvo;
    private int chest;
    private int hrabrost;

    public Griffendor(String name, int magicPower, int transgressivPower, int blagorodstvo, int chest, int hrabrost) {
        super(name, magicPower, transgressivPower);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public int getHrabrost() {
        return hrabrost;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        this.blagorodstvo = blagorodstvo;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public void setHrabrost(int hrabrost) {
        this.hrabrost = hrabrost;
    }
    public void comparePowerGriffendor(Griffendor otherGriffendors) {
        String thisName = this.getName();
        String otherName = otherGriffendors.getName();
        int thisTotalPower = this.blagorodstvo + this.chest + this.hrabrost;
        int otherTotalPower = otherGriffendors.getBlagorodstvo() + otherGriffendors.getChest() + otherGriffendors.getHrabrost();

        if (thisTotalPower > otherTotalPower) {
            System.out.println(thisName + " более выраженный гриффендорец, чем " + otherName);
        } else if (thisTotalPower < otherTotalPower) {
            System.out.println(otherName + " более выраженный гриффендорец, чем " + thisName);
        } else {
            System.out.println("В совокупности " + thisName + " и " + otherName + " оба достойные гриффендорцы");
        }
    }
}
