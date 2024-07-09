public class Main {
    public static void main(String[] args) {

        Store store1 = new Store(1, "MyStore", "City Center", "9:00 AM");
    
        store1.setTotalSales(1000.0);
        store1.setTotalDiscountedPrice(100.0);

        store1.display();
    }
}
