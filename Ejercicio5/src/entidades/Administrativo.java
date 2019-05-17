package entidades;

import java.math.BigDecimal;

public class Administrativo extends Empleado {
	private BigDecimal hsExtra;
	private BigDecimal hsMes;
	
	public Administrativo(String dni, String nombre, String apellido, String email, BigDecimal sueldoBase, BigDecimal hsExtra, BigDecimal hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.setHsExtra(hsExtra);
		this.setHsMes(hsMes);
	}
	
	public BigDecimal getHsExtra() {
		return hsExtra;
	}

	public void setHsExtra(BigDecimal hsExtra) {
		this.hsExtra = hsExtra;
	}

	public BigDecimal getHsMes() {
		return hsMes;
	}

	public void setHsMes(BigDecimal hsMes) {
		this.hsMes = hsMes;
	}
	
	public BigDecimal getSueldo() {
		BigDecimal sueldo;
		sueldo = this.getSueldoBase().multiply(((this.getHsExtra().multiply(BigDecimal.valueOf(1.5))).add(this.getHsMes())).divide(this.getHsMes()));
		return sueldo.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
}

