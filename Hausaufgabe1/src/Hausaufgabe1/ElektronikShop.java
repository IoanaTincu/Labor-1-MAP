package Hausaufgabe1;

import java.util.List;

public class ElektronikShop {

    private List<Integer> pricesUSB;
    private List<Integer> pricesKeyboard;

    public ElektronikShop(List<Integer> pricesUSB, List<Integer> pricesKeyboard) {
        this.pricesUSB = pricesUSB;
        this.pricesKeyboard = pricesKeyboard;
    }

    public List<Integer> getPricesUSB() {
        return pricesUSB;
    }

    public void setPricesUSB(List<Integer> pricesUSB) {
        this.pricesUSB = pricesUSB;
    }

    public List<Integer> getPricesKeyboard() {
        return pricesKeyboard;
    }

    public void setPricesKeyboard(List<Integer> pricesKeyboard) {
        this.pricesKeyboard = pricesKeyboard;
    }

    /**
     *
     * @return der kleinste Preis
     */
    public int billigste_Tastatur()
    {
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < pricesKeyboard.size(); i++)
            if(pricesKeyboard.get(i) < minimum)
                minimum = pricesKeyboard.get(i);

        return minimum;
    }

    /**
     *
     * @return der kleinste Preis aus beiden Arrays
     */
    public int teuerster_Gegenstand()
    {
        int maximum = -1;

        for(int i = 0; i < pricesKeyboard.size(); i++)
            if(pricesKeyboard.get(i) > maximum)
                maximum = pricesKeyboard.get(i);
        for(int i = 0; i < pricesUSB.size(); i++)
            if(pricesUSB.get(i) > maximum)
                maximum = pricesUSB.get(i);

        return maximum;
    }

    /**
     * wir suchen den grossten Preis kleiner als das Budget
     * @param budget das bereitgestellte Buget
     * @return der grosste Preis kleiner als das Budget
     */
    public int teuerstes_USB(int budget)
    {
        int maximum = -1;

        for(int i = 0; i < pricesUSB.size(); i++)
            if(pricesUSB.get(i) > maximum && pricesUSB.get(i) <= budget)
                maximum = pricesUSB.get(i);

        return maximum;
    }

    //post: die maximale Geldsumme die fur Tastatur und USB ausgegeben werden kann

    /**
     *
     * @param budget das bereitgestellte Budget
     * @return der maximale Geldbetrag, der fur Tastatur + USB ausgegeben wird. Wenn es nicht genug
     * Geld fur beide gibt, wird -1 zuruckgegeben
     */
    public int maximaler_Geldbetrag(int budget)
    {
        int maximum = -1, priceKeyboard, remainedBudget, priceUSB;

        for(int i = 0; i < pricesKeyboard.size(); i++)
        {
            priceKeyboard = pricesKeyboard.get(i);
            remainedBudget = budget - priceKeyboard;
            priceUSB = teuerstes_USB(remainedBudget);

            if(priceKeyboard + priceUSB > maximum && priceUSB != -1) // priceUSB = -1 wenn es keinen USB gibt,
                // dessen Preis <= Budget ist
                maximum = priceKeyboard + priceUSB;
        }

        return maximum;
    }
}
