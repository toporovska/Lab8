package ucu.edu.ua.flower.delivery;
import ucu.edu.ua.flower.flowers.Item;
import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
