package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_categoria database table.
 * 
 */
@Entity
@Table(name="tb_categoria")
@NamedQuery(name="TbCategoria.findAll", query="SELECT t FROM TbCategoria t")
public class TbCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcategoria;

	private String descrip;

	private String nomcate;

	//bi-directional many-to-one association to TbProducto
	@OneToMany(mappedBy="tbCategoria")
	private List<TbProducto> tbProductos;

	public TbCategoria() {
	}

	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getNomcate() {
		return this.nomcate;
	}

	public void setNomcate(String nomcate) {
		this.nomcate = nomcate;
	}

	public List<TbProducto> getTbProductos() {
		return this.tbProductos;
	}

	public void setTbProductos(List<TbProducto> tbProductos) {
		this.tbProductos = tbProductos;
	}

	public TbProducto addTbProducto(TbProducto tbProducto) {
		getTbProductos().add(tbProducto);
		tbProducto.setTbCategoria(this);

		return tbProducto;
	}

	public TbProducto removeTbProducto(TbProducto tbProducto) {
		getTbProductos().remove(tbProducto);
		tbProducto.setTbCategoria(null);

		return tbProducto;
	}

}