public class Main {
    public static void main(String[] args) {
        int myInt = 40000;
        byte myByte = 22;
        short myShort = 32000;
        long myLong = 100000L;
        float myFloat = 3.75f;
        double myDouble = 12.3456789;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        // task 2

        double valueDouble = 27.12;
        long  bigLong = 987678965549L;
        float valueFloat = 2.786f;
        short valueShort = 569;
        int negativeInt = -159;
        short anotherShort = 27897;
        byte smallByte = 67;

        System.out.println("Значение переменной valueDouble с типом double равно " + valueDouble);
        System.out.println("Значение переменной bigLong с типом long равно " + bigLong);
        System.out.println("Значение переменной valueFloat с типом float равно " + valueFloat);
        System.out.println("Значение переменной valueShort с типом short равно " + valueShort);
        System.out.println("Значение переменной negativeByte с типом byte равно " + negativeInt);
        System.out.println("Значение переменной anotherShort с типом short равно " + anotherShort);
        System.out.println("Значение переменной smallByte с типом byte равно " + smallByte);

        // task 3

        int lydmilaPavlovna = 23;
        int annaServeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalPaper = 480;

        int totalStudents = lydmilaPavlovna + annaServeevna + ekaterinaAndreevna;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // task 4

        int bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesIn3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        //task 5

        int totalPaintCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int paintPerClass = whitePerClass + brownPerClass;
        int numberOfClasses = totalPaintCans / paintPerClass;
        int totalWhite = numberOfClasses * whitePerClass;
        int totalBrown = numberOfClasses * brownPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

    }
}
