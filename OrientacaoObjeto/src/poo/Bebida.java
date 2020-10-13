package poo;

public class Bebida implements ControladorBebida {
    //Atributos
    private String marca;
    private int quantidade;
    private boolean aberta;
    private double preco;
    private int meuDinheiro;
    private boolean comprada;

    public Bebida(String marca, int quantidade, double preco, int meuDinheiro) {
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
        this.meuDinheiro = meuDinheiro;
    }
    public void status(){
        System.out.println("=============================");
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade " + quantidade + "ml");
        System.out.println("Preço: R$" + preco);
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }
    public boolean getAberta(){
        return this.aberta;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setMeuDinheiro(int meuDinheiro){
        this.meuDinheiro = meuDinheiro;
    }
    public int getMeuDinheiro(){
        return this.meuDinheiro;
    }
    public void setComprada(boolean comprada){
        this.comprada = comprada;
    }
    public boolean getComprada(){
        return this.comprada;
    }

    @Override
    public void comprar() {
        if(getMeuDinheiro() >= getPreco()){
            setComprada(true);
            System.out.println("Bebida comprada");
        } else {
            System.out.println("Dinheiro insuficiente para realizar a compra");
        }
    }

    @Override
    public void abrir() {
        if(getAberta() == false && getComprada() == true){
            this.setAberta(true);
            System.out.println("A bebida encontra-se aberta");
        } else if(getAberta() == true && getComprada() == true){
            System.out.println("Bebida já se encontra aberta");
        } else{
            System.out.println("Dinheiro insuficiente para comprar a bebida");
        }

    }

    @Override
    public void fechar() {
        if(getAberta() == true && getComprada() == true){
            System.out.println("Fechando bebida...");
        } else if(getAberta() == false && getComprada() == true){
            System.out.println("Bebida ainda não foi aberta");
        } else{
            System.out.println("Dinheiro insuficiente para comprar a bebida");
        }

    }

    @Override
    public void beber() {
        if(getAberta() == true && getComprada() == true){
            if(getQuantidade() >0){
                setQuantidade(this.getQuantidade() - 50);
                System.out.println(quantidade);
            } else{
                System.out.println("Bebida vazia, abra outra");
            }
        } else if(getAberta() == false && getComprada() == true){
            System.out.println("A bebida encontra-se fechada");
        } else{
            System.out.println("Dinheiro insuficiente para comprar a bebida");
        }
    }

    @Override
    public void jogarFora() {
        if(getAberta() == true && getQuantidade() == 0){
            System.out.println("Bebida vazia, jogando fora...");
        } else if(getAberta() == true && getQuantidade() >0){
            System.out.println("Finalize a bebida antes de jogar fora");
        }
        else {
            System.out.println("Dinheiro insuficiente para comprar a bebida");
        }
    }
}
