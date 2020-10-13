package poo;

public class BebidaTeste {
    public static void main(String[] args) {
        Bebida b1 = new Bebida("Fanta uva", 350, 3.50, 50);
        b1.comprar();
        b1.abrir();
        b1.status();
        b1.beber();
        b1.beber();
        b1.beber();
        b1.beber();
        b1.beber();
        b1.beber();
        b1.fechar();
        b1.beber();
        b1.jogarFora();
//        b1.beber();

//        b1.jogarFora();
//        b1.status();

        System.out.println("=============================================");
        Bebida b2 = new Bebida("Stella", 475, 7.29, 5);
        b2.comprar();
        b2.abrir();
        b2.beber();
        b2.fechar();
        b2.jogarFora();



    }
}
