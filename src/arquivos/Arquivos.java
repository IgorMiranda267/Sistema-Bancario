package arquivos;

import contasBancarias.Conta;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import sistema.Administrador;
import sistema.Funcionario;
import sistema.Cliente;

public class Arquivos {

    private static JSONObject jsonObject = new JSONObject();
    private static JSONArray array = new JSONArray();

    public Arquivos() {

    }

    public void criaAquivoCliente(List<Cliente> clientes, List<Conta> conta) throws IOException {

        FileWriter writeFile = null;
        for (Cliente i : clientes) {
            //Armazena dados em um Objeto JSON
            jsonObject.put("cpf", i.getCpf());
            jsonObject.put("senhalogin", i.getSenha());
            jsonObject.put("nome", i.getNome());
            jsonObject.put("endereco", i.getEndereço());
            jsonObject.put("telefone", i.getTelefone());

        }
        for (Conta c : conta) {
            jsonObject.put("agencia", c.getIdAgencia());
            jsonObject.put("numeroConta", c.getNumeroConta());
            jsonObject.put("senhaBanco", c.getSenha());
            jsonObject.put("saldo", c.getSaldo());
        }

        array.add(jsonObject);
        jsonObject = new JSONObject();

        try {
            writeFile = new FileWriter("./src/arquivos/Cliente.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(array.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();// Escreve no console o erro que foi gerado.
        } finally {
            writeFile.close();
        }

        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }

    public void criaAquivoFuncionario(List<Funcionario> funcionario) throws IOException {

        FileWriter writeFile = null;
        for (Funcionario f : funcionario) {
            //Armazena dados em um Objeto JSON
            jsonObject.put("id", f.getIdFuncionario());
            jsonObject.put("senha", f.getSenha());
            jsonObject.put("nome", f.getNome());
            jsonObject.put("endereco", f.getEndereço());
            jsonObject.put("telefone", f.getTelefone());
            jsonObject.put("dataAdmissao", f.getDataAdmissao());
            jsonObject.put("dataDemissao", f.getDataDemissao());

            array.add(jsonObject);
            jsonObject = new JSONObject();
            //arrayFuncionario = new JSONArray();

        }

        try {
            writeFile = new FileWriter("./src/arquivos/Funcionario.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(array.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();// Escreve no console o erro que foi gerado.
        } finally {
            writeFile.close();
        }

        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }

    public void criaArquivoAdministrador(List<Administrador> administrador) throws IOException {

        FileWriter writeFile = null;
        for (Administrador a : administrador) {
            //Armazena dados em um Objeto JSON
            jsonObject.put("id", "007");
            jsonObject.put("senha", "789");
            jsonObject.put("nome", "");
            jsonObject.put("endereco", "");
            jsonObject.put("telefone", "");

            array.add(jsonObject);
            jsonObject = new JSONObject();
        }

        try {
            writeFile = new FileWriter("./src/arquivos/Administrador.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(array.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();// Escreve no console o erro que foi gerado.
        } finally {
            writeFile.close();
        }

        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }
}
