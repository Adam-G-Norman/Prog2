public abstract class Item implements Vat{

    // nyckelordet: final används för att subklasserna får inte överskugga detta attribut
    protected final String name;

    protected Item (String name){
        this.name = name;
    }

    // denna metod är abstrakt för att det inte är här vi räknar ut priset, för vi räknar ut
    // priset på två olika sätt i Recording och Book
    public abstract double getPrice();

    public double getPricePlusVat(){
        return getPrice() + getVAT() * getPrice();
    }

}
