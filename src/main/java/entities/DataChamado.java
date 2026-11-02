
package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataChamado {
    
    //chave estrangeira INICIO
    public static int idUsuario;
    //chave estrangeira FIM

    
    
    
    private int idChamado;
    private String titulo;
    private String descricao;
    private String statusChamado;
    private String categoria;
    private String prioridade;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechadura;
    public DataChamado() {
    }

    public DataChamado(Long idCategoria, int idUsuario, int idChamado, String titulo, String descricao, String status, String prioridade, LocalDateTime dataAbertura, String categoria) {
        this.categoria = categoria;
        this.idUsuario = idUsuario;
        this.idChamado = idChamado;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusChamado = status;
        this.prioridade = prioridade;
        this.dataAbertura = LocalDateTime.now();
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataFechadura() {
        return dataFechadura;
    }

    public void setDataFechadura(LocalDateTime dataFechadura) {
        this.dataFechadura = dataFechadura;
    }

   
    
}
