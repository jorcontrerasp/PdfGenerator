package es.sidelab.PdfGenerator.controller;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import es.sidelab.PdfGenerator.model.EjercicioPDF;
import es.sidelab.PdfGenerator.model.Prueba;
import es.sidelab.PdfGenerator.utils.GeneratePdfReport;

@RestController
public class PDFController {
	
	@PostMapping("/pdf")
	public void reciever(Model model, @RequestBody ArrayList<EjercicioPDF> listaEjerciciosPDF){
		System.out.println("Prueba");
	}
	
	@GetMapping(value = "/test", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> generatePDFReport() {

		List<Prueba> pruebas = new ArrayList<Prueba>();
		Prueba prb1 = new Prueba("prb1", "ds_prb1");
		Prueba prb2 = new Prueba("prb2", "ds_prb2");
		Prueba prb3 = new Prueba("prb3", "ds_prb3");
		Prueba prb4 = new Prueba("prb4", "ds_prb4");
		Prueba prb5 = new Prueba("prb5", "ds_prb5");
		
		pruebas.add(prb1);
		pruebas.add(prb2);
		pruebas.add(prb3);
		pruebas.add(prb4);
		pruebas.add(prb5);

		ByteArrayInputStream bis = GeneratePdfReport.pruebasReport(pruebas);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=pruebasreport.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}

}
