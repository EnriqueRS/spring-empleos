package net.dynu.dovecot.empleos.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.dynu.dovecot.empleos.model.Vacante;

@Controller
public class HomeController {
	
	@GetMapping("/tabla")
	public String mostrarTable (Model model) {
		List<Vacante> lista = getVacantes();
		
		model.addAttribute("vacantes", lista);
		
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de comunicaciones");
		vacante.setDescripcion("Para dar soporte a internet");
		vacante.setFecha(new Date());
		vacante.setSalario(12000.0);
		
		model.addAttribute("vacante", vacante);
		
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos", lista);
		
		return "listado";
	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
//		model.addAttribute("mensaje", "Bienvenidos a Empleos APP");
//		model.addAttribute("date", new Date());
		
		String nombre = "Auxiliar de Contabilidad";
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		
		return "home";
	}
	
	
	private List<Vacante> getVacantes() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		List<Vacante> lista = new LinkedList<Vacante>();
		
		try {
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero civil");
			vacante1.setDescripcion("Para diseñar puente peatonal");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(8500.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.jpg");
			

			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador público");
			vacante2.setDescripcion("Empresa importante solicita contador con 5 años de titulado");
			vacante2.setFecha(sdf.parse("09-02-2019"));
			vacante2.setSalario(1200.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.jpg");

			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero eléctrico");
			vacante3.setDescripcion("Empresa importante internacional solicita ingeniero mecánico para mantener instalación eléctrica");
			vacante3.setFecha(sdf.parse("10-02-2019"));
			vacante3.setSalario(10500.0);
			vacante3.setDestacado(0);
			vacante3.setImagen("empresa3.jpg");
			
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Diseñador Gráfico");
			vacante4.setDescripcion("Solicitamos diseñador gráfico para diseñar publicidad de la empresa");
			vacante4.setFecha(sdf.parse("11-02-2019"));
			vacante4.setSalario(7500.0);
			vacante4.setDestacado(1);

			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return lista;
	}

}
