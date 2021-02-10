public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > 100 || tonerLevel < 0)
            this.tonerLevel = 100;
        else
            this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public void fillingToner(int toner){
        if (tonerLevel + toner >= 100)
            System.out.println("Your toner level is at a maximum");
        else
        {
            tonerLevel += toner;
            System.out.println("You filled your toner. Now you have " + tonerLevel);
        }
    }

    public int printingPages(int pages){
        int pagesToPrint = pages;
        if (pagesToPrint <= 0)
            System.out.println("You can't print 0 or less pages");
        else {
            if (isDuplex){
                pagesToPrint /= 2;
                System.out.println("Printing in duplex mode. Printing " + pagesToPrint + " pages");
            }
            else
                System.out.println("Printing " + pagesToPrint + " pages");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
