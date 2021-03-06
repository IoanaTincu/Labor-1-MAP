package Hausaufgabe1;

public class Aufgabe3 {

    /**
     *
     * @param number Nummer als String
     * @return Nummer mit den Ziffern als Elemente eines Arrays
     */
    public static int[] conversion(String number)
    {
        int[] array = new int[number.length()];

        for(int i = 0; i < number.length(); i++)
            array[i] = number.charAt(i) - 48;

        return array;
    }

    /**
     *
     * @param number1 Zahl als String
     * @param number2 Zahl als String
     * @return die Summe der Zahlen mit den Ziffern als Elemente eines Arrays
     */
    public static int[] kalkuliere_Summe(String number1, String number2)
    {
        int digitsSum;
        int[] result = new int[number1.length()+1];
        int[] array1 = conversion(number1);
        int[] array2 = conversion(number2);

        result[0] = 0;
        for(int i = array1.length-1; i >= 0; i--)
        {
            digitsSum = array1[i] + array2[i];
            if(digitsSum >= 10)
            {
                result[i+1] = digitsSum%10;
                if(i != 0)
                    array1[i-1] = array1[i-1] + 1; // der Ziffer vorne wird eine Einz addiert
                else
                    result[i] = 1; // wenn die Summe der ersten Ziffern > 10 ist
            }
            else
                result[i+1] = digitsSum;
        }

        return result;
    }

    /**
     *
     * @param number1 Zahl als String
     * @param number2 Zahl als String
     * @return die Differenz der Zahlen mit den Ziffern als Elemente eines Arrays
     */
    public static int[] kalkuliere_Differenz(String number1, String number2)
    {
        int digitsDifference, carry = 0;
        int[] array1, array2;
        int[] result;

        if(number1.compareTo(number2) < 0) //if s1 < s2, it returns negative number
        {
            array1 = conversion(number2);
            array2 = conversion(number1);
            result = new int[number1.length()+1]; // Konvention: negative Differenz wird in einem
            // grosseren Array gespeichert
        }
        else
        {
            array1 = conversion(number1);
            array2 = conversion(number2);
            result = new int[number1.length()];
        }

        for(int i = array1.length-1; i >= 0; i--)
        {
            digitsDifference = array1[i] - array2[i] - carry;
            if(digitsDifference >= 0)
            {
                result[i] = digitsDifference;
                carry = 0;
            }
            else
            {
                result[i] = digitsDifference + 10;
                carry = 1;
            }
        }

        return result;
    }

    /**
     *
     * @param number1 Zahl als String
     * @param digit   Ziffer als String
     * @return die Multiplikation der Zahlen mit den Ziffern als Elemente eines Arrays
     */
    public static int[] kalkuliere_Multiplikation(String number1, String digit)
    {
        int digitsMultiplication, carry = 0;
        int[] result = new int[number1.length()+1];
        int[] array1 = conversion(number1);
        int convertedDigit = digit.charAt(0) - 48; // '0' = 48

        for(int i = array1.length-1; i >= 0; i--)
        {
            digitsMultiplication = array1[i] * convertedDigit + carry;
            result[i+1] = digitsMultiplication%10;
            carry = digitsMultiplication/10;
        }
        if (carry != 0)
            result[0] = carry;

        return result;
    }

    /**
     *
     * @param number1 Zahl als String
     * @param digit   Ziffer als String
     * @return der Quotient der Zahlen mit den Ziffern als Elemente eines Arrays
     * @throws Exception falls wir durch Null teilen wollen
     */
    public static int[] kalkuliere_Division(String number1, String digit) throws Exception
    {
        int carry = 0;
        int[] result = new int[number1.length()];
        int[] array1 = conversion(number1);
        int convertedDigit = digit.charAt(0) - 48;

        if(convertedDigit == 0)
            throw new Exception("Division by zero");

        for(int i = 0; i < array1.length; i++)
        {
            result[i] = (carry * 10 + array1[i])/convertedDigit;
            carry = (carry * 10 + array1[i])%convertedDigit;
        }

        return result;
    }
}
