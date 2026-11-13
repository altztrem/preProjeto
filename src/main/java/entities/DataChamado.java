
package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataChamado {
    
   
    //chave estrangeira FIM

    
    private DataUsuario usuario;
    
    private int idChamado;
    private String titulo;
    private String descricao;
    private String statusChamado;
    private String categoria;
    private String prioridade;
    private String dataAbertura;
    private String dataFechadura;
    
    public DataChamado() {
    }

    public DataChamado(Long idCategoria, int idUsuario, int idChamado, String titulo, String descricao, String status, String prioridade, String dataAbertura, String categoria) {
        this.categoria = categoria;
        this.idChamado = idChamado;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusChamado = status;
        this.prioridade = prioridade;
        this.dataAbertura = dataAbertura;
    }
    
     public DataUsuario getUsuario() {
        return usuario;
    }

    //chave estrangeira INICIO
    public void setUsuario(DataUsuario usuario) {
        this.usuario = usuario;
    }
    
    
    public String getStatusChamado() {
        return statusChamado;
    }

    public void setStatusChamado(String statusChamado) {
        this.statusChamado = statusChamado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(int idChamado) {
        this.idChamado = idChamado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return statusChamado;
    }

    public void setStatus(String status) {
        this.statusChamado = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechadura() {
        return dataFechadura;
    }

    public void setDataFechadura(String dataFechadura) {
        this.dataFechadura = dataFechadura;
    }

   
    
}
