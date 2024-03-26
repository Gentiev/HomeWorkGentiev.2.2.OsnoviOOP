public class PrintService {
    public void print(Griffendor[] griffendors) {
        for (int i = 0; i < griffendors.length; i++) {
            Griffendor griffendor = griffendors[i];
            System.out.println("Имя " + griffendor.getName() +
                    ", сила магии " + griffendor.getMagicPower() +
                    ", сила трансгрессирования " + griffendor.getTransgressivPower() +
                    ", благородство " + griffendor.getBlagorodstvo() +
                    ", честь " + griffendor.getChest() +
                    ", храбрость " + griffendor.getHrabrost());
        }
    }

    public void print(Puffendui[] puffenduis) {
        for (int i = 0; i < puffenduis.length; i++) {
            Puffendui puffendui = puffenduis[i];
            System.out.println("Имя " + puffendui.getName() +
                    ", сила магии " + puffendui.getMagicPower() +
                    ", сила трансгрессирования " + puffendui.getTransgressivPower() +
                    ", трудолюбие " + puffendui.getTrudolubie() +
                    ", верность " + puffendui.getVernost() +
                    ", честность " + puffendui.getChestnost());
        }
    }

    public void print(Kogtevran[] kogtevrans) {
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя " + kogtevran.getName() +
                    ", сила магии " + kogtevran.getMagicPower() +
                    ", сила трансгрессирования " + kogtevran.getTransgressivPower() +
                    ", ум " + kogtevran.getUm() +
                    ", мудрость " + kogtevran.getMudrost() +
                    ", остроумие " + kogtevran.getOstroumnost() +
                    ", творчество " + kogtevran.getTvorchestvo());
        }
    }

    public void print(Slizerin[] slizerins) {
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println("Имя " + slizerin.getName() +
                    ", сила магии " + slizerin.getMagicPower() +
                    ", сила трансгрессирования " + slizerin.getTransgressivPower() +
                    ", хитрость " + slizerin.getHitrost() +
                    ", решительность " + slizerin.getReshitelnost() +
                    ", амбициозность " + slizerin.getAmbicii() +
                    ", находчивость " + slizerin.getNahodchivost() +
                    ", жажда власти " + slizerin.getZhazhdaVlasti());
        }
    }
}
