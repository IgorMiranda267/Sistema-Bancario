package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import json.JSONObject;

public class Arquivos {

    public Arquivos() {

    }

    public void criaAquivoCliente() throws IOException {
        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();
        FileWriter writeFile = null;

        //Armazena dados em um Objeto JSON
        jsonObject.put("cpf", "");
        jsonObject.put("senhalogin", "");
        jsonObject.put("nome", " ");
        jsonObject.put("endereco", " ");
        jsonObject.put("telefone", " ");
        jsonObject.put("idConta", "");
        jsonObject.put("agencia", "");
        jsonObject.put("numeroConta", "");
        jsonObject.put("senhaBanco", "");
        jsonObject.put("saldo", "");

        try {
            writeFile = new FileWriter("./src/arquivos/Cliente.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(jsonObject.toString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();// Escreve no console o erro que foi gerado.
        } finally {
            writeFile.close();
        }

        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }

    public void criaAquivoFuncionario() throws IOException {
        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();
        FileWriter writeFile = null;

        //Armazena dados em um Objeto JSON
        jsonObject.put("id", " ");
        jsonObject.put("senha", "");
        jsonObject.put("nome", " ");
        jsonObject.put("endereco", " ");
        jsonObject.put("telefone", " ");
        jsonObject.put("dataAdmissao", " ");
        jsonObject.put("dataDemissao", " ");

        try {
            writeFile = new FileWriter("./src/arquivos/Funcionario.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(jsonObject.toString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();// Escreve no console o erro que foi gerado.
        } finally {
            writeFile.close();
        }

        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }

    public void criaArquivoAdministrador() throws IOException {
        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();
        FileWriter writeFile = null;

        //Armazena dados em um Objeto JSON
        jsonObject.put("id", "007");
        jsonObject.put("senha", "789");
        jsonObject.put("nome", "");
        jsonObject.put("endereco", "");
        jsonObject.put("telefone", "");

        try {
            writeFile = new FileWriter("./src/arquivos/Administrador.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(jsonObject.toString());
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
