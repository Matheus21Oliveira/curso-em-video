package projetoyoutube;

public class Video implements AçoesVideos{
    private String titulo;
    private int avaliaçao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliaçao = 1;
        this.views= 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliaçao(int avaliaçao) {
        this.avaliaçao = avaliaçao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo = " + titulo + ", avalia\u00e7ao = " + avaliaçao + ", views = " + views + ", curtidas = " + curtidas + ", reproduzindo = " + reproduzindo + '}';
    }
    
}
