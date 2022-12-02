package section2.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentEdward = new Student("Edward", 10000);

        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        bus100.showInfo();
        studentJames.showInfo();

        Subway  subwayGreen = new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        subwayGreen.showInfo();
        studentJames.showInfo();

        Taxi taxi = new Taxi();
        studentEdward.takeTaxi(taxi);
        taxi.showInfo();
        studentEdward.showInfo();
    }
}
