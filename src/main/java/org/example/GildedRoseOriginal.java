package org.example;

public class GildedRoseOriginal {

    Item[] items;

    public GildedRoseOriginal(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }
        }
}