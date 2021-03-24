public class Order{

    private static long counter = 0;
    private final long orderNumber;
    private final Item [] items;

    public Order(Item ...items){
        this.items = items;
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
            if(item instanceof Recording){
                allItems += String.format(" price=%S", item.getPrice());
            }
            allItems += String.format(" price+vat=%S", item.getPricePlusVat());
            allItems += "\n";
        }

        return String.format("Receipt for order #%S\n-----------\n%STotal excl. VAT: %S\nTotal incl. VAT: %S\n-----------", orderNumber, allItems, getTotalValue(), getTotalValuePlusVAT());

    }
}
