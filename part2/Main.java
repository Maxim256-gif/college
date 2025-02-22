package practise.task2.part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String choosePark;
        Attraction attraction = new Attraction();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter park (DISNEY/WONDERLAND): ");
            choosePark = scanner.next().toLowerCase();
        } while (!choosePark.equals("disney") && !choosePark.equals("wonderland"));

        AttractionBuilder builder;

        if (choosePark.equals("disney")) {
            builder = new DisneyAttractionBuilder(attraction);
        } else {
            builder = new WonderlandAttractionBuilder(attraction);
        }

        builder.setBasicParams("Roller Coaster", 1000, 150);

        ArrayList<String> features = new ArrayList<>();
        features.add("High Speed");
        features.add("Loops");
        features.add("Scenic Views");
        builder.setFeatureParams(features, true, false);

        AttractionType type1 = new AttractionType(true, false, false, true, false);
        builder.setTypeParams(type1);
        builder.setDescription("High-speed roller coaster with breathtaking views.");

        builder.build();
    }
}
