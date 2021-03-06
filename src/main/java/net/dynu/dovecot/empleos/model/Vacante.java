package net.dynu.dovecot.empleos.model;

import java.util.Date;

public class Vacante {
	
	private int id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private double salario;
	private int destacado;
	private String imagen="no-image.png";
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	public int getDestacado() {
		return destacado;
	}
	public void setDestacado(int destacado) {
		this.destacado = destacado;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String image) {
		this.imagen = image;
	}
	@Override
	public String toString() {
		return "Vacante [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + "]";
	}
}
