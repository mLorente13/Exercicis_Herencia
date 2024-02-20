package Personal;

public class Empleat {

    protected double sou;
    protected String nom;
    protected String carrec;

    public Empleat() {
        this.sou = 1000;
        this.nom = "Pep";
        this.carrec = "Caixer";
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
        Empleat e = new Empleat(1000);
        System.out.println(e.getSou());
    }
}
