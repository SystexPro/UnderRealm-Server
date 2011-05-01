package net.underrealm.player;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Random;

import net.underrealm.io.FileManager;
import net.underrealm.main.Server;
import net.underrealm.misc.Misc;

public abstract class Player {


	public List<Object> players;

	public Server server;

	public Player() {

	}

	public static int getPlayerId() {
		Random r = new Random();
		int rand = r.nextInt(100) + 1;
		if(rand == playerId) {
			return (Integer) null;
		} else {
			playerId = rand;
			return rand;
		}
	}

	/**
	 * Sets Username on head
	 * @param user
	 * @param x
	 * @param y
	 */
	public void setUsernameAboveHead(String user, int x, int y) {

	}

	/**
	 * Handles Streams
	 * @param inputStream
	 * @param outputStream
	 */
	public static void handleStreams(Socket s, InputStream inputStream, OutputStream outputStream) {
		if(inputStream.equals(null)) {
			try {
				Misc.warning(Player.playerId + " inputStream is null");
				inputStream.close();
				outputStream.close();
				Misc.server(s.getInetAddress() + " disconnected (" + Player.disconnect.socket_closed +") ");
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			
		}

	}

	public static void setHealth(int x) {
		health = x;
	}

	public int getHealth() {
		return health;
	}

	public Rights setAdmin() {
		return Rights.Admin;
	}

	public Rights setMod() {
		return Rights.Mod;
	}

	public static Rights setPlayer() {
		return Rights.Player;
	}

	public enum Rights {
		Player,
		Mod,
		Admin;
	}

	/**
	 * Disconnect Settings
	 * @author SystexPro
	 *
	 */
	public enum disconnect {
		quit,
		timed_out,
		socket_closed,
		no_route,
		banned,
		kicked,
		hacking;
	}
	
	public static void getPlayerProfile(int id) {
		String profilePath = "./users/" + id + ".dat";
		FileManager.createFile(profilePath);
		
	}
	
	public static void setupPlayer() {
		
		setHealth(10);
		setPlayer();
		Misc.info("Created a new Profile for Player + playerId");
		
	}

	public static disconnect disconnectPlayer(Player.disconnect type) {
		return type;
	}
	//-------------------List Settings/Players-------------------//
	public void add(Object s) {
		this.players.add(s);
	}

	public void remove(Object s) {
		this.players.remove(s);
	}

	public int size() {
		return this.players.size();
	}
	//-------------------List Settings/Players-------------------//
	public static int health;
	public static int playerId;





}
