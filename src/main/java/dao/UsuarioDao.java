
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

public class UsuarioDao {
    DataChamado dtChamado = new DataChamado();
    DataUsuario dtUsuario = new DataUsuario();
    
    public void CriarCadastro(DataUsuario d){
      
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
  
              try {
            stmt = con.prepareStatement("INSERT INTO usuario(nome,email,senhaHash,perfil,setor,telefone) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getEmail());
            stmt.setString(3, d.getSenhaHash());
            stmt.setString(4, d.getPerfil());
            stmt.setString(5, d.getSetor());
            stmt.setString(6, d.getTelefone());
            
            
            stmt.executeUpdate();
            
            
            

            JOptionPane.showMessageDialog(null, "Salvo com sucesso !");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, " Algo deu errado "+ex);
        }finally{
            
            
        ConnectionFactory.closeConnection(con, stmt);
        
        
        }
    }
              
        public String checkLogin(String email, String senha, String nome) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    String perfil = null;

    try {
        stmt = con.prepareStatement("SELECT * FROM usuario WHERE (email = ? or nome = ?) and senhaHash = ?");
        stmt.setString(1, email);
        stmt.setString(2, nome);
        stmt.setString(3, senha);

        rs = stmt.executeQuery();

        if (rs.next()) {
            perfil = rs.getString("perfil");
            dtUsuario.idUsuario = rs.getInt("idUsuario");
        }

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return perfil;
}          
    
    }
    
    
    

