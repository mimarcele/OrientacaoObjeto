package oo;

public class CaixaDeSomTeste {
    public static void main(String[] args) {
       CaixaDeSom c1 = new CaixaDeSom("JBL", "Azul", 30);
       c1.ligar();
       c1.setTocando(true);
//       c1.aumentarSom();
       c1.diminuirSom();
       c1.ativarMudo();
       c1.status();

    }
}
