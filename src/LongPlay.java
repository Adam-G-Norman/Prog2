public class LongPlay extends Recording {

    public LongPlay (String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price, "LP");
    }

    @Override
    public double getPrice(){
        double value = price * condition / 10.0;

        int currentYear = 2021;
        value += (currentYear - year) * 5;
        return value;
    }

}
