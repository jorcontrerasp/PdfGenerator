package es.sidelab.PdfGenerator;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketsPDFService {

	private final int PUERTO = 9999;

	public SocketsPDFService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ejecutaService() {
		try {
			int port = PUERTO;
			ServerSocket serverSocket = new ServerSocket(port);
			while (true) {
				Socket socket = serverSocket.accept();
				Thread t = new Thread(new SocketsPDFPrinter(socket));
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
