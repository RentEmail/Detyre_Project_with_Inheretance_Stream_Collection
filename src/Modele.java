import java.util.ArrayList;

public class Modele extends Brand{

    private Color color;
    private Model model;

   static ArrayList<Modele> modeles = new ArrayList<>();
    public Modele(String id, String name, String serialNum, double price, String bussinesNum, Integer employeesNum, String location, Color color, Model model) {
        super(id, name, serialNum, price, bussinesNum, employeesNum, location);
        this.color = color;
        this.model = model;
       modeles.add(this);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public static void getAllSameDev(String emri){
        for (Device dsfsd:list0fDevices) {
            if (dsfsd.getName().equals(emri)){
                System.out.println(dsfsd);
            }
        }
    }
}
