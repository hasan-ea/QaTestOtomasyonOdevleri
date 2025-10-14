package ENUM.odevi;

public enum Gezegen {

    MERKUR(1,58,2439,1406),
    VENUS(2,108,6052,5832),
    DUNYA(3,150,6371,24),
    MARS(4,228,3390,25),
    JUPITER(5,779,69911,10),
    SATURN(6,1430,58232,11),
    NEPTUN(7,2870,25622,17),
    URANUS(8,4500,24622,16);

    private final int planetNo;
    private final int planetDistance;
    private final int planetRr;
    private final int planetDayDuration;

    private Gezegen(int planetNo, int planetDistance, int planetRr, int planetDayDuration) {
        this.planetNo = planetNo;
        this.planetDistance = planetDistance;
        this.planetRr = planetRr;
        this.planetDayDuration = planetDayDuration;
    }

    public int getPlanetNo() {
        return planetNo;
    }
    public int getPlanetDistance() {
        return planetDistance;
    }
    public int getPlanetRr() {
        return planetRr;
    }
    public int getPlanetDayDuration() {
        return planetDayDuration;
    }

}


