public final class States {
    
    public final static State Alabama        = new State ("AL", "Alabama");
    public final static State Alaska         = new State ("AK", "Alaska");
    public final static State Arizona        = new State ("AZ", "Arizona");
    public final static State Arkansas       = new State ("AR", "Arkansas");
    public final static State California     = new State ("CA", "California");
    public final static State Colorado       = new State ("CO", "Colorado");
    public final static State Connecticut    = new State ("CT", "Connecticut");
    public final static State Delaware       = new State ("DE", "Delaware");
    public final static State DistOfColumbia = new State ("DC", "District of Columbia");
    public final static State Florida        = new State ("FL", "Florida");
    public final static State Georgia        = new State ("GA", "Georgia");
    public final static State Hawaii         = new State ("HI", "Hawaii");
    public final static State Idaho          = new State ("ID", "Idaho");
    public final static State Illinois       = new State ("IL", "Illinois");
    public final static State Indiana        = new State ("IN", "Indiana");
    public final static State Iowa           = new State ("IA", "Iowa");
    public final static State Kansas         = new State ("KS", "Kansas");
    public final static State Kentucky       = new State ("KY", "Kentucky");
    public final static State Louisiana      = new State ("LA", "Louisiana");
    public final static State Maine          = new State ("ME", "Maine");
    public final static State Maryland       = new State ("MD", "Maryland");
    public final static State Massachusettes = new State ("MA", "Massachusettes");
    public final static State Michigan       = new State ("MI", "Michigan");
    public final static State Minnesota      = new State ("MN", "Minnesota");
    public final static State Mississippi    = new State ("MS", "Mississippi");
    public final static State Missouri       = new State ("MO", "Missouri");
    public final static State Montana        = new State ("MT", "Montana");
    public final static State Nebraska       = new State ("NE", "Nebraska");
    public final static State Nevada         = new State ("NV", "Nevada");
    public final static State NewHampshire   = new State ("NH", "New Hampshire");
    public final static State NewJersey      = new State ("NJ", "New Jersey");
    public final static State NewMexico      = new State ("NM", "New Mexico");
    public final static State NewYork        = new State ("NY", "New York");
    public final static State NorthCarolina  = new State ("NC", "North Carolina");
    public final static State NorthDakota    = new State ("ND", "North Dakota");
    public final static State Ohio           = new State ("OH", "Ohio");
    public final static State Oklahoma       = new State ("OK", "Oklahoma");
    public final static State Oregon         = new State ("OR", "Oregon");
    public final static State Pennsylvania   = new State ("PA", "Pennsylvania");
    public final static State RhodeIsland    = new State ("RI", "Rhode Island");
    public final static State SouthCarolina  = new State ("SC", "South Carolina");
    public final static State SouthDakota    = new State ("SD", "South Dakota");
    public final static State Tennessee      = new State ("TN", "Tennessee");
    public final static State Texas          = new State ("TX", "Texas");
    public final static State Utah           = new State ("UT", "Utah");
    public final static State Vermont        = new State ("VT", "Vermont");
    public final static State Virginia       = new State ("VA", "Virginia");
    public final static State Washington     = new State ("WA", "Washington");
    public final static State WestVirginia   = new State ("WV", "West Virginia");
    public final static State Wisconsin      = new State ("WI", "Wisconsin");
    public final static State Wyoming        = new State ("WY", "Wyoming");

    // List of all the states.

    public final static State[] states = {
        Alabama,        Alaska,      Arizona,       Arkansas,     California,
        Colorado,       Connecticut, Delaware,      Florida,      Georgia,
        Hawaii,         Idaho,       Illinois,      Indiana,      Iowa,
        Kansas,         Kentucky,    Louisiana,     Maine,        Maryland,
        Massachusettes, Michigan,    Minnesota,     Mississippi,  Missouri,
        Montana,        Nebraska,    Nevada,        NewHampshire, NewJersey,
        NewMexico,      NewYork,     NorthCarolina, NorthDakota,  Ohio,
        Oklahoma,       Oregon,      Pennsylvania,  RhodeIsland,  SouthCarolina,
        SouthDakota,    Tennessee,   Texas,         Utah,         Vermont,
        Virginia,       Washington,  WestVirginia,  Wisconsin,    Wyoming,
        DistOfColumbia
    };

    // List of the 48 continental states.

    public final static State[] continentalStates = {
        Alabama,                     Arizona,       Arkansas,     California,
        Colorado,       Connecticut, Delaware,      Florida,      Georgia,
                        Idaho,       Illinois,      Indiana,      Iowa,
        Kansas,         Kentucky,    Louisiana,     Maine,        Maryland,
        Massachusettes, Michigan,    Minnesota,     Mississippi,  Missouri,
        Montana,        Nebraska,    Nevada,        NewHampshire, NewJersey,
        NewMexico,      NewYork,     NorthCarolina, NorthDakota,  Ohio,
        Oklahoma,       Oregon,      Pennsylvania,  RhodeIsland,  SouthCarolina,
        SouthDakota,    Tennessee,   Texas,         Utah,         Vermont,
        Virginia,       Washington,  WestVirginia,  Wisconsin,    Wyoming
    };

    // Abbreviations for the states.

