import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    Modele pajisja1 = new Modele("XK#$*ˆ@&*34232","MACBOOK","M1d34241",1400,"sjakdhfaksj2",5,"Prishtien",Color.BLACK,Model.PRO);
    Modele pajisja2 = new Modele("XK#$*ˆ@&*34232","MACBOOK","M1d34241",15600,"sjakdhfaksj2",5,"Prishtien",Color.BLACK,Model.PRO);
    Modele pajisja3 = new Modele("XK#$*ˆ@&*34232","MACBOOK","M1d34241",12200,"sjakdhfaksj2",5,"Prishtien",Color.BLACK,Model.PRO);
    Modele pajisja4 = new Modele("XK#$*ˆ@&*34232","MACBOOK","M1d34241",200,"sjakdhfaksj2",5,"Prishtien",Color.BLACK,Model.PRO);
    Modele pajisja5 = new Modele("XK#$*ˆ@&*34232","MACBOOK","M1d34241",4200,"sjakdhfaksj2",5,"Prishtien",Color.BLACK,Model.PRO);
    Modele pajisja6 = new Modele("XK#$*ˆ@&*34232","MACBOOK","M1d34241",200,"sjakdhfaksj2",5,"Prishtien",Color.BLACK,Model.PRO);
    Modele pajisja7 = new Modele("XK#$*ˆ@&*34232","MACBOOK","M1d34241",1200,"sjakdhfaksj2",5,"Prishtien",Color.BLACK,Model.PRO);
        System.out.println(Modele.modeles);

        //Sorted by amount min to max
        String fliterByPrice = Modele.modeles.stream().sorted((n, n2) -> (int) (n.getPrice() - n2.getPrice())).toList().toString();
        System.out.println(fliterByPrice);

        //Filter by amount
        String fliterUnderPrice = Modele.modeles.stream().filter(n->n.getPrice()<500).toList().toString();
        System.out.println(fliterUnderPrice);


        String addTax = Modele.modeles.stream().map(n -> n.getPrice()+(n.getPrice()/18*100)).toList().toString();
        System.out.println(addTax);

        System.out.println(Modele.modeles);


        System.out.println(Modele.verifyDev("M1d34241"));
        Modele.getSpecificDevice(pajisja3);
        Modele.stockValue();
        Modele.getAllSameDev("MACBOOK");




    }
}