package uec;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
        System.out.println("lutador: " + this.getNome());
        System.out.println("categoria: " + this.getCategoria());
        System.out.println("origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(getAltura() + " altura");
        System.out.println("pesando: " + this.getPeso() + " kg");
        System.out.println("ganhou: " + this.getVitorias() + " luta(s)");
        System.out.println("perdeu: " + this.getDerrotas() + " luta(s)");
        System.out.println("empatou: " + this.getEmpates() + " luta(s)");
    } 
    
    public void status() { 
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + "vitorias");
        System.out.println(getDerrotas() + "derrotas");
        System.out.println(getEmpates() + "empates");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    } 
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() - 1);
    } 
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "invalido";
        } else if (peso <= 70.3) {
            this.categoria = "leve";
        } else if (peso <= 83.9) {
            this.categoria = "medio";
        } else if (peso <= 120.2) {
            this.categoria = "pesado";
        } else {
            this.categoria = "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
} 

