package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bean.Item;
import service.GildedRoseService;

class GildedRoseTest {

	@Test
	void testUpdateItem() {
		Item[] items = new Item[] { new Item("val", 0, 0) };
        GildedRoseService app = new GildedRoseService(items);
        app.updateItem();
        assertEquals("bamssi", app.items[0].getName());
	}

}
