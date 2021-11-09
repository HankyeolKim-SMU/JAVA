class PersonalComputer{
    Computer computer = new Computer();
    Monitor monitor = new Monitor();
    void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
    void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }
}
class Computer{
    private String cpu = "Core i7";
    private String memory = "16GB";
    private String Hdd = "2TB";
    private String color = "White";
    private String power = "500W";

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }

    public String getCpu(){return cpu;}
    public String getMemory(){return memory;}
    public String getHdd(){return Hdd;}
    public String getColor(){return color;}
    public String getPower(){return power;}

    public void printInfo(){
        System.out.println("The spec of the coumputer");
        System.out.println(" CPU: " + getCpu());
        System.out.println(" Memory: " + getMemory());
        System.out.println(" HDD: " + getHdd());
        System.out.println(" Color: " + getColor());
        System.out.println(" Power: " + getPower());
    }
}
class Monitor{
    private String monitorSize = "24 inch";
    private String color = "Black";
    private String power = "45W";

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }

    public String getMonitorSize(){ return monitorSize;}
    public String getColor(){ return color;}
    public String getPower(){ return power;}

    void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println(" Size: " + getMonitorSize());
        System.out.println(" Color: " + getColor());
        System.out.println(" Power: " + getPower());
    }
}


public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}
