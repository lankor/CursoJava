package com.bstmexico.cursojava.model;

public class Maestro {
	private Integer matricula;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


//	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime * + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Maestro)) {
			return false;
		}
		Maestro other = (Maestro) obj;
		if (matricula == null) {
			if (other.matricula != null) {
				return false;
			}
		} else if (!matricula.equals(other.matricula)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("[matricula : %s, nombre : '%s', apellidoPaterno : '%s']",
				this.matricula, this.nombre, this.apellidoPaterno);
	}
}
