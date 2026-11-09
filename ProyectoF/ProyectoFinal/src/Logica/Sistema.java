package Logica;

public class Sistema {
   
   
    private Cuenta[] clientes;
    private int conta;
    
    public Sistema(){
        clientes = new Cuenta[1];
        conta = 0;
    }
    
    public boolean registrar(Cuenta cliente){
        if(buscar(cliente.getUsuario()) != null || usuarioExistente(cliente.getUsuario())){
          return false
                  ; 
        }
        clientes[conta] = cliente;
       
        conta++;
        redimensionar();
        return true;
    }
    
    
    public void redimensionar(){
    Cuenta[] aux = new Cuenta[conta+1];
        for (int i = 0; i < conta; i++) {
            aux[i] = clientes[i];
        }
        clientes = aux;
    }
    
    
    
    public Cuenta inicioSesion(String usuario, String clave){
        
        for (int i = 0; i < conta; i++) {
            if(clientes[i].getUsuario().equals(usuario) 
                    && clientes[i].getClave().equals(clave))
                      
                return clientes[i];
        }
        return null;
    }
    
    
    
    public Cuenta buscar(String usuario){
        
        for (int i = 0; i < conta; i++) {
            if(clientes[i].getUsuario().equals(usuario))
                
                return clientes[i];
        }
        return null;
    }
    
    public boolean usuarioExistente(String usuario){
        for (int i = 0; i < conta; i++) {
            if(clientes[i].getUsuario().equals(usuario))
                return true;
        }
        return false;
    }
    
    /*public void eliminar(pos){
        Cuenta[] aux = new Cuenta[conta-1];
        int j = 0;
        for (int i = 0; i < conta; i++) {
            if(1 != pos){
            aux[j] = clientes[i];
            j++;
            }
        }
        
    }*/

    
}


