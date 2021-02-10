public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White",true,3.56);
        double price = hamburger.priceOfHamburger();
        hamburger.addHamburgerAddition1("Tomato",1);
        hamburger.addHamburgerAddition2("Cheese",10);
        System.out.println("Total burger price is: " + hamburger.priceOfHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(false,5.67);
        healthyBurger.addHamburgerAddition1("Bacon",3.43);
        healthyBurger.addHealthyAddition1("Lettuce",0.41);
        System.out.println("Total Healthy Burger price is: " + healthyBurger.priceOfHamburger());

        DeluxeBurger db = new DeluxeBurger();
        System.out.println("Deluxe Burger price is: " + db.priceOfHamburger());
    }
}
