public class Slizerin extends Hogwarts{
    private int hitrost;
    private int reshitelnost;
    private int ambicii;
    private int nahodchivost;
    private int zhazhdaVlasti;

    public Slizerin(String name, int magicPower, int transgressivPower, int hitrost, int reshitelnost, int ambicii, int nahodchivost, int zhazhdaVlasti) {
        super(name, magicPower, transgressivPower);
        this.hitrost = hitrost;
        this.reshitelnost = reshitelnost;
        this.ambicii = ambicii;
        this.nahodchivost = nahodchivost;
        this.zhazhdaVlasti = zhazhdaVlasti;
    }

    public int getHitrost() {
        return hitrost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public int getAmbicii() {
        return ambicii;
    }

    public int getNahodchivost() {
        return nahodchivost;
    }

    public int getZhazhdaVlasti() {
        return zhazhdaVlasti;
    }

    public void setHitrost(int hitrost) {
        this.hitrost = hitrost;
    }

    public void setReshitelnost(int reshitelnost) {
        this.reshitelnost = reshitelnost;
    }

    public void setAmbicii(int ambicii) {
        this.ambicii = ambicii;
    }

    public void setNahodchivost(int nahodchivost) {
        this.nahodchivost = nahodchivost;
    }

    public void setZhazhdaVlasti(int zhazhdaVlasti) {
        this.zhazhdaVlasti = zhazhdaVlasti;
    }

    public void comparePowerSlizerin(Slizerin otherSlizerin) {
        String thisName = this.getName();
        String otherName = otherSlizerin.getName();
        int thisTotalPower = this.ambicii + this.hitrost + this.nahodchivost + this.zhazhdaVlasti + this.reshitelnost;
        int otherTotalPower = otherSlizerin.getAmbicii() + otherSlizerin.getZhazhdaVlasti() + otherSlizerin.getNahodchivost() + otherSlizerin.getReshitelnost() + otherSlizerin.getHitrost();

        if (thisTotalPower > otherTotalPower) {
            System.out.println(thisName + " более выраженный слизеринец, чем " + otherName);
        } else if (thisTotalPower < otherTotalPower) {
            System.out.println(otherName + " более выраженный слизеринец, чем " + thisName);
        } else {
            System.out.println("В совокупности " + thisName + " и " + otherName + " оба достойные слизеринца");
        }
    }
}
