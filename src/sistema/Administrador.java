/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author igorm
 */
public class Administrador extends Funcionario{
    String idAdministrador;
    
    public Administrador(){
        super();
    }

    public Administrador( String nome, String cpf, String senha, String endereço, String telefone) {
        this.idAdministrador = cpf;
        this.nome = nome;
        this.senha = senha;
        this.endereço = endereço;
        this.telefone = telefone;
    }
    

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + '}';
    }
    
    
}
