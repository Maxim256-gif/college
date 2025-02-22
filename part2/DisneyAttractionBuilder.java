package practise.task2.part2;

import java.util.ArrayList;

public class DisneyAttractionBuilder extends AttractionBuilder {

    public DisneyAttractionBuilder(Attraction attraction) {
        this.attraction = attraction;
    }

    @Override
    public void setBasicParams(String name, int capacity, int duration) {
        attraction.setName(name);
        attraction.setCapacity(capacity);
        attraction.setDuration(duration);
    }

    @Override
    public void setTypeParams(AttractionType type) {
        attraction.setType(type);
    }

    @Override
    public void setFeatureParams(ArrayList<String> features, boolean hasHeightRequirement, boolean isFamilyFriendly) {
        attraction.setFeatures(features);
        attraction.setHeightRequirement(hasHeightRequirement);
        attraction.setFamilyFriendly(isFamilyFriendly);
    }

    @Override
    public void setDescription(String description) {
        attraction.setDescription(description);
    }

    @Override
    public Attraction build() {
        System.out.println("Disney attraction created! Ready to entertain?");
        return attraction;
    }
}
