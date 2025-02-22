package practise.task1.part2;

public class Attraction {
    private String _name;
    private int _yearOpened;
    private String _manufacturer;

    public Attraction(String name, int yearOpened, String manufacturer) {
        this._name = name;
        this._yearOpened = yearOpened;
        this._manufacturer = manufacturer;
    }

    public String get_name() {
        return _name;
    }

    public int get_yearOpened() {
        return _yearOpened;
    }

    public String get_manufacturer() {
        return _manufacturer;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "_name='" + _name + '\'' +
                ", _yearOpened=" + _yearOpened +
                ", _manufacturer='" + _manufacturer + '\'' +
                '}';
    }
}
