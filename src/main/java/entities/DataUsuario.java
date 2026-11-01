/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author gablinux
 */
public class DataUsuario {
    private Long idUsuario;
    private String nome;
    private String email;
    private String perfil;
    private String setor;
    private String senhaHash;
    private String telefone;
    public  static String SessaoUsuario;


    public DataUsuario() {
    }

    public DataUsuario(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senhaHash = senha;
        this.telefone = telefone;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenha(String Senha) {
        this.senhaHash = Senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
     
    public static String getSessaoUsuario() {
       return  SessaoUsuario;
        
    }

    public static void setSessaoUsuario(String login) {
        SessaoUsuario = login;
        
    }
}
