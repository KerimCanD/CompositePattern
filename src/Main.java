public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        box1.addComponent(box2);
        box2.addComponent(new Product(5));

        Box box3 = new Box();

        box1.addComponent(box3);

        box3.addComponent(new Product(4));
        Box box4 = new Box();
        box3.addComponent(box4);

        box4.addComponent(new Product(3));

        Box box5 = new Box();
        box4.addComponent(box5);

        box5.addComponent(new Box());
        box5.addComponent(new Product(2));

        System.out.println(box1.calculatePrice());

        box1.removeComponent(box3);
        System.out.println(box1.calculatePrice());
        System.out.println(box3.calculatePrice());
    }
}