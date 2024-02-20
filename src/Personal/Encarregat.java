package Personal;

public class Encarregat extends Empleat {
    public Encarregat() {
        this.nom = "Pep";
        this.carrec = "Encarregat";
        this.sou = sou * 1.1;
    }
    
    @Override
    double getSou() {
        return super.getSou();
    }
    public static void main(String[] args) {
        Encarregat e = new Encarregat();
        System.out.println(e.getSou());
    }
}
