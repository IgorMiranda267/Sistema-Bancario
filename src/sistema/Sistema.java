package sistema;

import arquivos.Arquivos;
import interfaces.Login;



public class Sistema {
    public static void main(String args[]) {
       
        Arquivos arquivos = new Arquivos();
       
        
   
        arquivos.criaAquivoCliente();
        arquivos.criaAquivoFuncionario();
        arquivos.criaArquivoAdministrador();
        
     
        
        /*
        JSONObject jsonObject;
        JSONParser parser = new JSONParser();

        String saldoArquivo;
        double saldoAtual;

        try {
            //Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject)parser.parse(new FileReader("./src/arquivos/Cliente.json"));
            jsonObject.put("saldo","");
            //Salva nas variaveis os dados retirados do arquivo
            saldoArquivo = (String) jsonObject.get("saldo");
            
            saldoAtual = Double.parseDouble(saldoArquivo);
            
            System.out.printf("%s\n", saldoArquivo);
            System.out.printf("%s\n", saldoAtual);
            
            
        } //Trata as exceptions que podem ser lançadas no decorrer do processo
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        
        
   */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
              
            }
        });
    }
       
    }
 
