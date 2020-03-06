package test;

import bean.Item;
import service.GildedRoseService;

public class AllTests {
	 private   static    GildedRoseService app = new GildedRoseService(inputItem());
	  private  static   final   int   days  =  2 ;
   public static void main(String[] args) {

       
       printItem( app.getItems());
   }

	

   private static void printItem( Item[] items) {



		System.out.println("OMGHAI!");
		for (int i = 0; i < days; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.println("name, sellIn, quality");
			for (Item item : items) {
				System.out.println(item);
			}
			System.out.println();
			app.updateItem();
		}
	}

	private static Item[] inputItem() {



		Item[] items = new Item[] {
               new Item("+5 Dexterity Vest", 10, 20), //
               new Item("Aged Brie", 2, 0), //
               new Item("Elixir of the Mongoose", 5, 7), //
               new Item("Sulfuras ,  Hand of Ragnaros", 0, 80), //
               new Item("Sulfuras ,  Hand of Ragnaros", -1, 80),
               new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
               new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
               new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
               // this conjured item does not work properly yet
               new Item("Conjured Mana Cake", 3, 6) };
		return items;
	}

}
