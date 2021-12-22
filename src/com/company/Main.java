package com.company;

public class Main {

    public static void main(String[] args) {
        // solution1
        byte a = 5;
        short b = 7;
        int c = 189;
        long d = 25642101L;
        float e = 1.568f;
        double j = 2.5689412;
        char ch = 'A';
        boolean k = true;

        // solution2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float sumWeight = boxerWeight1 + boxerWeight2;
        System.out.println(sumWeight);
        float differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println(differenceWeight);

        // solution3
        int bananasAmount = 5;
        int bananasWeight = 80;
        int milkVolumeMl = 200;
        int milkWeightPer100Ml = 105;
        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int eggsAmount = 4;
        int eggsWeight = 70;
        int sumWeightInGram = bananasAmount * bananasWeight + (milkVolumeMl / 100) * milkWeightPer100Ml + iceCreamAmount * iceCreamWeight + eggsAmount * eggsWeight;
        float sumWeightInKilogram = (float) sumWeightInGram / 1000;
        System.out.println(sumWeightInKilogram);

        //solution4
        int throwWeight = 7;
        int weightInDay1 = 250;
        int weightInDay2 = 500;
        float weightInDay1InKilogram = (float) weightInDay1 / 1000;
        float weightInDay2InKilogram = (float) weightInDay2 / 1000;
        float amountDays1 = throwWeight / weightInDay1InKilogram;
        float amountDays2 = throwWeight / weightInDay2InKilogram;
        System.out.println(amountDays1);
        System.out.println(amountDays2);
        float meanAmountDays = (amountDays1 + amountDays2) / 2;
        System.out.println(meanAmountDays);

        //solution5
        float moneyMasha = 67_760f;
        float moneyDenis = 83_690f;
        float moneyCris = 76_230f;
        int percent = 10;
        float multiplyCoefficient = (float) percent / 100;
        float newMoneyMasha = moneyMasha * (1 + multiplyCoefficient);
        float newMoneyDenis = moneyDenis * (1 + multiplyCoefficient);
        float newMoneyCris = moneyCris * (1 + multiplyCoefficient);
        int months = 12;
        float moneyMashaInYear = moneyMasha * months;
        float moneyDenisInYear = moneyDenis * months;
        float moneyCrisInYear = moneyCris * months;
        float newMoneyMashaInYear = newMoneyMasha * months;
        float newMoneyDenisInYear = newMoneyDenis * months;
        float newMoneyCrisInYear = newMoneyCris * months;
        float increaseMoneyMashaInYear = newMoneyMashaInYear - moneyMashaInYear;
        float increaseMoneyDenisInYear = newMoneyDenisInYear - moneyDenisInYear;
        float increaseMoneyCrisInYear = newMoneyCrisInYear - moneyCrisInYear;
        System.out.println("Маша теперь получает " + newMoneyMasha + " рублей в месяц. Годовой доход вырос на " + increaseMoneyMashaInYear + " рублей.");
        System.out.println("Денис теперь получает " + newMoneyDenis + " рублей в месяц. Годовой доход вырос на " + increaseMoneyDenisInYear + " рублей.");
        System.out.println("Кристина теперь получает " + newMoneyCris + " рублей в месяц. Годовой доход вырос на " + increaseMoneyCrisInYear + " рублей.");
    }
}
