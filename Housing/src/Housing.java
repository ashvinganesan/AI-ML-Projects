public class Housing {

    public static final boolean YES = true;
    public static final boolean NO = false;

    public static final House[] data = {
        new House(
            13300000, // Price
            7420,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            12250000, // Price
            8960,     // Area
            4,        // Bedrooms
            4,        // Bathrooms
            4,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            12250000,  // Price
            9960,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            12215000, // Price
            7500,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            11410000, // Price
            7420,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            10850000, // Price
            7500,     // Area
            3,        // Bedrooms
            3,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            10150000, // Price
            8580,     // Area
            4,        // Bedrooms
            3,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            10150000, // Price
            16200,    // Area
            5,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            9870000,  // Price
            8100,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            9800000,  // Price
            5750,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            9800000,  // Price
            13200,    // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            9681000,  // Price
            6000,     // Area
            4,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            9310000,  // Price
            6550,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            9240000,  // Price
            3500,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            9240000,  // Price
            7800,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            9100000,  // Price
            6000,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            9100000,  // Price
            6600,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            8960000,  // Price
            8500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8890000,  // Price
            4600,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8855000,  // Price
            6420,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            8750000,  // Price
            4320,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            8680000,  // Price
            7155,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            8645000,  // Price
            8050,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8645000,  // Price
            4560,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8575000,  // Price
            8800,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8540000,  // Price
            6540,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8463000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            8400000,  // Price
            8875,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            8400000,  // Price
            7950,     // Area
            5,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            8400000,  // Price
            5500,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            8400000,  // Price
            7475,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            8400000,  // Price
            7000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            8295000,  // Price
            4880,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8190000,  // Price
            5960,     // Area
            3,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            8120000,  // Price
            6840,     // Area
            5,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8080940,  // Price
            7000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            8043000,  // Price
            7482,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7980000,  // Price
            9000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7962500,  // Price
            6000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            7910000,  // Price
            6000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7875000,  // Price
            6550,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7840000,  // Price
            6360,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7700000,  // Price
            6480,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            7700000,  // Price
            6000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7560000,  // Price
            6000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7560000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7525000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7490000,  // Price
            6600,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7455000,  // Price
            4300,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            7420000,  // Price
            7440,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7420000,  // Price
            7440,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            7420000,  // Price
            6325,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            7350000,  // Price
            6000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7350000,  // Price
            5150,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7350000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7350000,  // Price
            6000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            7343000,  // Price
            11440,  // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7245000,  // Price
            9000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7210000,  // Price
            7680,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7210000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7140000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7070000,  // Price
            8880,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            7070000,  // Price
            6240,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7035000,  // Price
            6360,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            7000000,  // Price
            11175,  // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6930000,  // Price
            8880,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6930000,  // Price
            13200,  // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6895000,  // Price
            7700,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6860000,  // Price
            6000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6790000,  // Price
            12090,  // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6790000,  // Price
            4000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6755000,  // Price
            6000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6720000,  // Price
            5020,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6685000,  // Price
            6600,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6650000,  // Price
            4040,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6650000,  // Price
            4260,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6650000,  // Price
            6420,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6650000,  // Price
            6500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6650000,  // Price
            5700,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6650000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6629000,  // Price
            6000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6615000,  // Price
            4000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6615000,  // Price
            10500,  // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6580000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6510000,  // Price
            3760,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6510000,  // Price
            8250,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6510000,  // Price
            6670,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6475000,  // Price
            3960,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6475000,  // Price
            7410,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6440000,  // Price
            8580,     // Area
            5,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6440000,  // Price
            5000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6419000,  // Price
            6750,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6405000,  // Price
            4800,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6300000,  // Price
            7200,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6300000,  // Price
            6000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6300000,  // Price
            4100,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6300000,  // Price
            9000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6300000,  // Price
            6400,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6293000,  // Price
            6600,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6265000,  // Price
            6000,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6230000,  // Price
            6600,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6230000,  // Price
            5500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6195000,  // Price
            5500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6195000,  // Price
            6350,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6195000,  // Price
            5500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6160000,  // Price
            4500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6160000,  // Price
            5450,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6125000,  // Price
            6420,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6107500,  // Price
            3240,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6090000,  // Price
            6615,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6090000,  // Price
            6600,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6090000,  // Price
            8372,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            6083000,  // Price
            4300,     // Area
            6,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6083000,  // Price
            9620,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6020000,  // Price
            6800,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            6020000,  // Price
            8000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            6020000,  // Price
            6900,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5950000,  // Price
            3700,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5950000,  // Price
            6420,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5950000,  // Price
            7020,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5950000,  // Price
            6540,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5950000,  // Price
            7231,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5950000,  // Price
            6254,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5950000,  // Price
            7320,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5950000,  // Price
            6525,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5943000,  // Price
            15600,  // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5880000,  // Price
            7160,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5880000,  // Price
            6500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5873000,  // Price
            5500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5873000,  // Price
            11460,  // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5866000,  // Price
            4800,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5810000,  // Price
            5828,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5810000,  // Price
            5200,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5810000,  // Price
            4800,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5803000,  // Price
            7000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5775000,  // Price
            6000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5740000,  // Price
            5400,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5740000,  // Price
            4640,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5740000,  // Price
            5000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5740000,  // Price
            6360,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5740000,  // Price
            5800,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5652500,  // Price
            6660,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5600000,  // Price
            10500,  // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5600000,  // Price
            4800,     // Area
            5,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5600000,  // Price
            4700,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5600000,  // Price
            5000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5600000,  // Price
            10500,  // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5600000,  // Price
            5500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5600000,  // Price
            6360,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5600000,  // Price
            6600,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5600000,  // Price
            5136,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5565000,  // Price
            4400,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5565000,  // Price
            5400,     // Area
            5,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5530000,  // Price
            3300,     // Area
            3,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5530000,  // Price
            3650,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5530000,  // Price
            6100,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5523000,  // Price
            6900,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5495000,  // Price
            2817,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5495000,  // Price
            7980,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5460000,  // Price
            3150,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5460000,  // Price
            6210,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5460000,  // Price
            6100,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5460000,  // Price
            6600,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5425000,  // Price
            6825,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5390000,  // Price
            6710,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5383000,  // Price
            6450,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5320000,  // Price
            7800,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5285000,  // Price
            4600,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5250000,  // Price
            4260,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5250000,  // Price
            6540,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5250000,  // Price
            5500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5250000,  // Price
            10269,  // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5250000,  // Price
            8400,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5250000,  // Price
            5300,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5250000,  // Price
            3800,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5250000,  // Price
            9800,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5250000,  // Price
            8520,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5243000,  // Price
            6050,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5229000,  // Price
            7085,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5215000,  // Price
            3180,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5215000,  // Price
            4500,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            2,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5215000,  // Price
            7200,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5145000,  // Price
            3410,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5145000,  // Price
            7980,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5110000,  // Price
            3000,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5110000,  // Price
            3000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5110000,  // Price
            11410,  // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5110000,  // Price
            6100,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5075000,  // Price
            5720,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            5040000,  // Price
            3540,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5040000,  // Price
            7600,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5040000,  // Price
            10700,  // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5040000,  // Price
            6600,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            5033000,  // Price
            4800,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            5005000,  // Price
            8150,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4970000,  // Price
            4410,     // Area
            4,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4970000,  // Price
            7686,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4956000,  // Price
            2800,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4935000,  // Price
            5948,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4907000,  // Price
            4200,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4900000,  // Price
            4520,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            4095,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            4120,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            5400,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            4770,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            6300,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            5800,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            3000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            2970,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            6720,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4900000,  // Price
            4646,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4900000,  // Price
            12900,  // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4893000,  // Price
            3420,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4893000,  // Price
            4995,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4865000,  // Price
            4350,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4830000,  // Price
            4160,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4830000,  // Price
            6040,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4830000,  // Price
            6862,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4830000,  // Price
            4815,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4795000,  // Price
            7000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4795000,  // Price
            8100,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4767000,  // Price
            3420,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4760000,  // Price
            9166,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4760000,  // Price
            6321,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4760000,  // Price
            10240,  // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4753000,  // Price
            6440,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4690000,  // Price
            5170,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4690000,  // Price
            6000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4690000,  // Price
            3630,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4690000,  // Price
            9667,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4690000,  // Price
            5400,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4690000,  // Price
            4320,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4655000,  // Price
            3745,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4620000,  // Price
            4160,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4620000,  // Price
            3880,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4620000,  // Price
            5680,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4620000,  // Price
            2870,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4620000,  // Price
            5010,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4613000,  // Price
            4510,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4585000,  // Price
            4000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4585000,  // Price
            3840,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4550000,  // Price
            3760,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4550000,  // Price
            3640,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4550000,  // Price
            2550,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4550000,  // Price
            5320,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4550000,  // Price
            5360,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4550000,  // Price
            3520,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4550000,  // Price
            8400,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            4,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4543000,  // Price
            4100,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4543000,  // Price
            4990,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4515000,  // Price
            3510,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4515000,  // Price
            3450,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4515000,  // Price
            9860,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4515000,  // Price
            3520,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4480000,  // Price
            4510,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4480000,  // Price
            5885,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4480000,  // Price
            4000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4480000,  // Price
            8250,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4480000,  // Price
            4040,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4473000,  // Price
            6360,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4473000,  // Price
            3162,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4473000,  // Price
            3510,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4445000,  // Price
            3750,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4410000,  // Price
            3968,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4410000,  // Price
            4900,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4403000,  // Price
            2880,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4403000,  // Price
            4880,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4403000,  // Price
            4920,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4382000,  // Price
            4950,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4375000,  // Price
            3900,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4340000,  // Price
            4500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            3,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4340000,  // Price
            1905,     // Area
            5,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4340000,  // Price
            4075,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4340000,  // Price
            3500,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4340000,  // Price
            6450,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4319000,  // Price
            4032,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4305000,  // Price
            4400,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4305000,  // Price
            10360,  // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4277000,  // Price
            3400,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4270000,  // Price
            6360,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4270000,  // Price
            6360,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4270000,  // Price
            4500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4270000,  // Price
            2175,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4270000,  // Price
            4360,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4270000,  // Price
            7770,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4235000,  // Price
            6650,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4235000,  // Price
            2787,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4200000,  // Price
            5500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4200000,  // Price
            5040,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4200000,  // Price
            5850,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            2610,     // Area
            4,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            2953,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4200000,  // Price
            2747,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            4410,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4200000,  // Price
            4000,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            2325,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            4600,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            3640,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4200000,  // Price
            5800,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            7000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4200000,  // Price
            4079,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            3520,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4200000,  // Price
            2145,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4200000,  // Price
            4500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4193000,  // Price
            8250,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4193000,  // Price
            3450,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4165000,  // Price
            4840,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4165000,  // Price
            4080,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4165000,  // Price
            4046,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4130000,  // Price
            4632,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4130000,  // Price
            5985,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4123000,  // Price
            6060,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4098500,  // Price
            3600,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4095000,  // Price
            3680,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4095000,  // Price
            4040,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4095000,  // Price
            5600,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4060000,  // Price
            5900,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4060000,  // Price
            4992,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            4060000,  // Price
            4340,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4060000,  // Price
            3000,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4060000,  // Price
            4320,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4025000,  // Price
            3630,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4025000,  // Price
            3460,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            4025000,  // Price
            5400,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4007500,  // Price
            4500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            4007500,  // Price
            3460,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3990000,  // Price
            4100,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3990000,  // Price
            6480,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3990000,  // Price
            4500,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3990000,  // Price
            3960,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3990000,  // Price
            4050,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3920000,  // Price
            7260,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            3,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3920000,  // Price
            5500,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3920000,  // Price
            3000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3920000,  // Price
            3290,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3920000,  // Price
            3816,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3920000,  // Price
            8080,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3920000,  // Price
            2145,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3885000,  // Price
            3780,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3885000,  // Price
            3180,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3850000,  // Price
            5300,     // Area
            5,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3850000,  // Price
            3180,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3850000,  // Price
            7152,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3850000,  // Price
            4080,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3850000,  // Price
            3850,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3850000,  // Price
            2015,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3850000,  // Price
            2176,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3836000,  // Price
            3350,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3815000,  // Price
            3150,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3780000,  // Price
            4820,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3780000,  // Price
            3420,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3780000,  // Price
            3600,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3780000,  // Price
            5830,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3780000,  // Price
            2856,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3780000,  // Price
            8400,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3773000,  // Price
            8250,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3773000,  // Price
            2520,     // Area
            5,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3773000,  // Price
            6930,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3745000,  // Price
            3480,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3710000,  // Price
            3600,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3710000,  // Price
            4040,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3710000,  // Price
            6020,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3710000,  // Price
            4050,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3710000,  // Price
            3584,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3703000,  // Price
            3120,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3703000,  // Price
            5450,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3675000,  // Price
            3630,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3675000,  // Price
            3630,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3675000,  // Price
            5640,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3675000,  // Price
            3600,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3640000,  // Price
            4280,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3640000,  // Price
            3570,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3640000,  // Price
            3180,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3640000,  // Price
            3000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3640000,  // Price
            3520,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3640000,  // Price
            5960,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3640000,  // Price
            4130,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3640000,  // Price
            2850,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3640000,  // Price
            2275,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3633000,  // Price
            3520,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3605000,  // Price
            4500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3605000,  // Price
            4000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3570000,  // Price
            3150,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3570000,  // Price
            4500,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3570000,  // Price
            4500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3570000,  // Price
            3640,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3535000,  // Price
            3850,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            4240,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3500000,  // Price
            3650,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            4600,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3500000,  // Price
            2135,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            3036,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3500000,  // Price
            3990,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3500000,  // Price
            7424,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            3480,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            3600,     // Area
            6,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            3640,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3500000,  // Price
            5900,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3500000,  // Price
            3120,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            7350,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3500000,  // Price
            3512,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            9500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            5880,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3500000,  // Price
            12944,  // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3493000,  // Price
            4900,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3465000,  // Price
            3060,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3465000,  // Price
            5320,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3465000,  // Price
            2145,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3430000,  // Price
            4000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3430000,  // Price
            3185,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3430000,  // Price
            3850,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3430000,  // Price
            2145,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3430000,  // Price
            2610,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3430000,  // Price
            1950,     // Area
            3,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3423000,  // Price
            4040,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3395000,  // Price
            4785,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3395000,  // Price
            3450,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3395000,  // Price
            3640,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3360000,  // Price
            3500,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3360000,  // Price
            4960,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3360000,  // Price
            4120,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3360000,  // Price
            4750,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3360000,  // Price
            3720,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3360000,  // Price
            3750,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3360000,  // Price
            3100,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3360000,  // Price
            3185,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3353000,  // Price
            2700,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3332000,  // Price
            2145,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3325000,  // Price
            4040,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3325000,  // Price
            4775,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3290000,  // Price
            2500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3290000,  // Price
            3180,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3290000,  // Price
            6060,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3290000,  // Price
            3480,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3290000,  // Price
            3792,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3290000,  // Price
            4040,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3290000,  // Price
            2145,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3290000,  // Price
            5880,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3255000,  // Price
            4500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3255000,  // Price
            3930,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3234000,  // Price
            3640,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3220000,  // Price
            4370,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3220000,  // Price
            2684,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3220000,  // Price
            4320,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3220000,  // Price
            3120,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3150000,  // Price
            3450,     // Area
            1,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3150000,  // Price
            3986,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            1,        // Stories
            1,        // Parking
            NO,       // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3150000,  // Price
            3500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3150000,  // Price
            4095,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3150000,  // Price
            1650,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3150000,  // Price
            3450,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3150000,  // Price
            6750,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3150000,  // Price
            9000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3150000,  // Price
            3069,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3143000,  // Price
            4500,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3129000,  // Price
            5495,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3118850,  // Price
            2398,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            YES,      // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3115000,  // Price
            3000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3115000,  // Price
            3850,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3115000,  // Price
            3500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3087000,  // Price
            8100,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3080000,  // Price
            4960,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3080000,  // Price
            2160,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3080000,  // Price
            3090,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3080000,  // Price
            4500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3045000,  // Price
            3800,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3010000,  // Price
            3090,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3010000,  // Price
            3240,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3010000,  // Price
            2835,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3010000,  // Price
            4600,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            3010000,  // Price
            5076,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3010000,  // Price
            3750,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            3010000,  // Price
            3630,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            3,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            3003000,  // Price
            8050,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2975000,  // Price
            4352,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2961000,  // Price
            3000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2940000,  // Price
            5850,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2940000,  // Price
            4960,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2940000,  // Price
            3600,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2940000,  // Price
            3660,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2940000,  // Price
            3480,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2940000,  // Price
            2700,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            2940000,  // Price
            3150,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2940000,  // Price
            6615,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2870000,  // Price
            3040,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2870000,  // Price
            3630,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2870000,  // Price
            6000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2870000,  // Price
            5400,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2852500,  // Price
            5200,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            3,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2835000,  // Price
            3300,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2835000,  // Price
            4350,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2835000,  // Price
            2640,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            2800000,  // Price
            2650,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2800000,  // Price
            3960,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            2730000,  // Price
            6800,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2730000,  // Price
            4000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2695000,  // Price
            4000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2660000,  // Price
            3934,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2660000,  // Price
            2000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2660000,  // Price
            3630,     // Area
            3,        // Bedrooms
            3,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2660000,  // Price
            2800,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2660000,  // Price
            2430,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2660000,  // Price
            3480,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2660000,  // Price
            4000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2653000,  // Price
            3185,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2653000,  // Price
            4000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(2604000,
            2910,     // Price
            2,        // Area
            1,        // Bedrooms
            1,        // Bathrooms
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2590000,  // Price
            3600,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2590000,  // Price
            4400,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2590000,  // Price
            3600,     // Area
            2,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            2520000,  // Price
            2880,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2520000,  // Price
            3180,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2520000,  // Price
            3000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            2485000,  // Price
            4400,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2485000,  // Price
            3000,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2450000,  // Price
            3210,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2450000,  // Price
            3240,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            NO,       // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2450000,  // Price
            3000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2450000,  // Price
            3500,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            YES,      // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2450000,  // Price
            4840,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2450000,  // Price
            7700,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2408000,  // Price
            3635,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2380000,  // Price
            2475,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            2380000,  // Price
            2787,     // Area
            4,        // Bedrooms
            2,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            2380000,  // Price
            3264,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2345000,  // Price
            3640,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2310000,  // Price
            3180,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2275000,  // Price
            1836,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            2275000,  // Price
            3970,     // Area
            1,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2275000,  // Price
            3970,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2240000,  // Price
            1950,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            YES,      // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2233000,  // Price
            5300,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            YES,      // Air conditioning
            YES,      // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2135000,  // Price
            3000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2100000,  // Price
            2400,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2100000,  // Price
            3000,     // Area
            4,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            2100000,  // Price
            3360,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            1960000,  // Price
            3420,     // Area
            5,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED), 

        new House(
            1890000,  // Price
            1700,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            1890000,  // Price
            3649,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            1855000,  // Price
            2990,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            1,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            1820000,  // Price
            3000,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            2,        // Parking
            YES,      // Main road
            NO,       // Guest room
            YES,      // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            1767150,  // Price
            2400,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.SEMI_FURNISHED),

        new House(
            1750000,  // Price
            3620,     // Area
            2,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED),

        new House(
            1750000,  // Price
            2910,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            1,        // Stories
            0,        // Parking
            NO,       // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.FURNISHED),

        new House(
            1750000,  // Price
            3850,     // Area
            3,        // Bedrooms
            1,        // Bathrooms
            2,        // Stories
            0,        // Parking
            YES,      // Main road
            NO,       // Guest room
            NO,       // Basement
            NO,       // Hot water heat
            NO,       // Air conditioning
            NO,       // Preferred area
            House.Furnished.UNFURNISHED)
    };
}
