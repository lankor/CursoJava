package com.bstmexico.modelo;

import java.math.BigDecimal;
import java.util.Date;

public class Movimiento {
	private Date fecha;
	private int idEstablecimiento;
	private int idCliente;
	private String numCuenta;
	private BigDecimal monto;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdEstablecimiento() {
		return idEstablecimiento;
	}

	public void setIdEstablecimiento(int idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idCliente;
		result = prime * result + idEstablecimiento;
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
		if (!(obj instanceof Movimiento)) {
			return false;
		}
		Movimiento other = (Movimiento) obj;
		if (fecha == null) {
			if (other.fecha != null) {
				return false;
			}
		} else if (fecha.compareTo(other.fecha) != 0) {
			return false;
		}
		if (idCliente != other.idCliente) {
			return false;
		}
		if (idEstablecimiento != other.idEstablecimiento) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + this.idCliente + " " 
				+ this.idEstablecimiento;
	}
}
