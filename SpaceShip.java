public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber){
        if (serialNumber.startsWith("SN")) {
            this.serialNumber = serialNumber;
        } else {
            return;
        }
    }
    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public void printInfo(){
        System.out.println("Name is "+ this.name +", serial number is " +this.serialNumber);
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}