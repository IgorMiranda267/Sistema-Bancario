package contasBancarias;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Conta {

    private static int totalDeContas;
    private int idConta;
    private int agencia;
    private int numeroConta;
    private int senha;
    private double saldo;
    private ContaPoupanca ContaPoupanca; // Composição da Classe ContaPoupança.
    private ContaSalario contaSalario; // Composição da classe ContaSalario.
    private ContaCorrente contaCorrente; //Composição da classe ContaCorrente.

    //Construtor padrão que vai contar o total de contas.
    public Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo, String operacao) {

        JSONObject jsonObject = null;
        JSONParser parser = new JSONParser();

        String saldoArquivo = null;
        double saldoAtual = 0.0;

        try {
            //Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject) parser.parse(new FileReader("./src/arquivos/Cliente.json"));

            //Salva nas variaveis os dados retirados do arquivo
            saldoArquivo = (String) jsonObject.get("saldo");

            System.out.printf("saldo arquivo: %s\n", saldoArquivo);
        } //Trata as exceptions que podem ser lançadas no decorrer do processo
        catch (FileNotFoundException e) {
        } catch (IOException | ParseException e) {
        }
        // TODO Auto-generated catch block
        saldoAtual = Double.parseDouble(saldoArquivo);

        //Verifica se o saldo a sacar ou transdferir e maior ou igual ao saldo presente na conta
        if ((operacao.equals("saque")) || (operacao.equals("transferencia"))) {
            if (saldoAtual >= saldo) {
                saldoAtual = saldoAtual - saldo;
                FileWriter writeFile = null;

                jsonObject.put("saldo",saldoAtual);

                try {
                    writeFile = new FileWriter("./src/arquivos/Cliente.json");
                    //Escreve no arquivo conteudo do Objeto JSON
                    writeFile.write(jsonObject.toString());
                    writeFile.close();// Fecha arquivo.
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                //saldo infuciente
            }
        }

        //Caso o cliente escolha deposito na interface credita o valor na conta.
        if ("deposito".equals(operacao)) {
            saldoAtual = saldoAtual + saldo;
        }
    }

}
