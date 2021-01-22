package es.sidelab.PdfGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
		//Ejecutar servicio de generación de PDFs mediante sockets.
		//new PDFService().ejecutaService();
		
	}
}
