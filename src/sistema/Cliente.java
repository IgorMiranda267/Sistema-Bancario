/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author igorm
 */
public class Cliente {

    String nome;
    String cpf;
    String senha;
    String endereço;
    String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String senha, String endereço, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + ", nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", endere\u00e7o=" + endereço + ", telefone=" + telefone + '}';
    }

}
