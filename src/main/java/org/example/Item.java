package org.example;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {
        if (isSpecialItem()) {
            addQuality();
            handleSpecialItems();
        } else {
            removeQuality();
        }
        decreaseSellIn();
        handleExpiredItems();

    }

    private void handleExpiredItems() {
        if (sellIn < 0) {
            if (name.equals("Aged Brie")) {
                addQuality(); // Quality increases for Aged Brie
            } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                quality = 0; // Quality drops to 0 after concert
            } else {
                removeQuality(); // Decrease quality for normal items after expiration
            }
        }
    }

    private void decreaseSellIn() {
        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sellIn--;
        }
    }

    private void handleSpecialItems() {
        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (sellIn < 11) {
                addQuality();
            }
            if (sellIn < 6) {
                addQuality();
            }
        }
    }

    private void addQuality() {
        if (quality < 50) quality++;
    }

    private void removeQuality() {
        if (quality > 0 && !name.equals("Sulfuras, Hand of Ragnaros"))
            quality--;
    }

    private boolean isSpecialItem() {
        return name.equals("Aged Brie") || name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}