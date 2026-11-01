/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author gablinux
 */
public class DataCategoria {
    private Long idCategoria;
    private String nome;
    private String descricao;

    public DataCategoria() {
    }

    public DataCategoria(Long idCategoria, String nome, String descricao, Long idChamado) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.idChamado = idChamado;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Long idChamado) {
        this.idChamado = idChamado;
    }
    
    
    
    private Long idChamado;
}
