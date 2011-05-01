package net.underrealm.npcs;

public class NPCList {

	public static NPC Bob = new NPC();
	public static NPC Wiggum = new NPC();


	static {
		Bob.setNPCName("Bob").setNPCHealth(10).setNPCGender("male");
		Wiggum.setNPCName("ChiefWiggum").setNPCHealth(10).setNPCGender("female");

	}
}
