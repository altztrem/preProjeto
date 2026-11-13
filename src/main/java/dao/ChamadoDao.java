
package dao;

import connection.ConnectionFactory;
import entities.DataChamado;
import entities.DataUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ChamadoDao {
 SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public void CriarChamado(DataChamado dChamado,DataUsuario dUser){
      
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
              try {
            stmt = con.prepareStatement("INSERT INTO chamado(titulo,descricao,categoria,prioridade,IdUsuario) VALUES (?,?,?,?,?)");
            stmt.setString(1, dChamado.getTitulo());
            stmt.setString(2, dChamado.getDescricao());
            stmt.setString(3, dChamado.getCategoria());
            stmt.setString(4, dChamado.getPrioridade());
            stmt.setInt(5, dUser.getIdUsuario());
            System.out.println("idUsuario enviado: " + dUser.getIdUsuario());
            
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Chamado feito com sucesso !");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, " Algo deu errado "+ex);
        }finally{
            
            
        ConnectionFactory.closeConnection(con, stmt);
        
        
        }
    }
    public List<DataChamado> Lista(int IdUsuario){
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      ResultSet rs = null;
      
      List<DataChamado> Chamados = new ArrayList<>();
      
        try {
            stmt = con.prepareStatement("SELECT idChamado,titulo,statusChamado FROM chamado WHERE IdUsuario = ?");
            stmt.setInt(1, IdUsuario);
            rs =  stmt.executeQuery();
              
              while(rs.next()){
              
                  DataChamado d = new DataChamado();
                  d.setIdChamado(rs.getInt("idChamado"));
                  d.setTitulo(rs.getString("titulo"));
                  d.setStatusChamado(rs.getString("statusChamado"));
                  
                  Chamados.add(d);
                  
              }
            
            
            
        } catch (SQLException ex) {
            System.getLogger(ChamadoDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("erro");
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
      return Chamados;
    
    
    }
    
     public DataChamado BuscarChamado(int idChamado) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        DataChamado d = null;

        boolean check = false;
        
        try {

            stmt = con.prepareStatement("SELECT idChamado,titulo,descricao,prioridade,categoria,statusChamado FROM chamado WHERE IdChamado = ?");
            stmt.setInt(1, idChamado);

            rs = stmt.executeQuery();

            if (rs.next()) {
             d = new DataChamado();
            d.setIdChamado(rs.getInt("idChamado"));
            d.setTitulo(rs.getString("titulo"));
            d.setDescricao(rs.getString("descricao"));
            d.setPrioridade(rs.getString("prioridade"));
            d.setCategoria(rs.getString("categoria"));
            d.setStatusChamado(rs.getString("statusChamado"));
            
            }
           
                
        } catch (SQLException ex) {
          
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return d;

    }      
     
        public int qtdAberto(int idUsuario) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    DataChamado d = new DataChamado();
    int qtdAberto = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdAberto FROM chamado  WHERE statusChamado = ? and  idUsuario = ? ");
        stmt.setString(1, "Aberto");
        stmt.setInt(2, idUsuario);
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdAberto = rs.getInt("qtdAberto");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdAberto;
}
        
        
   public int qtdAndamento(int idUsuario) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    DataChamado d = new DataChamado();
    int qtdAndamento = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdAndamento FROM chamado  WHERE statusChamado = ? and  idUsuario = ? ");
        stmt.setString(1, "Andamento");
        stmt.setInt(2, idUsuario);
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdAndamento = rs.getInt("qtdAndamento");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdAndamento;
}
   
    public int qtdConcluido(int idUsuario) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    DataChamado d = new DataChamado();
    int qtdConcluido = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdConcluido FROM chamado  WHERE statusChamado = ? and  idUsuario = ? ");
        stmt.setString(1, "Concluido");
        stmt.setInt(2, idUsuario);
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdConcluido = rs.getInt("qtdConcluido");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdConcluido;
}
    
     public int qtdTotal(int idUsuario) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    DataChamado d = new DataChamado();
    int qtdTotal = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdTotal FROM chamado WHERE idUsuario = ? ");
        stmt.setInt(1, idUsuario);
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
            
            // OPÇÃO A: Se DataChamado tiver um objeto DataUsuario dentro dela (Mais recomendado)
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

