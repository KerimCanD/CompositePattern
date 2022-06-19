import java.util.ArrayList;

public class Box implements Component{

    private ArrayList<Component> components = new ArrayList<>();

    @Override
    public int calculatePrice() {

        int summary= 0;

        for (Component component :
                components) {
            summary+=component.calculatePrice();
        }
        
        return summary;
    }

    public void addComponent(Component component){
        components.add(component);
        System.out.println("Added component");
    }

    public void removeComponent(Component component){
        components.remove(component);
        System.out.println("Removed component");
    }
}
