package es.sidelab.PdfGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketsPDFPrinter implements Runnable {
	Socket socket;

	public SocketsPDFPrinter(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader brSocketIn = null;
			PrintWriter pwSocketOut = null;
			try {

				brSocketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pwSocketOut = new PrintWriter(socket.getOutputStream());

				// Envío y recepción de información
				String line = brSocketIn.readLine();
				pwSocketOut.println("PDFGenerator_server: " + line);
				pwSocketOut.flush();

			} catch (IOException e) {
				System.out.println("Fallo en la conexión.");
			} finally {
				if (pwSocketOut != null) {
					pwSocketOut.close();
				}

				if (brSocketIn != null) {
					brSocketIn.close();
				}

				if (socket != null) {
					socket.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
