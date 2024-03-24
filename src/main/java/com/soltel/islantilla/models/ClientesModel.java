package com.soltel.islantilla.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name="clientes")
public class ClientesModel {

	// Atributos (campos BBDD)
	@Id
	private String nif;
	
	@Column (name= "nombre")
	private String nombre;
	
	@Column
	private int edad;
	
	@Column
	private boolean sexo;

	// Hay que poner en la relación de tablas. OneToMany en el 1 y ManyToOne en el muchos
	// Aquí ponemos el OneToMany
	@OneToMany (mappedBy = "nif")
	private Set<ReservasModel> reservas;
	
	// Setter y Getter

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	
	// Constructors
	public ClientesModel() {}
	
	public ClientesModel(String nif, String nombre, int edad, boolean sexo) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
}
