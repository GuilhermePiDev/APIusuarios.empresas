package com.project.apirestfull.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	
	@ManyToOne
	@JoinColumn(name = "empresa", referencedColumnName = "id_empresa")
	private EmpresaModel empresa;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public User() {

	}

    public EmpresaModel getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
}
