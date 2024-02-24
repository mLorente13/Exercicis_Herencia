package Personal;

public class Empleat {

    protected double sou = 1200;
    protected String nom = "Pep";
    protected String carrec = "Caixer";

    public Empleat() {
        this.sou = sou;
        this.nom = nom;
        this.carrec = carrec;
    }

    public Empleat(double sou) {
        this.sou = sou;
    }

    public Empleat(double sou, String nom, String carrec) {
        this.sou = sou;
        this.nom = nom;
        this.carrec = carrec;
    }

    double getSou() {
        return this.sou;
    }
    public static void main(String[] args) {
        Empleat e = new Empleat(1400);
        System.out.println(e.getSou());
    }
}
