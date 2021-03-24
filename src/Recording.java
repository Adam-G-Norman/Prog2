public abstract class Recording extends Item implements Vat25 {

    protected final int year;
    protected final String artist;
    protected final double price;
    private final String type;
    protected int condition;

    public Recording (String name, String artist, int year, int condition, double price, String type){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString(){
        return String.format("* Recording { name=%S, artist=%S, year=%S, type=%S, condition=%S, original price=%S", name, artist, year, type, condition, price);
    }
}
