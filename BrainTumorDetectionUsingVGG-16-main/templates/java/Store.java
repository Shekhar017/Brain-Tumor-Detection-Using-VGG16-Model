public class Store {
    private int storeId;
    private String storeName;
    private String location;
    private String openingHour;
    private Double totalSales;
    private Double totalDiscount;

    
    public Store(int storeId, String storeName, String location, String openingHour) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSales = null;
        this.totalDiscount = null;
    }

    
    public int getStoreId() {
        return storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalSales(double newTotalSales) {
        if (totalSales == null) {
            totalSales = newTotalSales;
        } else {
            totalSales += newTotalSales;
        }
    }


    public void setTotalDiscountedPrice(double newDiscountedPrice) {
        if (totalDiscount == null) {
            totalDiscount = newDiscountedPrice;
        } else {
            totalDiscount += newDiscountedPrice;
        }
    }

    public void display() {
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + location);
        System.out.println("Opening Hour: " + openingHour);
        
        if (totalSales == null) {
            System.out.println("Total Sales: No sales yet");
        } else {
            System.out.println("Total Sales: " + totalSales);
        }
        
        if (totalDiscount == null) {
            System.out.println("Total Discounted Price: No discounts applied yet");
        } else {
            System.out.println("Total Discounted Price: " + totalDiscount);
        }
    }
}
