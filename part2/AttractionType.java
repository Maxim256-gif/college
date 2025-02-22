package practise.task2.part2;

public class AttractionType {
    private boolean isThrill;
    private boolean isWaterBased;
    private boolean isEducational;
    private boolean isOutdoor;
    private boolean isIndoor;

    public AttractionType(boolean isThrill, boolean isWaterBased, boolean isEducational, boolean isOutdoor, boolean isIndoor) {
        this.isThrill = isThrill;
        this.isWaterBased = isWaterBased;
        this.isEducational = isEducational;
        this.isOutdoor = isOutdoor;
        this.isIndoor = isIndoor;
    }

    public boolean isThrill() {
        return isThrill;
    }

    public void setThrill(boolean thrill) {
        isThrill = thrill;
    }

    public boolean isWaterBased() {
        return isWaterBased;
    }

    public void setWaterBased(boolean waterBased) {
        isWaterBased = waterBased;
    }

    public boolean isEducational() {
        return isEducational;
    }

    public void setEducational(boolean educational) {
        isEducational = educational;
    }

    public boolean isOutdoor() {
        return isOutdoor;
    }

    public void setOutdoor(boolean outdoor) {
        isOutdoor = outdoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }
}
