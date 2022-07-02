
package contasBancarias;


public class ContaSalario {
    private static int totalContasSalario;
    private String cnjpEmpresa;
    
    
    public ContaSalario() {
        ContaSalario.totalContasSalario = ContaSalario.totalContasSalario + 1;
    }

    public String getCnjpEmpresa() {
        return cnjpEmpresa;
    }

    public void setCnjpEmpresa(String cnjpEmpresa) {
        this.cnjpEmpresa = cnjpEmpresa;
    }
    
    
}
