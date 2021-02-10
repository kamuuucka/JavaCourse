public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pages = printer.printingPages(4);
        System.out.println("Pages printed was " + pages + " new total print count for printer = " + printer.getPagesPrinted());
        pages = printer.printingPages(10);
        System.out.println("Pages printed was " + pages + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
