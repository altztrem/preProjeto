
package dao;

import connection.ConnectionFactory;
import entities.DataChamado;
import entities.DataUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ChamadoDao {
 
    
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
              
       
          
    
    }

