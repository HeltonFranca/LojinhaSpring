package com.ApiSpringETE.Lojinha.models;

import jakarta.persistence.*;


@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    
    private String marca;
    
    private String categoria;
    
    private double preco;
    
    @Column(columnDefinition = "TEXT")
    private String descricao;
    
    private Date criadoEm;
    
    private String nomesArquivosImagem;
    

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String getNomesArquivosImagem() {
        return nomesArquivosImagem;
    }

    public void setNomesArquivosImagem(String nomesArquivosImagem) {
        this.nomesArquivosImagem = nomesArquivosImagem;
    }
}