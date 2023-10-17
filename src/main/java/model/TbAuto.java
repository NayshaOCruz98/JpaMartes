package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_auto database table.
 * 
 */
@Entity
@Table(name="tb_auto")
@NamedQuery(name="TbAuto.findAll", query="SELECT t FROM TbAuto t")
public class TbAuto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idauto;

	private String color;

	private String fabricacion;

	private String marca;

	private String modelo;

	private double precio;

	public TbAuto() {
	}

	public int getIdauto() {
		return this.idauto;
	}

	public void setIdauto(int idauto) {
		this.idauto = idauto;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFabricacion() {
		return this.fabricacion;
	}

	public void setFabricacion(String fabricacion) {
		this.fabricacion = fabricacion;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}