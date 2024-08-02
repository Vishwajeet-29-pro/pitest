package org.example.factory_pattern;

import org.example.Item;

public class AgedBrie extends AbstractItems{
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        incrementQuality();
        decrementSellIn();
        if (item.sellIn < 0) {
            incrementQuality();
        }
    }
}
