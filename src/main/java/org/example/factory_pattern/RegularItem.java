package org.example.factory_pattern;

import org.example.Item;

public class RegularItem extends AbstractItems {
    public RegularItem(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        decrementQuality();
        decrementSellIn();
        if (item.sellIn < 0) {
            decrementQuality();
        }
    }
}
