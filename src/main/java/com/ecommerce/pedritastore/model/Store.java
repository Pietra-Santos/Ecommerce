package com.ecommerce.pedritastore.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStore;
    
    @NotNull
    @Size (min = 5, max = 50 )
    private String nomeStore;
    
    @NotNull
    @Size (min = 5, max = 250 )
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @OneToMany(mappedBy="store")
    private List<Produto> produtos;
   
    public Store() {}
    
    public long getIdStore() {
        return idStore;
    }
    public void setIdStore(long idStore) {
        this.idStore = idStore;
    }
 
    public String getNomeStore() {
		return nomeStore;
	}
	public void setNomeStore(String nomeStore) {
		this.nomeStore = nomeStore;
	}
	public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
