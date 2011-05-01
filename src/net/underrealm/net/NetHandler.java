package net.underrealm.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.underrealm.misc.Misc;
import net.underrealm.player.Player;


public class NetHandler {
	
	public static void addConnection(Socket s) {
		Misc.server("Added " + s.getInetAddress().getHostAddress() + " with player Id " + Player.getPlayerId());
		 try {
			inputStream = s.getInputStream();
			outputStream = s.getOutputStream();
			Player.handleStreams(s, inputStream, outputStream);	
			Player.getPlayerProfile(Player.getPlayerId());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static InputStream inputStream;
	public static OutputStream outputStream;
	public String serverIp;
	public static int serverPort = 43594;
	public static final int MAX_CONNECTIONS = 100;
	
}
