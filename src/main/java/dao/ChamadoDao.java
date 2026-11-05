
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
          
    
    }

