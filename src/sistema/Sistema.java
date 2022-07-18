package sistema;

import arquivos.Arquivos;
import interfaces.Login;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sistema {

    public static void main(String args[]) throws IOException, ParseException {

        Arquivos c1 = new Arquivos();
        Arquivos c2 = new Arquivos();

        c1.criaArquivoAdministrador();
        c2.criaArquivoAdministrador();

 
            JSONObject jsonObject;
            //Cria o parse de tratamento
            JSONParser parser = new JSONParser();
            //Variaveis que irao armazenar os dados do arquivo JSON
            String id;
            String senha;
      

            try {
                //Salva no objeto JSONObject o que o parse tratou do arquivo
                jsonObject = (JSONObject) parser.parse(new FileReader("./src/arquivos/Administrador.json"));

                //Salva nas variaveis os dados retirados do arquivo
                id = (String) jsonObject.get("id");
                senha = (String) jsonObject.get("senha");
              
                System.out.printf("Nome: %s\nid: %s\nsenha: ",id, senha);
            } //Trata as exceptions que podem ser lançadas no decorrer do processo
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

}
