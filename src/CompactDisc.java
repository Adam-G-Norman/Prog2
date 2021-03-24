public class CompactDisc extends Recording {

    public CompactDisc(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price, "CD");
    }
    @Override
    public double getPrice(){
        return price * condition / 10.0;
    }
}
