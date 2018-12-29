package 建造者模式.Item;

import 建造者模式.Packing.Bottle;
import 建造者模式.Packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
       return new Bottle();
    }

    @Override
    public abstract float price();
}