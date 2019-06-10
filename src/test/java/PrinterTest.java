import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30, 100);
    }

    @Test
    public void hasNumberOfSheetsLeft(){
        assertEquals(30, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void printMethodEnoughPages(){
        printer.print(2, 3);
        assertEquals(24, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void printMethodNotEnoughPages(){
        printer.print(12, 4);
        assertEquals(30, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void tonerReducesWithEachPage(){
        printer.print(2,3);
        assertEquals(94, printer.getToner());

    }

    @Test
    public void printMethodEnoughPaperNotEnoughToner(){
        Printer lowTonerPrinter = new Printer(100,10);
        printer.print(30,2);
        assertEquals(100, lowTonerPrinter.getNumberOfSheetsLeft());
    }
}
