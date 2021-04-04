package com.ecommerce.pedritastore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduto;

    @NotNull
    @Size(min = 5, max= 100)
    private String tituloProduto;

    private Float valor;
    
    @NotNull
    @Size(min = 5, max= 100) 
    private String urlimagem;
    
    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getTituloProduto() {
        return tituloProduto;
    }

    public void setTituloProduto(String tituloProduto) {
        this.tituloProduto = tituloProduto;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getUrlimagem() {
		return urlimagem;
	}

	public void setUrlimagem(String urlimagem) {
		this.urlimagem = urlimagem;
	}
}
