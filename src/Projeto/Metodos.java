
package Projeto;

import java.util.ArrayList;
import java.util.List;

public class Metodos {
    
    Pessoa pessoa = new Pessoa();
    
    List<Pessoa> listarPessoa = new ArrayList<Pessoa>();
    
    public boolean addPessoa(Pessoa pessoa){        
        try {
            listarPessoa.add(pessoa);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    
    
    public List<Pessoa>listarPessoa(){
        return this.listarPessoa();
    }
    
}
