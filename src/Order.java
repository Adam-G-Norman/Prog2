import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Order{

    private static long counter = 0;
    private final long orderNumber;
    private final List<Item> items = new ArrayList<>();

    public Order(Item ...items){
        this.items.addAll(Arrays.asList(items));
        counter++;
        orderNumber = counter;
    }

    public double getTotalValue(){
        double sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public double getTotalValuePlusVAT(){
        double sum = 0;
        for (Item item : items){
            sum += item.getPricePlusVat();
        }
        return sum;
    }

    public String printReceipt(){
        String allItems = "";
        for (Item item : items){
            allItems += item;
            allItems += "\n";
        }

        return String.format("Receipt for order #%S\n-----------\n%STotal excl. VAT: %S\nTotal incl. VAT: %S\n-----------", orderNumber, allItems, getTotalValue(), getTotalValuePlusVAT());

    }
}
