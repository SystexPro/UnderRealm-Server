package net.underrealm.main;

import java.net.Socket;

import net.underrealm.net.NetHandler;
import net.underrealm.net.SocketHandler;
import net.underrealm.player.Player;

public class Server {



	public static void main(String[] args) {
		try {
			new SocketHandler();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	public static void handleConnections(Socket s) {
		if(s.getInetAddress().getHostAddress().equals("127.0.01")) {
			Engine.player.disconnectPlayer(Player.disconnect.no_route);
		} else {
			NetHandler.addConnection(s);
		}
	}
	
	public static NetHandler netHandler;
}
