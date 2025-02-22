package practise.task1.part2;

import java.util.ArrayList;
import java.util.HashMap;

public class Park {
    private ArrayList<Attraction> _attractions = new ArrayList<>();
    private String _name;
    private String _description;
    private static HashMap<String, Park> _instances = new HashMap<>();

    private Park(String name) {
        this._name = name;
    }

    public static Park getInstance(String name) {
        if (!_instances.containsKey(name)) {
            Park park = new Park(name);
            _instances.put(name, park);
            return park;
        } else {
            return _instances.get(name);
        }
    }

    public boolean addAttraction(Attraction attraction) {
        return _attractions.add(attraction);
    }

    public boolean removeAttraction(Attraction attraction) {
        return _attractions.remove(attraction);
    }

    public String describeAttraction(Attraction attraction) {
        System.out.println("New attraction added:");
        return attraction.toString();
    }

    public Attraction getAttraction(String name) {
        for (Attraction attraction : _attractions) {
            if (attraction.get_name().equals(name)) {
                return attraction;
            }
        }
        return null;
    }

    public ArrayList<Attraction> getAttractions() {
        return _attractions;
    }

    public long getAttractionCount() {
        return _attractions.size();
    }

    public String get_name() {
        return _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }
}
