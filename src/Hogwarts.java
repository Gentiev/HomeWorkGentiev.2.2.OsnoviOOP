public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressivPower;

    public Hogwarts(String name, int magicPower, int transgressivPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressivPower = transgressivPower;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressivPower() {
        return transgressivPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressivPower(int transgressivPower) {
        this.transgressivPower = transgressivPower;
    }
    public void comparePower(Hogwarts otherStudent) {
        int thisTotalPower = this.magicPower + this.transgressivPower;
        int otherTotalPower = otherStudent.getMagicPower() + otherStudent.getTransgressivPower();

        if (thisTotalPower > otherTotalPower) {
            System.out.println(this.name + " обладает большей совокупной мощностью, чем " + otherStudent.getName());
        } else if (thisTotalPower < otherTotalPower) {
            System.out.println(otherStudent.getName() + " обладает большей совокупной мощностью, чем " + this.name);
        } else {
            System.out.println("Совокупная мощность у " + this.name + " и " + otherStudent.getName() + " одинакова.");
        }
    }
}
