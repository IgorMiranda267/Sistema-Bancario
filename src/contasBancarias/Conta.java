
package contasBancarias;


public class Conta {
    private static int totalDeContas;
    private int idConta;
    private int agencia;
    private int numeroConta;
    private int senha;
    private int saldo;
    private ContaPoupanca ContaPoupanca; // Composição da Classe ContaPoupança.
    private ContaSalario contaSalario; // Composição da classe ContaSalario.
    private ContaCorrente contaCorrente; //Composição da classe ContaCorrente.

   //Construtor padrão que vai contar o total de contas.
   public Conta(){
       Conta.totalDeContas  = Conta.totalDeContas + 1;
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo, String operacao) {
        
        //Verifica se o saldo a sacar ou transdferir e maior ou igual ao saldo presente na conta
        if((operacao.equals("saque")) || (operacao.equals("transferencia"))){
            if(this.saldo >= saldo){
                this.saldo = this.saldo - saldo;
            }
            else{
                //saldo infuciente
            }
        }
        
        //Caso o cliente escolha deposito na interface credita o valor na conta.
         if(operacao == "deposito"){
             this.saldo = this.saldo + saldo;
         }
        
    }
   
   

    

}
