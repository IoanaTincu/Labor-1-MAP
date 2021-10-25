package Hausaufgabe1;

public class Aufgabe2 {

    /**
     *
     * @param arrayZahlen enthalt positive Zahlen
     * @return das Maximum
     */
    public static int hochste_Zahl(int[] arrayZahlen)
    {
        int maximum = -1;

        for(int i = 0; i < arrayZahlen.length; i++)
            if(arrayZahlen[i] > maximum)
                maximum = arrayZahlen[i];

        return maximum;
    }

    /**
     *
     * @param arrayZahlen enthalt positive Zahlen
     * @return das Maximum
     */
    public static int kleinste_Zahl(int[] arrayZahlen)
    {
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < arrayZahlen.length; i++)
            if(arrayZahlen[i] < minimum)
                minimum = arrayZahlen[i];

        return minimum;
    }

    /**
     *
     * @param arrayZahlen enthalt positive Zahlen
     * @return die Summe der Zahlen
     */
    public static int sum_of_elements(int[] arrayZahlen)
    {
        int sum = 0;

        for(int i = 0; i < arrayZahlen.length; i++)
            sum = sum + arrayZahlen[i];

        return sum;
    }

    /**
     * maximale Summe von n-1 Zahlen = Summe - Minimum
     * @param array enthalt positive Zahlen
     * @return maximale Summe von n-1 Zahlen
     */
    public static int maximale_Summe(int[] array)
    {
        return sum_of_elements(array) - kleinste_Zahl(array);
    }

    /**
     * minimale Summe von n-1 Zahlen = Summe - Maximum
     * @param array enthalt positive Zahlen
     * @return minimale Summe von n-1 Zahlen
     */
    public static int minimale_Summe(int[] array)
    {
        return sum_of_elements(array) - hochste_Zahl(array);
    }
}
