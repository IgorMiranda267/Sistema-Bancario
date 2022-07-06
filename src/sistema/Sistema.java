package sistema;

import arquivos.Arquivos;
import interfaces.Login;
import java.io.FileWriter;
import java.io.IOException;
import json.JSONObject;



public class Sistema {
    public static void main(String args[]) {
       
        Arquivos arquivos = new Arquivos();
        
        arquivos.criaAquivoCliente();
        arquivos.criaAquivoFuncionario();
        arquivos.criaArquivoAdministrador();
  
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
              
            }
        });
    }
}
 
