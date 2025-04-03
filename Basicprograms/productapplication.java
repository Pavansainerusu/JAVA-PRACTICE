//Implement a product application using 8 data types
class productapplication {
    public static void main(String[] args) {
        byte productId = 1; 
        short stockQuantity = 150; 
        int pricePerUnit = 250; 
        long totalSales = 150000L; 
        float productWeight = 1.5f; 
        double productRating = 4.7; 
        char productCategory = 'A'; 
        boolean isAvailable = true; 
        
        System.out.println("Product Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Price per Unit: $" + pricePerUnit );
        System.out.println("Total Sales: $" + totalSales );
        System.out.println("Weight: " + productWeight + " kg");
        System.out.println("Rating: " + productRating + " stars");
        System.out.println("Category: " + productCategory);
        System.out.println("Available: " + isAvailable);

        
    }
}
