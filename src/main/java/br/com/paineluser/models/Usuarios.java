package br.com.paineluser.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuarios {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@NotNull
	private String nome;
	
	//@NotNull
	private String senha;
	
	//@NotNull
	private String userName;
	
	//@NotNull
	private Date dataDeNascimento;
	
	
	private String foto;
	
	public Usuarios() {};
	
	public Usuarios(
			Long id,
			String nome,
			String senha,
			String userName,
			Date dataDeNascimento,
			String foto) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.userName = userName;
		this.dataDeNascimento = dataDeNascimento;
		this.foto = foto;}

	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

}
