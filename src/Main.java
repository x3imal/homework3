public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        }

    public static void task1 () {
        byte cat = -29;
        short mouse = 366;
        int dog = 56555;
        long fly = 9996651;
        float apple = 1.8F;
        double orange = 6.556;
        System.out.println("Значние переменной cat c типом byte равно " + cat);
        System.out.println("Значние переменной mouse c типом short равно " + mouse);
        System.out.println("Значние переменной dog c типом int равно " + dog);
        System.out.println("Значние переменной fly c типом long равно " + fly);
        System.out.println("Значние переменной apple c типом float равно " + apple);
        System.out.println("Значние переменной orange c типом double равно " + orange);
    }

    public static void task2 () {
        float potato = 27.12F;
        System.out.println(potato);

        long bottle = 987678965549L;
        System.out.println(bottle);

        double tomato = 2.786;
        System.out.println(tomato);

        short pan = 569;
        System.out.println(pan);

        short temp = -159;
        System.out.println(temp);

        short money = 27897;
        System.out.println(money);

        byte all = 67;
        System.out.println(all);
    }

    public static void task3 () {
        byte ludPal = 23;
        byte annSer = 27;
        byte ekaAnd = 30;
        short allPaper = 480;
        int oneChildren = allPaper / (ludPal + annSer + ekaAnd);
        System.out.println("На каждого ученика рассчитано " + oneChildren + " листов бумаги");
    }

    public static void task4 () {
        byte machineBattle2Minutes = 16;
        int machineBattle1Minutes = machineBattle2Minutes / 2;
        int machineBattle20Minutes = machineBattle1Minutes * 20;
        System.out.println("За 20 минут машина произвела " + machineBattle20Minutes + " штук бутылок");

        int machineBattleOneDay = machineBattle1Minutes * 1440;
        System.out.println("За одни сутки машина произвела " + machineBattleOneDay + " штук бутылок");

        int machineBattleThreeDays = machineBattle1Minutes * 4320;
        System.out.println("За три дня, машина произвела " + machineBattleThreeDays + " штук бутылок");

        int machineBattle1Mans = machineBattle1Minutes * 44640;
        System.out.println("За месяц, машина произвела " + machineBattle1Mans + " штук бутылок");
    }

    public static void task5 () {
        byte allDye = 120;
        byte oneClasWhite = 2;
        byte oneClasBrown = 4;
        int oneClasDye = oneClasBrown + oneClasWhite;
        int allClasSchool = allDye / oneClasDye;
        int allClasBrown = allClasSchool * oneClasBrown;
        int allClasWhite = allClasSchool * oneClasWhite;
        System.out.println("В школе, где " + allClasSchool + " классов, нужно " + allClasWhite + " банок белой краски и " + allClasBrown + " ,банок коричневой краски");
    }
}