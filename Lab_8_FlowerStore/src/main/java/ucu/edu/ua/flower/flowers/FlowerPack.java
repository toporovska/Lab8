package ucu.edu.ua.flower.flowers;

import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int flowerQuantity) {
        if (flowerQuantity > 1) {
            this.quantity = flowerQuantity;
            
        }
        else {
            this.quantity = 1;
        }
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

}