/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionFactory;
import entities.DataChamado;
import entities.DataUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gablinux
 */
public class TecnicoDao {
     //QUANTIDADE DO ADM/TECNICO
   public int qtdTotalAndamento() {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int qtdTotalAndamento = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdTotalAndamento FROM chamado  WHERE statusChamado = ?");
        stmt.setString(1, "Andamento");
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdTotalAndamento = rs.getInt("qtdTotalAndamento");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdTotalAndamento;
}
   //QUANTIDADE DO ADM/TECNICO
     public int qtdTotalConcluido() {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    int qtdTotalConcluido = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdTotalConcluido FROM chamado  WHERE statusChamado = ?");
        stmt.setString(1, "Concluido");
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdTotalConcluido = rs.getInt("qtdTotalConcluido");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdTotalConcluido;
}
      //QUANTIDADE TOTAL ADM/TECNICO
        public int qtdTotalChamados(DataChamado d) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
   
    int qtdTotal = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdTotal FROM chamado");
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdTotal = rs.getInt("qtdTotal");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdTotal;
}
        //QUANTIDADE DO ADM/TECNCO
  public int qtdTotalAberto() {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int qtdTotalAberto = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdTotalAberto FROM chamado  WHERE statusChamado = ?");
        stmt.setString(1, "Aberto");

        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdTotalAberto = rs.getInt("qtdTotalAberto");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdTotalAberto;
}
  
  
     public List<DataChamado> ListaTotalChamados() {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    List<DataChamado> chamados = new ArrayList<>();
    
    try {
        stmt = con.prepareStatement("SELECT c.idChamado, c.idUsuario, u.nome AS nomeUsuario, c.titulo, c.statusChamado, c.prioridade FROM chamado c INNER JOIN usuario u ON c.idUsuario = u.idUsuario;");
        rs = stmt.executeQuery();
        
        while (rs.next()) {
            DataChamado c = new DataChamado();
            
            c.setIdChamado(rs.getInt("idChamado"));
            c.setTitulo(rs.getString("titulo"));
            c.setStatusChamado(rs.getString("statusChamado"));
            c.setPrioridade(rs.getString("prioridade"));
            
     
            DataUsuario u = new DataUsuario();
            u.setIdUsuario(rs.getInt("idUsuario"));
            u.setNome(rs.getString("nomeUsuario"));
            c.setUsuario(u);
          
            
            
            chamados.add(c);
        }
        
    } catch (SQLException ex) {
        System.getLogger(ChamadoDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        System.out.println("erro: " + ex.getMessage());
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
    
    return chamados;
}
   
}
