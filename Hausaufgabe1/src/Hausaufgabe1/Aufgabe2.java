package Hausaufgabe1;

public class Aufgabe2 {

    public static int maximale_Zahl(int[] array)
    {
        int maximum = -1;

        for(int i = 0; i < array.length; i++)
            if(array[i] > maximum)
                maximum = array[i];

        return maximum;
    }

    public static int minimale_Zahl(int[] array)
    {
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++)
            if(array[i] < minimum)
                minimum = array[i];

        return minimum;
    }

    public static int sum_of_elements(int[] array)
    {
        int sum = 0;

        for(int i = 0; i < array.length; i++)
            sum = sum + array[i];

        return sum;
    }

    public static int maximale_Summe(int[] array)
    {
        return sum_of_elements(array) - minimale_Zahl(array);
    }

    public static int minimale_Summe(int[] array)
    {
        return sum_of_elements(array) - maximale_Zahl(array);
    }
}
