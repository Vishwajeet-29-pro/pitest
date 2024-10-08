package org.example.factory_pattern;

import org.example.Item;

public class BackstagePass extends AbstractItems {
    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        incrementQuality();
        if (item.sellIn < 11) {
            incrementQuality();
        }
        if (item.sellIn < 6) {
            incrementQuality();
        }
        decrementSellIn();
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}