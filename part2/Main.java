package practise.task1.part2;

public class Main {
    public static void main(String[] args) {
        Park park1 = Park.getInstance("Dreamland");
        Attraction attraction1 = new Attraction("Roller Coaster", 2010, "Intamin");
        Attraction attraction2 = new Attraction("Ferris Wheel", 2015, "Giant Rides");
        Attraction attraction3 = new Attraction("Haunted House", 2000, "Spooky Inc.");
        park1.addAttraction(attraction1);
        park1.addAttraction(attraction2);
        park1.addAttraction(attraction3);
        park1.set_description("Welcome to " + park1.get_name() + " - the best amusement park!");
        System.out.println(park1.get_description());
        System.out.println(park1.getAttraction("Roller Coaster"));
        System.out.println(park1.describeAttraction(attraction2));
        System.out.println("Park attractions:");
        System.out.println(park1.getAttractions().toString());
        park1.removeAttraction(attraction3);
        System.out.println("After removal:");
        System.out.println(park1.getAttractions().toString());
        System.out.println("Total attractions count:");
        System.out.println(park1.getAttractionCount());
    }
}
