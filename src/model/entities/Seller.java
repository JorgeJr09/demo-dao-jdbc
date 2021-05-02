package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;

	// Atributo que faz composi��o com Departamentos
	private Department department;

	// Construtores
	// Padr�o
	public Seller() {
	}

	// Com argumentos
	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// hashCode e equals para que os m�todos possam ser comparados pelo conte�do e
	// n�o pela refer�ncia de ponteiros
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
		Seller other = (Seller) obj;
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
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + ", department=" + department + "]";
	}

	// Implements Serializable, para os objetos poderem serem transformados em
	// sequ�ncias de bytes, pois na linguagem java � necess�rio caso o objeto seja
	// gravado em arquivo, trasnportado em rede, etc
	//
	// Implementado na classe, javaio

}
