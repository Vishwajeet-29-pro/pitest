package org.example.factory_pattern;

import org.example.Item;

public class Sulfuras extends AbstractItems {
    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        // Sulfuras never changes quality or sellIn
    }
}
