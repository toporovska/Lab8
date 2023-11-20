package ucu.edu.ua.flower.delivery;
import java.util.List;

import ucu.edu.ua.flower.flowers.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items via DHL";
    }
}
