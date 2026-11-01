
package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataChamado {
    
    //chave estrangeira INICIO
    private Long idCategoria;
    private Long idUsuario;
    //chave estrangeira FIM
    
    
    
    private Long idChamado;
    private String titulo;
    private String descricao;
    private String statusChamado;
    private String prioridade;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechadura;

    public DataChamado() {
    }

    public DataChamado(Long idCategoria, Long idUsuario, Long idChamado, String titulo, String descricao, String status, String prioridade, LocalDateTime dataAbertura) {
        this.idCategoria = idCategoria;
        this.idUsuario = idUsuario;
        this.idChamado = idChamado;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusChamado = status;
        this.prioridade = prioridade;
        this.dataAbertura = LocalDateTime.now();
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Long idChamado) {
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

    public DataChamado(Long idCategoria, Long idUsuario, Long idChamado, String titulo, String descricao, String statusChamado, String prioridade, LocalDateTime dataAbertura, LocalDateTime dataFechadura) {
        this.idCategoria = idCategoria;
        this.idUsuario = idUsuario;
        this.idChamado = idChamado;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusChamado = statusChamado;
        this.prioridade = prioridade;
        this.dataAbertura = dataAbertura;
        this.dataFechadura = dataFechadura;
    }
    
}
