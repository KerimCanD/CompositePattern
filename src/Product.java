public class Product implements Component{

    int price;

    public Product(int price){
        this.price = price;
    }

    @Override
    public int calculatePrice() {
        return price;
    }
}
