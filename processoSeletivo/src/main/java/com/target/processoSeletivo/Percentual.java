import model.Distribuidora;

public class Percentual {

    public static void main(String[] args) {
        Distribuidora distribuidoraSP = new Distribuidora("SP", 67836.43);
        Distribuidora distribuidoraRJ = new Distribuidora("RJ", 36678.66);
        Distribuidora distribuidoraMG = new Distribuidora("MG", 29229.88);
        Distribuidora distribuidoraES = new Distribuidora("ES", 27165.48);
        Distribuidora distribuidoraOutros = new Distribuidora("Outros", 19849.53);

        System.out.println("O percentual da distribuidora de "+ distribuidoraSP.getEstado() + " é " + distribuidoraSP.percentual());
        System.out.println("O percentual da distribuidora de "+ distribuidoraRJ.getEstado() + " é " + distribuidoraRJ.percentual());
        System.out.println("O percentual da distribuidora de "+ distribuidoraMG.getEstado() + " é " + distribuidoraMG.percentual());
        System.out.println("O percentual da distribuidora de "+ distribuidoraES.getEstado() + " é " + distribuidoraES.percentual());
        System.out.println("O percentual da distribuidora de "+ distribuidoraOutros.getEstado() + " é " + distribuidoraOutros.percentual());


    }

}
