
package banco;


public class Banco {

    
    public static void main(String[] args) {
        
        Conta p1 = new Conta();
        p1.setNumConta(11111);
        p1.setDono("Pedro");
        p1.abrirConta("CP");
        
        
        p1.sacar(150);
        p1.fecharConta();
        
        Conta p2 = new Conta();
        p2.setNumConta(11111);
        p2.setDono("bia");
        p2.abrirConta("CC");

        p2.depositar(500);
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
       
    }
    
}
