public class Book extends Item implements Vat6 {

    private final String author;
    private final double price;
    private final boolean bound;

    public Book (String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    @Override
    public double getPrice() {
        return bound ? price * 1.25 : price;

    }

    @Override
    public String toString(){
        return String.format("* Book { name=%S, author=%S, bound=%S, price=%S, price+vat=%s", name, author, bound, getPrice(), getPricePlusVat());
    }


}


//TODO Testa Year.now().getValue()