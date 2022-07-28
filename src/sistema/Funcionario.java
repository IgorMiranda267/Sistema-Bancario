/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author igorm
 */
public class Funcionario extends Cliente {
    String idFuncionario;
    String dataAdmissao;
    String dataDemissao;
    
    public Funcionario(){  
        super();
    }

    public Funcionario(String dataAdmissao, String nome, String cpf, String senha, String endereco, String telefone) {
       this.idFuncionario = cpf;
        this.nome = nome;
        this.senha = senha;
        this.endereço = endereco;
        this.telefone = telefone;
        this.dataAdmissao = dataAdmissao;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao + '}';
    }
    
    
}
