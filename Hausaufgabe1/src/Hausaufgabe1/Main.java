package Hausaufgabe1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Aufgabe1 aufgabe1 = new Aufgabe1();
        int[] array = {4, 8, 3, 10, 17};

        int[] newArray = aufgabe1.nicht_ausreichende_Noten(array);
        for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");

        double average = aufgabe1.durchschnittswert(array);
        System.out.println(average);

        newArray = aufgabe1.aufgerundete_Noten(array);
        for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");

        int maximum = aufgabe1.maximale_abgerundete_Note(array);
        System.out.println(maximum);

        Aufgabe2 aufgabe2 = new Aufgabe2();

        maximum = aufgabe2.maximale_Zahl(array);
        System.out.println(maximum);

        int minimum = aufgabe2.minimale_Zahl(array);
        System.out.println(minimum);

        int maximal_sum = aufgabe2.maximale_Summe(array);
        System.out.println(maximal_sum);

        int minimal_sum = aufgabe2.minimale_Summe(array);
        System.out.println(minimal_sum);

        Aufgabe3 aufgabe3 = new Aufgabe3();

        Scanner sc = new Scanner(System.in);
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();

        array = aufgabe3.Differenz(number1, number2);
        int i = 0;

        while (i < array.length && array[i] == 0)
            i++;
        if (i == array.length)
            System.out.println("0");
        else {
            if (array.length == number1.length() + 1) {
                System.out.print("-");
                for (int j = i; j < array.length - 1; j++)
                    System.out.print(array[j] + " ");
            } else
                for (int j = i; j < array.length; j++)
                    System.out.print(array[j] + " ");
        }

        number1 = sc.nextLine();
        number2 = sc.nextLine();

        array = aufgabe3.Summe(number1, number2);
        i = 0;

        while (i < array.length && array[i] == 0)
            i++;
        if (i == array.length)
            System.out.println("0");
        else
            for (int j = i; j < array.length; j++)
                System.out.print(array[j] + " ");

        number1 = sc.nextLine();
        number2 = sc.nextLine();

        array = aufgabe3.Multiplikation(number1, number2);
        i = 0;

        while (i < array.length && array[i] == 0)
            i++;
        if (i == array.length)
            System.out.println("0");
        else
            for (int j = i; j < array.length; j++)
                System.out.print(array[j] + " ");

        number1 = sc.nextLine();
        number2 = sc.nextLine();

        try {
            array = aufgabe3.Division(number1, number2);
            i = 0;

            while (i < array.length && array[i] == 0)
                i++;
            if (i == array.length)
                System.out.println("0");
            else
                for (int j = i; j < array.length; j++)
                    System.out.print(array[j] + " ");
        } catch (Exception e) {
            System.out.println(e);
        }

        */List<Integer> pricesUSB = new ArrayList<Integer>(Arrays.asList(8, 12));
        List<Integer> pricesKeyboard = new ArrayList<Integer>(Arrays.asList(40, 60));
        ElektronikShop shop = new ElektronikShop(pricesUSB, pricesKeyboard);

        int cheapestKeyboard = shop.billigste_Tastatur();
        System.out.println(cheapestKeyboard);

        int mostExpensiveThing = shop.teuerster_Gegenstand();
        System.out.println(mostExpensiveThing);

        int mostExpensiveUSB = shop.teuerstes_USB(30);
        System.out.println(mostExpensiveUSB);

        int maximumBudget = shop.maximaler_Geldbetrag(60);
        System.out.println(maximumBudget);
    }
}
