abstract class Printer{
    public String model;
    public int printedCount;
    public int availableCount;
    public abstract boolean print();
}

class InkjetPrinter extends Printer{
    public InkjetPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }

    @Override
    public boolean print(){
        if(availableCount >= 1){
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
        else {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", model, printedCount + 1);
            return false;
        }
    }
}
class LaserPrinter extends Printer{
    public LaserPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }

    @Override
    public boolean print(){
        if(availableCount >= 1){
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
        else {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", model, printedCount + 1);
            return false;
        }
    }
}



public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print()) ;
        while (laser.print()) ;
    }
}
