package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for(int i=1; i<=10; i++){
            System.out.println(i + " x " + numberTableToPrint + " = " + i*numberTableToPrint);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        m.printTable(3);
    }
}