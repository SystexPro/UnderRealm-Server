package net.underrealm.npcs;

public class NPC {
	
	
	
	public NPC() {
		
	}
	
	public NPC setNPCHealth(int hea) {
		health = hea;
		return this;
	}
	
	public NPC setNPCName(String name) {
		npcName = name;
		return this;
	}
	
	public NPC setNPCGender(String gen) {
		gender = gen;
		return this;
	}
	
	public int health;
	public String npcName;
	public String gender;
}
