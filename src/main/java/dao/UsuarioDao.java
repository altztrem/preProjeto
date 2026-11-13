
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
 public List<DataUsuario> ListaUsuario(){
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      ResultSet rs = null;
      
      List<DataUsuario> Usuarios = new ArrayList<>();
      
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            
            rs =  stmt.executeQuery();
              
              while(rs.next()){
              
                  DataUsuario d = new DataUsuario();
                  d.setIdUsuario(rs.getInt("idUsuario"));
                  d.setNome(rs.getString("nome"));
                  d.setPerfil(rs.getString("perfil"));
                  d.setEmail(rs.getString("email"));
                  d.setSetor(rs.getString("setor"));
                 
                  
                  Usuarios.add(d);
                  
              }
            
            
            
        } catch (SQLException ex) {
            System.getLogger(ChamadoDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("erro");
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
      return Usuarios;
    
    
    }          
        
   
        
        
        public int qtdTotalUsuario() {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    int qtdTotalUsuario = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdTotalUsuario FROM Usuario");
        
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdTotalUsuario = rs.getInt("qtdTotalUsuario");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Erro na contagem total de usuarios.");
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdTotalUsuario;
}

        
        
        
        
        
        public int qtdAdministrador() {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    int qtdAdministrador = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdAdministrador FROM Usuario WHERE perfil = ?");
        stmt.setString(1, "Administrador");
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdAdministrador = rs.getInt("qtdAdministrador");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Erro na contagem de Administradores.");
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdAdministrador;
}
        public int qtdTecnico() {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    int qtdTecnico = 0;

    try {
        stmt = con.prepareStatement("SELECT COUNT(*) AS qtdTecnico FROM Usuario WHERE perfil = ?");
        stmt.setString(1, "Tecnico");
        rs = stmt.executeQuery();

        if (rs.next()) {
            qtdTecnico = rs.getInt("qtdTecnico");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Erro na contagem de tecnicos.");
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
    }

    return qtdTecnico;
}
       public DataUsuario BuscarUsuario(int idUsuario) {
              

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        DataUsuario u = null;

   
       
        try {

            stmt = con.prepareStatement("SELECT  idUsuario,nome,email,SenhaHash,setor,telefone,perfil FROM usuario WHERE IdUsuario = ?");
            stmt.setInt(1, idUsuario);

            rs = stmt.executeQuery();

            if (rs.next()) {
             u = new DataUsuario();
             u.setIdUsuario(rs.getInt("idUsuario"));
             u.setNome(rs.getString("nome"));
             u.setEmail(rs.getString("email"));
             u.setSenha(rs.getString("SenhaHash"));
             u.setSetor(rs.getString("setor"));
             u.setTelefone(rs.getString("telefone"));
             u.setPerfil(rs.getString("perfil"));
             
             
            System.out.println(""+u.getNome());
            
            }
           
                
        } catch (SQLException ex) {
          
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao puxar dados");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return u;

    }         
        
        
        
        
        
    
    }
    
    
    

