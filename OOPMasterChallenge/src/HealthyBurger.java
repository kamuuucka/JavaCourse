class HealthyBurger extends Hamburger{
    
    private String healthyExtraName1;
    private double healthyExtraPrice1;

    private String healthyExtraName2;
    private double healthyExtraPrice2;
    
    public HealthyBurger(boolean hasMeat, double price) {
        super("Healthy", "Brown rye", false, price);
    }
    
    public void addHealthyAddition1(String name, double price){
        this.healthyExtraName1 = name;
        this.healthyExtraPrice1 = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double priceOfHamburger() {
        double hamburgerPrice = super.priceOfHamburger();
        if(this.healthyExtraName1 != null){
            hamburgerPrice += this.healthyExtraPrice1;
            System.out.println("Added " + this.healthyExtraName1 + " for an extra " + this.healthyExtraPrice1);
        }
        if(this.healthyExtraName2 != null){
            hamburgerPrice += this.healthyExtraPrice2;
            System.out.println("Added " + this.healthyExtraName2 + " for an extra " + this.healthyExtraPrice2);
        }
        return hamburgerPrice;
    }
}
