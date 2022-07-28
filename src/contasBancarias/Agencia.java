/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contasBancarias;

/**
 *
 * @author igorm
 */
public class Agencia {
    String nome;
    String endereco;
    int idAgencia;
    
    public Agencia (){ 
    }

    public Agencia(String nome, String endereco, int idAgencia) {
        this.nome = nome;
        this.endereco = endereco;
        this.idAgencia = idAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" + "nome=" + nome + ", endereco=" + endereco + ", idAgencia=" + idAgencia + '}';
    }
}
