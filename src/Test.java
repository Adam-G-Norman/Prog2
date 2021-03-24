public class Test {
    public static void main(String[] args) {
        Item book1 = new Book("A guide to modern jazz", "Unknown author", 100, false);
        Item book2 = new Book("Beethoven: a biography", "Holmqvist", 400, false);
        Item book2bound = new Book("Beethoven: a biography", "Holmqvist", 400, true);

        Item item1 = new LongPlay("Giant Steps", "John Coltrane", 1959, 10, 100);
        Item cd2 = new CompactDisc("Kind of Blue", "Miles Davis", 1959, 5, 100);
        Item lp1 = new CompactDisc("Punisher", "Phoebe Bridgers", 2020, 10, 200);
        Item lp2 = new LongPlay("What Kinda Music", "Tom Misch", 2020, 10, 150);
        Item lp3 = new LongPlay("Little Oblivions", "Julien Baker", 2021, 10, 120);

        Order order1 = new Order(book1, book2bound);
        System.out.println(order1.printReceipt());

        Order jazz = new Order(book2, item1, cd2);
        System.out.println(jazz.printReceipt());

        Order modernIndie = new Order(lp1, lp2, lp3);
        System.out.println(modernIndie.printReceipt());

    }
}
