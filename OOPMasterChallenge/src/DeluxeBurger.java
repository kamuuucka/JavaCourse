class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Parmesan & Oregano", true, 15);
        super.addHamburgerAddition1("Chips", 3.67);
        super.addHamburgerAddition2("Drink",2.89);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add any extras to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add any extras to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add any extras to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add any extras to Deluxe Burger");
    }
}
