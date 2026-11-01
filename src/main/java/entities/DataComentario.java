/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataComentario {
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

    private Long idComentario;
    private String Texto;
    private LocalDateTime dataHora;
    private String DataHoraTexto = dataHora.format(formatter);

    public DataComentario() {
    }

    public DataComentario(Long idComentario, String Texto, LocalDateTime dataHora, Long idUsuario, Long idChamado) {
        this.idComentario = idComentario;
        this.Texto = Texto;
        this.dataHora = LocalDateTime.now();
        this.idUsuario = idUsuario;
        this.idChamado = idChamado;
    }

    public Long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Long idComentario) {
        this.idComentario = idComentario;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
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
    
    //chave estrangeira
    private Long idUsuario;
    private Long idChamado;
}
