import java.util.ArrayList;

public class Device {
   private String id;
   private String name;
   private String serialNum;
   private double price;

   //Array i krejt Devices
    static ArrayList<Device> list0fDevices = new ArrayList<>();

    public Device(String id, String name, String serialNum, double price) {
        this.id = id;
        this.name = name;
        this.serialNum = serialNum;
        this.price = price;
        list0fDevices.add(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public double getPrice() {
        return price;
    }

    public static ArrayList<Device> getList0fDevices() {
        return list0fDevices;
    }

    @Override
    public String toString() {
        return "Pajisjet={" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", serialNum='" + serialNum + '\'' +
                ", price=" + price +
                '}'+ "\n" ;
    }

    public void getAllDev(){
        for (Device b: list0fDevices) {
            System.out.println(b);
        }
    }

    public static void getSpecificDevice(Device device){
            if (list0fDevices.contains(device)){
                System.out.println(device);
            }

    }
    public static boolean verifyDev(String serialNum){
        for (Device a: list0fDevices) {
            if (a.serialNum.equals(serialNum)){
                return true;
            }
        }
        return false;

    }
}
