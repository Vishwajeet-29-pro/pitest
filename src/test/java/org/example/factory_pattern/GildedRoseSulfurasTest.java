package org.example.factory_pattern;

import org.example.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class GildedRoseSulfurasTest {
    private GildedRose gildedRose;

    @Test
    public void testCreateItem_Sulfuras() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 10,20)};
        gildedRose = new GildedRose(items);

        AbstractItems abstractItems = gildedRose.createItem(items[0]);
        assertInstanceOf(Sulfuras.class, abstractItems,"Expected an Sulfuras instance");
    }

    @Test
    public void testUpdateQuality_Sulfuras() {
        Item[] items = { new Item("Sulfuras, Hand of Ragnaros", 10,11)};
        gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(10, items[0].sellIn,"Sell should be same");
        assertEquals(11, items[0].quality,"Quality should be same");
    }
}
