package examenFerreteriaJEE.examenFerreteria.modelo;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Proveedor {
	
	private int codigo;
	private String nombre;
	
	private List<Producto>producto_fk;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Producto> getProducto_fk() {
		return producto_fk;
	}
	public void setProducto_fk(List<Producto> producto_fk) {
		this.producto_fk = producto_fk;
	}
	@Override
	public String toString() {
		return "Proveedor [codigo=" + codigo + ", nombre=" + nombre + ", producto_fk=" + producto_fk + "]";
	}
	
	
}