    public final static State AL = Alabama;
    public final static State AK = Alaska;
    public final static State AZ = Arizona;
    public final static State AR = Arkansas;
    public final static State CA = California;
    public final static State CO = Colorado;
    public final static State CT = Connecticut;
    public final static State DE = Delaware;
    public final static State DC = DistOfColumbia;
    public final static State FL = Florida;
    public final static State GA = Georgia;
    public final static State HI = Hawaii;
    public final static State ID = Idaho;
    public final static State IL = Illinois;
    public final static State IN = Indiana;
    public final static State IA = Iowa;
    public final static State KS = Kansas;
    public final static State KY = Kentucky;
    public final static State LA = Louisiana;
    public final static State ME = Maine;
    public final static State MD = Maryland;
    public final static State MA = Massachusettes;
    public final static State MI = Michigan;
    public final static State MN = Minnesota;
    public final static State MS = Mississippi;
    public final static State MO = Missouri;
    public final static State MT = Montana;
    public final static State NE = Nebraska;
    public final static State NV = Nevada;
    public final static State NH = NewHampshire;
    public final static State NJ = NewJersey;
    public final static State NM = NewMexico;
    public final static State NY = NewYork;
    public final static State NC = NorthCarolina;
    public final static State ND = NorthDakota;
    public final static State OH = Ohio;
    public final static State OK = Oklahoma;
    public final static State OR = Oregon;
    public final static State PA = Pennsylvania;
    public final static State RI = RhodeIsland;
    public final static State SC = SouthCarolina;
    public final static State SD = SouthDakota;
    public final static State TN = Tennessee;
    public final static State TX = Texas;
    public final static State UT = Utah;
    public final static State VT = Vermont;
    public final static State VA = Virginia;
    public final static State WA = Washington;
    public final static State WV = WestVirginia;
    public final static State WI = Wisconsin;
    public final static State WY = Wyoming;

    // Set the state capitals.

    static {
        capital(AL, "Montgomery",      32.3617, -86.2792);
        capital(AK, "Juneau",          58.3014, -134.422);
        capital(AZ, "Phoenix",         33.4500, -112.067);
        capital(AR, "Little Rock",     34.7361, -92.3311);
        capital(CA, "Sacramento",      38.5556, -121.469);
        capital(CO, "Denver",          39.7618, -104.881);
        capital(CT, "Hartford",        41.7627, -72.6743);
        capital(DE, "Dover",           39.1619, -75.5267);
        capital(DC, "Washington",      38.9072, -77.0369);
        capital(FL, "Tallahassee",     30.4550, -84.2533);
        capital(GA, "Atlanta",         33.7550, -84.3900);
        capital(HI, "Honolulu",        21.3000, -157.817);
        capital(ID, "Boise",           43.6167, -116.200);
        capital(IL, "Springfield",     39.6983, -89.6197);
        capital(IN, "Indianapolis",    39.7910, -86.1480);
        capital(IA, "Des Moines",      41.5908, -93.6208);
        capital(KS, "Topeka",          39.0558, -95.6894);
        capital(KY, "Frankfort",       38.1970, -84.8630);
        capital(LA, "Baton Rouge",     30.4500, -91.1400);
        capital(ME, "Augusta",         44.3070, -69.7820);
        capital(MD, "Annapolis",       38.9729, -76.5012);
        capital(MA, "Boston",          42.3581, -71.0636);
        capital(MI, "Lansing",         42.7336, -84.5467);
        capital(MN, "Saint Paul",      44.9442, -93.0936);
        capital(MS, "Jackson",         32.2989, -90.1847);
        capital(MO, "Jefferson City",  38.5767, -92.1736);
        capital(MT, "Helena",          46.5958, -112.027);
        capital(NE, "Lincoln",         40.8106, -96.6803);
        capital(NV, "Carson City",     39.1608, -119.754);
        capital(NH, "Concord",         43.2067, -71.5381);
        capital(NJ, "Trenton",         40.2237, -74.7640);
        capital(NM, "Santa Fe",        35.6672, -105.964);
        capital(NY, "Albany",          42.6525, -73.7572);
        capital(NC, "Raleigh",         35.7667, -78.6333);
        capital(ND, "Bismarck",        46.8133, -100.779);
        capital(OH, "Columbus",        39.9833, -82.9833);
        capital(OK, "Oklahoma City",   35.4822, -97.5350);
        capital(OR, "Salem",           44.9308, -123.029);
        capital(PA, "Harrisburg",      40.2697, -76.8756);
        capital(RI, "Providence",      41.8236, -71.4222);
        capital(SC, "Columbia",        34.0006, -81.0347);
        capital(SD, "Pierre",          44.3680, -100.336);
        capital(TN, "Nashville",       36.1667, -86.7833);
        capital(TX, "Austin",          30.2500, -97.7500);
        capital(UT, "Salt Lake City",  40.7500, -111.883);
        capital(VT, "Montpelier",      44.2597, -72.5750);
        capital(VA, "Richmond",        37.5333, -77.4667);
        capital(WA, "Olympia",         47.0425, -122.893);
        capital(WV, "Charleston",      38.3472, -81.6333);
        capital(WI, "Madison",         43.0667, -89.4000);
        capital(WY, "Cheyenne",        41.1456, -104.802);
    }

    public static State find(String name) {
        for (State state : states) {
            if (state.name().equals(name) || state.code().equals(name)) return state;
        }
        return null;
    }

    private static void capital(State state, String name, double longitude, double latitude) {
        state.capital(new City(name, state, longitude, latitude));
    }

}
