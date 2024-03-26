public class Main {
    //    Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
//    Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
//    Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
//    На факультете Когтевран учатся Чжоу Чанг, Падма Патил и Маркус Белби.
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри Поттер", 8, 1),
                new Hogwarts("Гермиона Грейнджер", 7, 2),
                new Hogwarts("Рон Уизли", 6, 3),
                new Hogwarts("Захария Смит", 3, 4),
                new Hogwarts("Седрик Диггори", 6, 5),
                new Hogwarts("Джастин Финч", 9, 6),
                new Hogwarts("Чжоу Чанг", 8, 7),
                new Hogwarts("Падма Патил", 2, 8),
                new Hogwarts("Маркус Белби", 5, 9),
                new Hogwarts("Драко Малфой", 3, 10),
                new Hogwarts("Грэхэм Монтегю", 4, 11),
                new Hogwarts("Грегори Гойл", 1, 12)
        };
        Griffendor[] griffendors = {
                new Griffendor("Гарри Поттер", 8, 1, 3, 4, 2),
                new Griffendor("Гермиона Грейнджер", 7, 2, 5, 6, 1),
                new Griffendor("Рон Уизли", 6, 3, 9, 5, 7)
        };
        Puffendui[] puffenduis = {
                new Puffendui("Захария Смит", 3, 4, 2, 3, 6),
                new Puffendui("Седрик Диггори", 6, 5, 9, 5, 1),
                new Puffendui("Джастин Финч", 9, 6, 4, 4, 8)
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг", 8, 7, 1, 3, 4, 5),
                new Kogtevran("Падма Патил", 2, 8, 3, 5, 2, 9),
                new Kogtevran("Маркус Белби", 5, 9, 6, 2, 8, 7)
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 3, 10, 4, 5, 9, 2, 3),
                new Slizerin("Грэхэм Монтегю", 4, 11, 4, 2, 6, 3, 9),
                new Slizerin("Грегори Гойл", 1, 12, 2, 6, 4, 7, 6)
        };

        PrintService printService = new PrintService();
        printService.print(griffendors);
        printService.print(puffenduis);
        printService.print(kogtevrans);
        printService.print(slizerins);

        students[0].comparePower(students[1]);
        griffendors[1].comparePowerGriffendor(griffendors[0]);
        puffenduis[1].comparePowerPuffendui(puffenduis[0]);
        kogtevrans[1].comparePowerKogtevran(kogtevrans[0]);
        slizerins[1].comparePowerSlizerin(slizerins[0]);
    }
}