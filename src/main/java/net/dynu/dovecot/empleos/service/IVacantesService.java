package net.dynu.dovecot.empleos.service;

import java.util.List;

import net.dynu.dovecot.empleos.model.Vacante;

public interface IVacantesService {
	List<Vacante> buscarTodas();
}
