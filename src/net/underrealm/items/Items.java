package net.underrealm.items;

public class Items {
	
	/**
	 * Set Item Name
	 * @param name
	 * @return
	 */
	protected Items setName(String name) {
		name = itemName;
		return this;
	}
	
	/**
	 * Set Item Id
	 * @param id
	 * @return
	 */
	protected Items setItemId(int id) {
		itemId = id;
		return this;
	}
	
	/**
	 * Set Item Type
	 * @param type
	 * @return
	 */
	protected Items setType(Items.Type type) {
		this.itemType = type;
		return this;
	}
	
	/**
	 * Type of Item
	 * @author SystexPro
	 *
	 */
	public enum Type {
		ARMOR,
		WEAPON,
		MAGIC,
		NULL;
	}

	public int itemId;
	public String itemName;
	public Items.Type itemType;
	//Items//
	public static Items Magic_Wand;
	public static Items Sythe_Wand;
	public static Items Leather_Boots;
	static {
		Magic_Wand.setItemId(0).setName("item.magic_wand").setType(Items.Type.MAGIC);
		Sythe_Wand.setItemId(1).setName("item.sythewand").setType(Items.Type.MAGIC);
	}
}
