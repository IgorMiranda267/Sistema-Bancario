
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

    @Override
    public String toString() {
        return "ContaCorrente{" + "taxaManuten\u00e7\u00e3o=" + taxaManutenção + '}';
    }
    
    
    
    
    
}
