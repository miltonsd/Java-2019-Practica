package entidades;

import java.math.BigDecimal;

public class Vendedor extends Empleado {
	private BigDecimal porcenComision;
	private BigDecimal totalVtas;
	
	public Vendedor(String dni, String nombre, String apellido, String email, BigDecimal sueldoBase, BigDecimal porcenComision, BigDecimal totalVtas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.setPorcenComision(porcenComision);
		this.setTotalVtas(totalVtas);
	}

	public BigDecimal getPorcenComision() {
		return porcenComision;
	}

	public void setPorcenComision(BigDecimal porcenComision) {
		this.porcenComision = porcenComision;
	}

	public BigDecimal getTotalVtas() {
		return totalVtas;
	}

	public void setTotalVtas(BigDecimal totalVtas) {
		this.totalVtas = totalVtas;
	}
	
	public BigDecimal getSueldo() {
		BigDecimal sueldo;
		sueldo = this.getSueldoBase().add((this.getPorcenComision().multiply(this.getTotalVtas())).divide(BigDecimal.valueOf(100)));
		return sueldo.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
}
