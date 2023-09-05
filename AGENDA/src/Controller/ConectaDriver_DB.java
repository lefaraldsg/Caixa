
package Controller;

import javax.swing.JOptionPane;


public class ConectaDriver_DB {
    
    public static  void carregaDriver(){
       try { // Conecttando o driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            JOptionPane.showMessageDialog(null,"Banco de Dados carregado com sucesso!");




       } catch (Exception ex) { // Erro driver não encontrado
            JOptionPane.showMessageDialog(null,"ERRO S001\n Não possui Banco de Dados\n");
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
