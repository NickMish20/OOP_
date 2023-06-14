package Domen;

public class HotDrink extends Product {
    private int temperature;
    
            /**
         * Create a product for VM
         *
         * @param productId       id product
         * @param productName
         * @param productCategory
         * @param price
         * @throws Exception
         */
    public HotDrink(int productId, String productName, String productCategory, double price, int temperature) throws Exception {
        super(productId, productName, productCategory, price);
        this.temperature = temperature;
    }
    @Override
    public String toString()
    {
        return "HotDrink{" +
        "name='" + super.getProductName() + '\'' +
        "category='" + super.getProductCategory() + '\'' +
        ", cost=" + super.getPrice() +
        ", temperature=" + temperature +
        '}';
    }


}
