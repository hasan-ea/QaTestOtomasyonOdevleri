package ders.on.ENUM.odevi;

public class PlanetInformation {
    public static void main(String[] args) {

        for(Gezegen i: Gezegen.values()) {
            System.out.println(i);
            System.out.println(" Güneş sisteminin " + i.getPlanetNo() + ". sırada olan " + i.name() + " gezegenin;" );
            System.out.println("güneşe olan uzaklığı " + i.getPlanetDistance() + " milyon km'dir,");
            System.out.println("yarı Çapı " + i.getPlanetRr() + " km'dir,");
            System.out.println("bir günü " + i.getPlanetDayDuration() + " saattir.");
            System.out.println(" ");
        }
    }
}