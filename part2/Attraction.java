package practise.task2.part2;

import java.util.ArrayList;

public class Attraction {
    private String name;
    private int capacity;
    private int duration;
    private String description;
    private ArrayList<String> features;
    private boolean hasHeightRequirement;
    private boolean isFamilyFriendly;
    private AttractionType type;

    public Attraction(String name, int capacity, int duration, String description, ArrayList<String> features, boolean hasHeightRequirement, boolean isFamilyFriendly, AttractionType type) {
        this.name = name;
        this.capacity = capacity;
        this.duration = duration;
        this.description = description;
        this.features = features;
        this.hasHeightRequirement = hasHeightRequirement;
        this.isFamilyFriendly = isFamilyFriendly;
        this.type = type;
    }

    public Attraction() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }

    public boolean hasHeightRequirement() {
        return hasHeightRequirement;
    }

    public void setHeightRequirement(boolean hasHeightRequirement) {
        this.hasHeightRequirement = hasHeightRequirement;
    }

    public boolean isFamilyFriendly() {
        return isFamilyFriendly;
    }

    public void setFamilyFriendly(boolean isFamilyFriendly) {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    public AttractionType getType() {
        return type;
    }

    public void setType(AttractionType type) {
        this.type = type;
    }
}
