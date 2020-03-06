package bean;

public class Item {

    private  String name;

    private int getSellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.getSellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.getSellIn + ", " + this.quality;
    }
   
   
   

  public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSellIn() {
	return getSellIn;
}

public void setSellIn(int sellIn) {
	this.getSellIn = sellIn;
}

public int getQuality() {
	return quality;
}

public void setQuality(int quality) {
	this.quality = quality;
}

public  void restQuality() {
	if (getSellIn < 0) {
		quality = 0;
	}
}

  public void decreaseQualityIfNotMin() {
	if(quality>0) {
		quality=  quality-1;
	}
}

  public  void decreaseSellIn() {

	getSellIn = getSellIn - 1;
}

  public  void increaseQualityIfNotMax() {
	if (quality < 50) {
		quality = quality + 1;
	}
}


}
