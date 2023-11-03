import java.util.ArrayList;
import java.util.List;

// Define the Product interface
interface Product {
    String getCategory();
    String getManufacturer();
    String getType();
    String getOperatingSystem();
}

// Implement the Hardware class
class Hardware implements Product {
    private String category;
    private String manufacturer;

    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getOperatingSystem() {
        return null;
    }
}

// Implement the Software class
class Software implements Product {
    private String type;
    private String operatingSystem;

    public Software(String type, String operatingSystem) {
        this.type = type;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String getCategory() {
        return null;
    }

    @Override
    public String getManufacturer() {
        return null;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
}

// Create a class to keep track of sales records
class SalesRecord {
    private List<Product> sales = new ArrayList<>();

    public void recordSale(Product product) {
        sales.add(product);
    }

    public int calculateTotalSales() {
        int totalSales = 0;
        // Assuming today's date is 2023-11-03
        for (Product product : sales) {
            if (product instanceof Hardware) {
                totalSales++;
            }
        }
        return totalSales;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create hardware and software items
        Hardware hardwareItem = new Hardware("CPU", "Intel");
        Software softwareItem = new Software("Antivirus", "Windows");

        // Create a sales record
        SalesRecord salesRecord = new SalesRecord();

        // Record sales for the last 3 months
        salesRecord.recordSale(hardwareItem);
        salesRecord.recordSale(softwareItem);

        // Calculate total sales for hardware and software
        int totalHardwareSales = salesRecord.calculateTotalSales();
        int totalSoftwareSales = salesRecord.sales.size() - totalHardwareSales;

        System.out.println("Total hardware sales for the last 3 months: " + totalHardwareSales);
        System.out.println("Total software sales for the last 3 months: " + totalSoftwareSales);
    }
}
