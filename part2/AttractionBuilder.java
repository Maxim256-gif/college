package practise.task2.part2;

import java.util.ArrayList;

public abstract class AttractionBuilder {
    protected Attraction attraction;

    public abstract void setBasicParams(String name, int capacity, int duration);
    public abstract void setTypeParams(AttractionType type);
    public abstract void setFeatureParams(ArrayList<String> features, boolean hasHeightRequirement, boolean isFamilyFriendly);
    public abstract void setDescription(String description);
    public abstract Attraction build();
}
