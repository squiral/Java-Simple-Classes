public class Printer {

    private int numberOfSheetsLeft;
    private int toner;

    public Printer(int numberOfSheetsLeft, int toner){
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.toner = toner;
    }

    public int getNumberOfSheetsLeft(){
        return this.numberOfSheetsLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int numberOfCopies, int numberOfPages){
        int totalPagesUsed = numberOfCopies * numberOfPages;
        if (totalPagesUsed <= this.numberOfSheetsLeft && totalPagesUsed <= this.toner){
            this.numberOfSheetsLeft -= totalPagesUsed;
            this.toner -= totalPagesUsed;
        } else {
            return;
        }
    }

}
