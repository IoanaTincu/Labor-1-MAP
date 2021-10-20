package Hausaufgabe1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {4, 8, 3, 10, 63, 80};

        System.out.println("\tAufgabe 1");
        int[] newArray1 = Aufgabe1.nicht_ausreichende_Noten(array);
        System.out.print("Nicht ausreichende Noten: ");
        for (int i = 0; i < newArray1.length; i++)
            System.out.print(newArray1[i] + " ");

        double average = Aufgabe1.durchschnittswert(array);
        System.out.println("\nDurchschnittswert: " + average);

        newArray1 = Aufgabe1.aufgerundete_Noten(array);
        System.out.print("Aufgerundete Noten: ");
        for (int i = 0; i < newArray1.length; i++)
            System.out.print(newArray1[i] + " ");

        int maximum = Aufgabe1.maximale_abgerundete_Note(array);
        System.out.println("\nMaximum: " + maximum);


        System.out.println("\n\tAufgabe 2");
        maximum = Aufgabe2.maximale_Zahl(array);
        System.out.println("Maximale Zahl: " + maximum);

        int minimum = Aufgabe2.minimale_Zahl(array);
        System.out.println("Minimale Zahl: " + minimum);

        int maximal_sum = Aufgabe2.maximale_Summe(array);
        System.out.println("Maximale Summe: " + maximal_sum);

        int minimal_sum = Aufgabe2.minimale_Summe(array);
        System.out.println("Minimale Summe: " + minimal_sum);


        System.out.println("\n\tAufgabe 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl 1 fur Differenz: ");
        String number1 = sc.nextLine();
        System.out.print("Zahl 2 fur Differenz: ");
        String number2 = sc.nextLine();

        int[] array1 = Aufgabe3.Differenz(number1, number2);
        int i = 0;

        while (i < array1.length && array1[i] == 0)
            i++;
        System.out.print("Differenz: ");
        if (i == array1.length)
            System.out.println("0");
        else {
            if (array1.length == number1.length() + 1) {
                System.out.print("-");
                for (int j = i; j < array1.length - 1; j++)
                    System.out.print(array1[j] + " ");
            } else
                for (int j = i; j < array1.length; j++)
                    System.out.print(array1[j] + " ");
        }

        System.out.print("\n\nZahl 1 fur Summe: ");
        number1 = sc.nextLine();
        System.out.print("Zahl 2 fur Summe: ");
        number2 = sc.nextLine();

        int[] array2 = Aufgabe3.Summe(number1, number2);
        i = 0;

        while (i < array2.length && array2[i] == 0)
            i++;
        System.out.print("Summe: ");
        if (i == array2.length)
            System.out.println("0");
        else
            for (int j = i; j < array2.length; j++)
                System.out.print(array2[j] + " ");


        System.out.print("\n\nZahl 1 fur Multiplikation: ");
        number1 = sc.nextLine();
        System.out.print("Ziffer fur Multiplikation: ");
        number2 = sc.nextLine();

        int[] array3 = Aufgabe3.Multiplikation(number1, number2);
        i = 0;

        while (i < array3.length && array3[i] == 0)
            i++;
        System.out.print("Multiplikation: ");
        if (i == array3.length)
            System.out.println("0");
        else
            for (int j = i; j < array3.length; j++)
                System.out.print(array3[j] + " ");


        System.out.print("\n\nZahl 1 fur Division: ");
        number1 = sc.nextLine();
        System.out.print("Ziffer fur Division: ");
        number2 = sc.nextLine();

        try {
            int[] array4 = Aufgabe3.Division(number1, number2);
            i = 0;

            while (i < array4.length && array4[i] == 0)
                i++;
            System.out.print("Division: ");
            if (i == array4.length)
                System.out.println("0");
            else
                for (int j = i; j < array4.length; j++)
                    System.out.print(array4[j] + " ");
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("\n\n\tAufgabe 4");

        List<Integer> pricesUSB = new ArrayList<Integer>(Arrays.asList(8, 12));
        List<Integer> pricesKeyboard = new ArrayList<Integer>(Arrays.asList(40, 60));
        ElektronikShop shop = new ElektronikShop(pricesUSB, pricesKeyboard);

        int cheapestKeyboard = shop.billigste_Tastatur();
        System.out.println("Billigste Tastatur: " + cheapestKeyboard);

        int mostExpensiveThing = shop.teuerster_Gegenstand();
        System.out.println("Teuerster Gegenstand: " + mostExpensiveThing);

        int mostExpensiveUSB = shop.teuerstes_USB(30);
        System.out.println("Teuerstes USB: " + mostExpensiveUSB);

        int maximumBudget = shop.maximaler_Geldbetrag(60);
        System.out.println("Maximaler Geldbetrag: " + maximumBudget);
    }
}
