public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            Movie movie =randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n"
            + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random generated number was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new PitchPerfect();
            case 3:
                return new TheMockingjay();
            case 4:
                return new Avatar();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}

class Movie{
    private String name;
    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Angry fish makes water turn red";
    }
}
class PitchPerfect extends Movie{
    public PitchPerfect() {
        super("Pitch Perfect");
    }
    @Override
    public String plot() {
        return "Directors trying to trick us that Chloe is straight";
    }
}
class TheMockingjay extends Movie{
    public TheMockingjay(){
        super("The Mockingjay");
    }
    @Override
    public String plot() {
        return "Whole trilogy loses sense because of Gayle";
    }
}
class Avatar extends Movie{
    public Avatar(){
        super("Avatar");
    }
    @Override
    public String plot() {
        return "There is no bending, no Toph and no magic. 2/10";
    }
}
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
        //No plot method
    }
}