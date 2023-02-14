public class Brand extends Device{

    private String bussinesNum;
    private static double capital =0 ;
    private Integer employeesNum;
    private  String location;


    public Brand(String id, String name, String serialNum, double price, String bussinesNum,  Integer employeesNum, String location) {
        super(id, name, serialNum, price);
        this.bussinesNum = bussinesNum;

        this.employeesNum = employeesNum;
        this.location = location;
    }

    public String getBussinesNum() {
        return bussinesNum;
    }

    public void setBussinesNum(String bussinesNum) {
        this.bussinesNum = bussinesNum;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Integer getEmployeesNum() {
        return employeesNum;
    }

    public void setEmployeesNum(Integer employeesNum) {
        this.employeesNum = employeesNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void stockValue(){
        for (Device a: list0fDevices) {
          capital += a.getPrice();
        }
        System.out.println("Capitali i krejt stokut tuaj eshte: "+capital);
    }

    public void overRideList0fDev(int index,Device device){
        list0fDevices.add(index,device);
    }

}
