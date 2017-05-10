package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.ItemClases.*;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<ItemInt> makeItems() {
        List<ItemInt> items = new ArrayList<ItemInt>();
        items.add(new ArmorItem("+5 Dexterity Vest", 10, 20));
        items.add(new KaasItem("Aged Brie", 2, 0));
        items.add(new ElixirItem("Elixir of the Mongoose", 5, 7));
        items.add(new HamerItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new ConcertItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new CakeItem("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality(List<ItemInt> items) {
        for (ItemInt item: items) {
            item.updateQuality();
        }
    }
}
