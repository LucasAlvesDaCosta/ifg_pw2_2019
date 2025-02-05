package br.edu.ifg.sistemacomercial.bean;

import br.edu.ifg.sistemacomercial.entity.Cliente;
import br.edu.ifg.sistemacomercial.logic.ClienteLogic;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class ClienteBean extends GenericCrud<Cliente, ClienteLogic>{
        
    @Inject
    private ClienteLogic logic;
    
    @Override
    public ClienteLogic getLogic() {
        return logic;
    }
    
    public List<Cliente> getClientes(){
        try {
            return getLogic().buscar(null);
        } catch (Exception ex) {
            addMensagemErro(ex.getMessage());
            return null;
        }
    }
    
    
    
}
