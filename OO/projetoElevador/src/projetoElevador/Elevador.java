package projetoelevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasDentro;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasDentro = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasDentro() {
        return pessoasDentro;
    }

    public void setPessoasDentro(int pessoasDentro) {
        this.pessoasDentro = pessoasDentro;
    }
    
    public void entrar(){
        if (getPessoasDentro() == (this.getCapacidade())) {
            System.out.println("Elevador cheio!");
        } else {
            this.pessoasDentro++;
        }
    }
    
    public void sair() {
        if (this.pessoasDentro > 0){
            this.pessoasDentro --;
        } else {
            System.out.println("Não há ninguém no elevador!");
        }
    }
    
    public void subir() {
        if (this.andarAtual == this.totalAndares){
            System.out.println("Não é possível subir mais!");
        } else {
              this.andarAtual++;  
        }
    }
    
    public void descer() {
        if (this.andarAtual == 0){
            System.out.println("Não é possível descer mais!");
        } else {
            this.andarAtual --;
        }
    }

    public void imprimir() {
        System.out.println("Andar atual: " + this.andarAtual);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Total de andares: " + this.totalAndares);
        System.out.println("Pessoas dentro do elevador: " + this.pessoasDentro);
    }
    
    
}
