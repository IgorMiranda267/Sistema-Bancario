/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author igorm
 */
abstract class Pessoa {
    
    public String nome;
    public String endereco;
    public String telefone;
    public String contasAssociadas;
    
    
    public Pessoa(){
        
    }
    
    public abstract void imprimir();
    
    
}
