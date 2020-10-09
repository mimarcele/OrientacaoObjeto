package oo;

public class CaixaDeSom implements ControladorCaixa {
    //ATRIBUTOS
    private String marca;
    private boolean ligada;
    private boolean tocando;
    private int volume;
    private String cor;

    public CaixaDeSom(String marca, String cor, int volume) {
        this.marca = marca;
        this.cor = cor;
        this.volume = volume;
        this.setVolume(20);
        this.setLigada(false);
        this.setTocando(false);
        }

        public void status(){
            System.out.println("===============================");
            System.out.println("Ligando " + this.getMarca());
            System.out.println("Cor: " + this.getCor());
            System.out.println("Está ligada? " + this.getLigada());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume " + this.getVolume() );
            System.out.println("===============================");
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public boolean getLigada(){
        return this.ligada;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    public boolean getTocando(){
        return this.tocando;
    }

    @Override
    public void ligar() {
        this.setLigada(true);
    }

    @Override
    public void desligar() {
        this.setLigada(false);
    }

    @Override
    public void aumentarSom() {
    if(getLigada() == true && getTocando() == true){
        setVolume(this.getVolume() + 3);
    } else{
        System.out.println("Ligue a caixa de som");
    }
    }

    @Override
    public void diminuirSom() {
        if(getLigada() == true && getTocando() == true){
            setVolume(this.getVolume() - 3);
        } else{
            System.out.println("Ligue a caixa de som");
        }
    }

    @Override
    public void ativarMudo() {
    if(getLigada() == true && getVolume() > 0){
        this.setTocando(false);
        this.setVolume(0);
    }
    }

    @Override
    public void desativarMudo() {
        if(getLigada() == true && getVolume() == 0){
            this.setTocando(true);
            this.setVolume(30);
        }
    }
    @Override
    public void play() {
        if(getLigada() == true && !getTocando()){
            this.setTocando(true);
        } else {
            System.out.println("Ligue a caixa de som");
        }
    }
    @Override
    public void pausar() {
        if(getLigada() == true && getTocando() == true){
            this.setTocando(false);
        } else{
            System.out.println("Ligue a caixa de som");
        }
    }
}
