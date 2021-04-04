package com.ecommerce.pedritastore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idUsuario;

    @NotNull
    @Size(min = 12, max= 100)
    private String nome;
    @NotNull
    @Size(min = 5, max= 100)
    private String usuario;
    @NotNull
    @Size(min = 5, max= 100)
    private String senha;
    
    @OneToMany(mappedBy="usuario", cascade = CascadeType.ALL)
    private List<Store> stores;
    
    @OneToMany(mappedBy="usuario", cascade = CascadeType.ALL)
    private List<Produto> produtos;
    
    public Usuario() {}
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUsario() {
        return usuario;
    }
    public void setUsario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
