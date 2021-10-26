package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        Video vetor[] = new Video[3];
        vetor [0] = new Video("aula 1 de POO");
        vetor[1] = new Video("aula 12 de PHP");
        vetor[2] = new Video("aula 10 de JAVA");
        
       Gafanhoto g[] = new Gafanhoto[2];
       
       g[0] = new Gafanhoto("matheus", 22, "M", "Theus");
       g[1] = new Gafanhoto("Marlene", 27, "F", "Lene");
        
        System.out.println(vetor[2].toString());
    }
    
}
