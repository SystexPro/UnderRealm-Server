package net.underrealm.net;

import java.net.ServerSocket;
import java.net.Socket;

import org.realmscript.net.RealmNetwork;
import org.realmscript.misc.URLog;
import org.realmscript.misc.URLog.Level;

import net.underrealm.main.Server;
import net.underrealm.misc.Misc;
import net.underrealm.player.Player;

public class SocketHandler {

	@SuppressWarnings("static-access")
	public SocketHandler() {
		try {
			Misc.info("Starting UnderRealm Server #1 - Build Version: " + Misc.build);
			Misc.info("-------------------------------------------------------------");
			Thread.sleep(500L);
			providerSocket = RealmNetwork.listenServer(43593);
			Misc.info("Server Bound to Port: " + NetHandler.serverPort);
			Thread.sleep(800L);
			Misc.server("Open to all connections...");
			Thread buffer = new Thread(new Buffer());
			buffer.start();
			serverRunning = true;
			startThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void startClient() throws Exception {
		Socket s = new Socket("127.0.0.3", 43593);
	}

	private void startThread() {
		try {
			startClient();
			while (serverRunning) {
				connection = providerSocket.accept();
				Misc.server("Connection accepted from "
						+ connection.getInetAddress().getHostAddress());
				Server.handleConnections(connection);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public Misc misc;
	public boolean serverRunning;
	public NetHandler NetHandler;
	public Player player;
	public Server server;
	ServerSocket providerSocket;
	Socket connection = null;
	public URLog URLog;
}
