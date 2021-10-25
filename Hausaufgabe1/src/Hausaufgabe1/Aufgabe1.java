package Hausaufgabe1;

public class Aufgabe1 {

    /**
     *
     * @param arrayNoten enthalt die nicht aufgerundeten Noten
     * @return ein Array mit den nicht ausreichenden Noten wird zuruckgegeben
     */
    public static int[] nicht_ausreichende_Noten(int[] arrayNoten)
    {
        int[] newArray = new int[arrayNoten.length];
        int index = 0;

        for(int i = 0; i < arrayNoten.length; i++)
            if(arrayNoten[i] < 38) // 38 und 39 werden schon auf 40 aufgerundet
            {
                newArray[index] = arrayNoten[i];
                index++;
            }

        int[] finalArray = new int[index]; // in newArray kann es leere Positionen geben
        for(int i = 0; i < index; i++)
            finalArray[i] = newArray[i];

        return finalArray;
    }

    /**
     *
     * @param arrayNoten enthalt die nicht aufgerundeten Noten
     * @return der Durchschnittswert der aufgerundeten Noten wird zuruckgegeben
     */
    public static double durchschnittswert(int[] arrayNoten)
    {
        int sum = 0;
        arrayNoten = aufgerundete_Noten(arrayNoten); // wir berechnen den Durchschnittswert der Noten nach der Aufrundung

        for(int i = 0; i < arrayNoten.length; i++)
            sum += arrayNoten[i];

        return (double) sum/arrayNoten.length;
    }

    /**
     *
     * @param arrayNoten enthalt die nicht aufgerundeten Noten
     * @return das Array mit den aufgerundeten Noten wird zuruckgegeben
     */
    public static int[] aufgerundete_Noten(int[] arrayNoten)
    {
        int[] newArray = new int[arrayNoten.length];

        for(int i = 0; i < arrayNoten.length; i++)
            if(arrayNoten[i] < 38)
                newArray[i] = arrayNoten[i]; // Noten < 38 werden nicht aufgerundet
            else
                if(5 - arrayNoten[i]%5 < 3) // Differenz zwischen der Note und dem nachsten Vielfachen von 5
                    newArray[i] = arrayNoten[i] + 5 - arrayNoten[i]%5;
                else
                    newArray[i] = arrayNoten[i];

        return newArray;
    }

    /**
     *
     * @param arrayNoten enthalt die nicht aufgerundeten Noten
     * @return die maximale Note wird zuruckgegeben
     */
    public static int hochste_abgerundete_Note(int[] arrayNoten)
    {
        int maximum = -1;
        arrayNoten = aufgerundete_Noten(arrayNoten);

        for (int i = 0; i < arrayNoten.length; i++)
            if(arrayNoten[i] > maximum)
                maximum = arrayNoten[i];

        return maximum;
    }
}
