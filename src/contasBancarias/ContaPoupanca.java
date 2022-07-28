
package contasBancarias;


public class ContaPoupanca {
    private static int totalContasPouoanca;
    private double limiteSaque = 600.0f;
    
    
    public ContaPoupanca(){
        ContaPoupanca.totalContasPouoanca = ContaPoupanca.totalContasPouoanca + 1;
    }

    public static int getTotalContasPouoanca() {
        return totalContasPouoanca;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + "limiteSaque=" + limiteSaque + '}';
    }
    
    
    
}
