package Hausaufgabe1;

public class Aufgabe1 {

    /**
     *
     * @param array enthalt die nicht aufgerundeten Noten
     * @return ein Array mit den nicht ausreichenden Noten wird zuruckgegeben
     */
    public static int[] nicht_ausreichende_Noten(int[] array)
    {
        int[] newArray = new int[array.length];
        int index = 0;

        for(int i = 0; i < array.length; i++)
            if(array[i] < 38) // 38 und 39 werden schon auf 40 aufgerundet
            {
                newArray[index] = array[i];
                index++;
            }

        int[] finalArray = new int[index]; // in newArray kann es leere Positionen geben
        for(int i = 0; i < index; i++)
            finalArray[i] = newArray[i];

        return finalArray;
    }

    /**
     *
     * @param array enthalt die nicht aufgerundeten Noten
     * @return der Durchschnittswert der aufgerundeten Noten wird zuruckgegeben
     */
    public static double durchschnittswert(int[] array)
    {
        int sum = 0;
        array = aufgerundete_Noten(array); // wir berechnen den Durchschnittswert der Noten nach der Aufrundung

        for(int i = 0; i < array.length; i++)
            sum += array[i];

        return (double) sum/array.length;
    }

    /**
     *
     * @param array enthalt die nicht aufgerundeten Noten
     * @return das Array mit den aufgerundeten Noten wird zuruckgegeben
     */
    public static int[] aufgerundete_Noten(int[] array)
    {
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++)
            if(array[i] < 38)
                newArray[i] = array[i]; // Noten < 38 werden nicht aufgerundet
            else
                if(5 - array[i]%5 < 3) // Differenz zwischen der Note und dem nachsten Vielfachen von 5
                    newArray[i] = array[i] + 5 - array[i]%5;
                else
                    newArray[i] = array[i];

        return newArray;
    }

    /**
     *
     * @param array enthalt die nicht aufgerundeten Noten
     * @return die maximale Note wird zuruckgegeben
     */
    public static int maximale_abgerundete_Note(int[] array)
    {
        int maximum = -1;
        array = aufgerundete_Noten(array);

        for (int i = 0; i < array.length; i++)
            if(array[i] > maximum)
                maximum = array[i];

        return maximum;
    }
}
