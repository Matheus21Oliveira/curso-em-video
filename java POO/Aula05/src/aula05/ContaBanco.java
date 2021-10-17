
package aula05;

public class ContaBanco {
     public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void status() {
        System.out.println("numero da conta " + this.numConta);
        System.out.println("tipo da conta " + this.tipo);
        System.out.println("nome do(a) proprietário(a) " + this.dono);
        System.out.println("saldo: " + this.saldo);
        System.out.println("status: " + this.status);
    } 
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("conta: " + this.getNumConta()); 
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono(a): " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
           this.setSaldo(50);
        } else if (t == "cp") {
            this.setSaldo(150);
        } 
        System.out.println("sua conta está aberta ");
    } 
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("voce precisará sacar seu saldo.");
        } else if (this.getSaldo() < 0){
            System.out.println("voce precisará quitar sua divida.");
        } else {
            System.out.println("sua conta será fechda.");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("depósito realizado");
        } else {
            System.out.println("deposito nao realizado ");
        }
        
    } 
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado");
            } else {
                System.out.println("saldo insuficiente");
            }
        } else {
            System.out.println("esta conta esta fechada");
        }
    } 
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("pagamento efetuado");
        } else {
            System.out.println("a conta está fechada");
        }
    }

    public ContaBanco() {       
        this.setSaldo(0);
        this.setStatus(false);
    }

    public float getNumConta() {
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
