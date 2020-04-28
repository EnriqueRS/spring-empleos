package net.dynu.dovecot.empleos.service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.dynu.dovecot.empleos.model.Vacante;

@Service
public class VacantesServiceImp implements IVacantesService{
	
	private List<Vacante> lista = null;
	
	public VacantesServiceImp () {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");	
		lista = new LinkedList<Vacante>();
		try {
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero civil");
			vacante1.setDescripcion("Para diseñar puente peatonal");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(8500.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");
			

			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador público");
			vacante2.setDescripcion("Empresa importante solicita contador con 5 años de titulado");
			vacante2.setFecha(sdf.parse("09-02-2019"));
			vacante2.setSalario(1200.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");

			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero eléctrico");
			vacante3.setDescripcion("Empresa importante internacional solicita ingeniero mecánico para mantener instalación eléctrica");
			vacante3.setFecha(sdf.parse("10-02-2019"));
			vacante3.setSalario(10500.0);
			vacante3.setDestacado(0);
			vacante3.setImagen("empresa3.png");
			
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
	}

	@Override
	public List<Vacante> buscarTodas() {
		return lista;
	}

}
