package Hausaufgabe1;

public class Aufgabe3 {

    //pre: Nummer als String
    //post: Nummer mit den Ziffern als Elemente eines Arrays
    public static int[] conversion(String number)
    {
        int[] array = new int[number.length()];

        for(int i = 0; i < number.length(); i++)
            array[i] = number.charAt(i) - 48;

        return array;
    }

    public static int[] Summe(String number1, String number2)
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
                    array1[i-1] = array1[i-1] + 1;
                else
                    result[i] = 1;
            }
            else
                result[i+1] = digitsSum;
        }

        return result;
    }

    public static int[] Differenz(String number1, String number2)
    {
        int digitsDifference, carry = 0;
        int[] array1, array2;
        int[] result;

        if(number1.compareTo(number2) < 0) //if s1 < s2, it returns negative number
        {
            array1 = conversion(number2);
            array2 = conversion(number1);
            result = new int[number1.length()+1];
        }
        else
        {
            array1 = conversion(number1);
            array2 = conversion(number2);
            result = new int[number1.length()];
        }

        for(int i = 0; i < result.length; i++)
            result[i] = 0;
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

    public static int[] Multiplikation(String number1, String digit)
    {
        int digitsMultiplication, carry = 0;
        int[] result = new int[number1.length()+1];
        int[] array1 = conversion(number1);
        int convertedDigit = digit.charAt(0) - 48;

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

    public static int[] Division(String number1, String digit) throws Exception
    {
        int digitsDivision, carry = 0;
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
