public interface Vat25 extends Vat {

    // om ingen underkliggande klass överskuggar den här metoden så är den denna som gäller
    default double getVAT(){
        return 0.25;
    }

}
