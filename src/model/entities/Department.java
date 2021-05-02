package model.entities;

import java.io.Serializable;

public class Department implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private Integer id;
	private String name;

	// Construtores
	// Padrão
	public Department() {
	}
	// Com argumentos

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getteres e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// hashCode e equals para que os métodos possam ser comparados pelo conteúdo e
	// não pela referência de ponteiros
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	// toString, para ter uma facilidade para imprimir os objetos
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	// Implements Serializable, para os objetos poderem serem transformados em
	// sequências de bytes, pois na linguagem java é necessário caso o objeto seja
	// gravado em arquivo, trasnportado em rede, etc
	//
	// Implementado na classe, javaio

}
