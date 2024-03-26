public class Kogtevran extends Hogwarts{
    private int um;
    private int mudrost;
    private int ostroumnost;
    private int tvorchestvo;

    public Kogtevran(String name, int magicPower, int transgressivPower, int um, int mudrost, int ostroumnost, int tvorchestvo) {
        super(name, magicPower, transgressivPower);
        this.um = um;
        this.mudrost = mudrost;
        this.ostroumnost = ostroumnost;
        this.tvorchestvo = tvorchestvo;
    }

    public int getUm() {
        return um;
    }

    public int getMudrost() {
        return mudrost;
    }

    public int getOstroumnost() {
        return ostroumnost;
    }

    public int getTvorchestvo() {
        return tvorchestvo;
    }

    public void setUm(int um) {
        this.um = um;
    }

    public void setMudrost(int mudrost) {
        this.mudrost = mudrost;
    }

    public void setOstroumnost(int ostroumnost) {
        this.ostroumnost = ostroumnost;
    }

    public void setTvorchestvo(int tvorchestvo) {
        this.tvorchestvo = tvorchestvo;
    }
    public void comparePowerKogtevran(Kogtevran otherKogtevran) {
        String thisName = this.getName();
        String otherName = otherKogtevran.getName();
        int thisTotalPower = this.mudrost + this.ostroumnost + this.tvorchestvo + this.um;
        int otherTotalPower = otherKogtevran.getMudrost() + otherKogtevran.getUm() + otherKogtevran.getOstroumnost() + otherKogtevran.getTvorchestvo();

        if (thisTotalPower > otherTotalPower) {
            System.out.println(thisName + " более выраженный когтевранец, чем " + otherName);
        } else if (thisTotalPower < otherTotalPower) {
            System.out.println(otherName + " более выраженный когтевранец, чем " + thisName);
        } else {
            System.out.println("В совокупности " + thisName + " и " + otherName + " оба достойные когтевранцы");
        }
    }
}
