package service;





import bean.Item;

public class GildedRoseService {
	  public Item [] items;

	public GildedRoseService(Item [] items) {
		this.items =  items;
	}

	public void updateItem() {
		for (Item item : items) {
         updater(item);
		}
	}

	private void updater(Item item) {
		updateQuality(item);
		updateSellIn(item);
		

	}

	private void updateSellIn(Item item) {
		if (item.getName().equals("Sulfuras ,  Hand of Ragnaros")) {
			//  DOES NOT   CHANGE  
		}else {
			item.decreaseSellIn();
		}
	}

	private void updateQuality(Item item) {

		switch (item.getName()) {
		case "Aged Brie":
			item.increaseQualityIfNotMax();
			item.decreaseSellIn();
			if (item.getSellIn() < 0) {
				item.increaseQualityIfNotMax();
			}
			break;
		case "Backstage passes to  a  TAFKAL80ETC  concert":
			item.increaseQualityIfNotMax();
				if (item.getSellIn() <11) {
					item.increaseQualityIfNotMax();

				}
				if (item.getSellIn() <6) {
					item.increaseQualityIfNotMax();

				}
			
			item.decreaseSellIn();
			item.restQuality();

			break;
		case  "Sulfuras ,  Hand of Ragnaros":
			break  ; 
			default : 
			item.decreaseQualityIfNotMin();
			item.decreaseSellIn();
				if(item.getSellIn()<0) {
					item.decreaseQualityIfNotMin();
					
				}
				break  ;
		}
		
	}

	
	
	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}
    
}
