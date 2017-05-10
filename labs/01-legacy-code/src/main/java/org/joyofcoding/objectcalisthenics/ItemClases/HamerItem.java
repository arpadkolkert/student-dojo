package org.joyofcoding.objectcalisthenics.ItemClases;

/**
 * Created by arko1 on 27/03/2017.
 */
public class HamerItem implements ItemInt{
    private String name;
    private int sellIn;
    private int quality;

    public HamerItem(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getQuality(){
        return quality;
    }

    @Override
    public int getSellIn(){
        return sellIn;
    }


    @Override
    public void updateQuality() {
    }
}
