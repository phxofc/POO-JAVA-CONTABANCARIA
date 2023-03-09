package banco;

public class Conta {

    public int numConta;
    protected String tipo; //cc = conta corrente; //cp: conta popança
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("*---------------------------------*");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("tipo: "+this.getTipo());
        System.out.println("Status: "+this.getStatus());
        
    }
    
    
        public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
            System.out.println("CONTA ABERTA COM SUCESSO");
    }

    public void fecharConta() {
        if (this.getSaldo()> 0) {
            System.out.println("CONTA COM DINHEIRO!!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("deposito realizado com sucesso na conta de "+this.getDono());
        } else {
            System.out.println("impossivel depositar em conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("saque realizado na conta de "+this.getDono());
            } else {
                System.out.println("saldo insulficiente");
            }
        } else {
            System.out.println("impossivel sacar em conta fechada");
        }
    }

    public void pagarMensal() {
        int valorMensal = 0;

        if (this.getTipo() == "CC") {
            valorMensal = 12;
        } else if (this.getTipo() == "CP") {
            valorMensal = 20;
        }
        
        if(this.getStatus()){
           
                this.setSaldo(this.getSaldo() - valorMensal);
                System.out.println("mensalidade paga por "+this.getDono());
            
        }else{
            System.out.println("impossivel pagar em conta fechada");
        }
    }
    
    
 
    

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



}
