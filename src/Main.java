public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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

        int machineBattle1Month = machineBattle1Minutes * 44640;
        System.out.println("За месяц, машина произвела " + machineBattle1Month + " штук бутылок"); //я взял за 31 день (месяц)
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

    public static void task6 () {
        byte allBananas = 5;
        short allMilk = 200;
        byte allIceCream = 2;
        byte allEggs = 4;
        int gramsBananas = allBananas * 80;
        int gramsMilk = allMilk /100 * 105;
        int gramsIceCream = allIceCream * 100;
        int gramsEggs = allEggs * 70;
        int allGrams = gramsBananas + gramsMilk + gramsIceCream + gramsEggs;
        System.out.println("Вес всего завтрака " + allGrams + " грамм");
        float allKg = allGrams / 1000F;
        System.out.println("Вес всего завтрака " + allKg + " кг");
    }

    public static void task7 () {
        byte allKgLoseWeight = 7;
        int allGramsLoseWeight = allKgLoseWeight * 1000;
        int loseWeightDay250 = allGramsLoseWeight / 250;
        int loseWeightDay500 = allGramsLoseWeight / 500;
        System.out.println("При похудении на 250 грамм в день, потребуется " + loseWeightDay250 + " дней");
        System.out.println("При похудени на 500 грамм в день, потребуется " + loseWeightDay500 + " дней");
        int averageDayLoseWeight = (loseWeightDay250 + loseWeightDay500) / 2;
        System.out.println("Срденее колиество дней для похудения будет - " + averageDayLoseWeight + " дней");
    }

    public static void task8 () {
        int mashaMonth = 67760;
        int denisMonth = 83690;
        int crisMonth = 76230;
        int mashaMonth10 = mashaMonth * 10 /100;
        int mashaMonthNew = mashaMonth + mashaMonth10;
        int mashaYearDiff = mashaMonth10 *12;
        System.out.println("Маша теперь получает " + mashaMonthNew + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");
        int denisMonth10 = denisMonth * 10 / 100;
        int denisMonthNew = denisMonth + denisMonth10;
        int denisYearDiff = denisMonth10 * 12;
        System.out.println("Денис теперь получает " + denisMonthNew + " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");
        int crisMonth10 = crisMonth * 10 / 100;
        int crisMonthNew = crisMonth10 + crisMonth;
        int crisYearDiff = crisMonth10 * 12;
        System.out.println("Кристина теперь получает " + crisMonthNew + " рублей. Годовой доход вырос на " + crisYearDiff + " рублей");
    }
}