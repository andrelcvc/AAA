package br.com.globalcode.facade;

import br.com.globalcode.model.Produto;
import java.util.List;

/**
 * Esta classe deve ser utilizada para implementação do acesso ao banco de dados
 */
public class JDBCFacade {
    
    private final static JDBCFacade instance = new JDBCFacade();
    
    private JDBCFacade() { }
    
    public static JDBCFacade getInstance() {
        return instance;
    }
    
    //implementar este m�todo
    public List<Produto> lerProdutos() {
        return null;
    }

    //implementar este m�todo
    public void salvarProduto(Produto p) {
        
    }
    
}
