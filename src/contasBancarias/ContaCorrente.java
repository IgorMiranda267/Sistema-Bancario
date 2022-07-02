
package contasBancarias;

public class ContaCorrente {
    private static int totalContasCorrente;
    private double taxaManutenção;

    public ContaCorrente() {
        ContaCorrente.totalContasCorrente = ContaCorrente.totalContasCorrente + 1;
    }

    public static int getTotalContasCorrente() {
        return totalContasCorrente;
    }


    public double getTaxaManutenção() {
        return taxaManutenção;
    }

    public void setTaxaManutenção(double taxaManutenção) {
        this.taxaManutenção = taxaManutenção;
    }
    
    
    
    
    
}
