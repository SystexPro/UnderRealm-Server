package net.underrealm.items;

public class Items {

	
	public Items setName(String name) {
		name = itemName;
		return this;
	}
	
	public String itemName;
	public static Items Magic_Wand;
	
	static {
		Magic_Wand.setName("magic_wand");
	}
}
