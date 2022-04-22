public class House {

    public static enum Furnished {
        UNKNOWN,
        FURNISHED,
        UNFURNISHED,
        SEMI_FURNISHED
    }

    public static enum Attribute {
        AREA,
        BEDROOMS,
        BATHROOMS,
        STORIES,
        PARKING,
        ON_MAIN_ROAD,
        GUEST_ROOM,
        BASEMENT,
        HOT_WATER_HEAT,
        AIR_CONDITIONING,
        PREFERRED_AREA,
        FURNISHED
    }

    private int id;
    private int price;
    private int area;
    private int bedrooms;
    private int bathrooms;
    private int stories;
    private int parking;
    private boolean onMainRoad;
    private boolean guestRoom;
    private boolean basement;
    private boolean hotWaterHeat;
    private boolean airConditioning;
    private boolean preferredArea;
    private Furnished furnished;

    private static int count = 0;

    public House(
        int price,
        int area,
        int bedrooms,
        int bathrooms,
        int stories,
        int parking,
        boolean onMainRoad,
        boolean guestRoom,
        boolean basement,
        boolean hotWaterHeat,
        boolean airConditioning,
        boolean preferredArea,
        Furnished furnished
    ) {
        this.id              = House.count++;
        this.price           = price;
        this.area            = area;
        this.bedrooms        = bedrooms;
        this.bathrooms       = bathrooms;
        this.stories         = stories;
        this.parking         = parking;
        this.onMainRoad      = onMainRoad;
        this.guestRoom       = guestRoom;
        this.basement        = basement;
        this.hotWaterHeat    = hotWaterHeat;
        this.airConditioning = airConditioning;
        this.preferredArea   = preferredArea;
        this.furnished       = furnished;
    }

    public int id()                  { return this.id; }
    public int price()               { return this.price; }
    public int area()                { return this.area; }
    public int bedrooms()            { return this.bedrooms; }
    public int bathrooms()           { return this.bathrooms; }
    public int stories()             { return this.stories; }
    public int parking()             { return this.parking; }
    public boolean onMainRoad()      { return this.onMainRoad; }
    public boolean guestRoom()       { return this.guestRoom; }
    public boolean basement()        { return this.basement; }
    public boolean hotWaterHeat()    { return this.hotWaterHeat; }
    public boolean airConditioning() { return this.airConditioning; }
    public boolean preferredArea()   { return this.preferredArea; }
    public Furnished furnished()     { return this.furnished; }

    private static int ordinal(boolean value) {
        return value ? 1 : 0;
    }

    public int get(Attribute attribute) {
        switch (attribute) {
            case AREA:             return this.area();
            case BEDROOMS:         return this.bedrooms();
            case BATHROOMS:        return this.bathrooms();
            case STORIES:          return this.stories();
            case PARKING:          return this.parking();
            case ON_MAIN_ROAD:     return ordinal(this.onMainRoad());
            case GUEST_ROOM:       return ordinal(this.guestRoom());
            case BASEMENT:         return ordinal(this.basement());
            case HOT_WATER_HEAT:   return ordinal(this.hotWaterHeat());
            case AIR_CONDITIONING: return ordinal(this.airConditioning());
            case PREFERRED_AREA:   return ordinal(this.preferredArea());
            case FURNISHED:        return this.furnished().ordinal();
            default:
                throw new IllegalArgumentException("Invalid attribute: " + attribute);
        }
    }

    public static int min(House[] dataset, Attribute attribute) {
        int min = Integer.MIN_VALUE;
        for (House house : dataset) {
            int value = house.get(attribute);
            if (value < min) min = value;
        }
        return min;
    }

    public static int max(House[] dataset, Attribute attribute) {
        int max = Integer.MAX_VALUE;
        for (House house : dataset) {
            int value = house.get(attribute);
            if (value > max) max = value;
        }
        return max;
    }

    public static double average(House[] dataset, Attribute attribute) {
        int sum = 0;
        for (House house : dataset) {
            sum += house.get(attribute);
        }
        return ((double) sum) / dataset.length;
    }
}
