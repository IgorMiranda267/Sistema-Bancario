package sistema;

import arquivos.Arquivos;
import contasBancarias.Conta;
import interfaces.Login;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.parser.ParseException;


public class Sistema {

    public static void main(String args[]) throws IOException, ParseException {
        
        Funcionario [] funcionario = new Funcionario[25];
        List<Conta> listConta = new ArrayList<>();
        List<Funcionario> listFuncionario = new ArrayList<>();
        List<Cliente> listCliente = new ArrayList<>();
        
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        
        listCliente.add(c1);
        listCliente.add(c2);
        listCliente.add(c3);
        
        
       Arquivos aqr = new Arquivos();
       Arquivos aqr1 = new Arquivos();
       
       aqr.criaAquivoCliente(listCliente, listConta);
 
            
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

}
