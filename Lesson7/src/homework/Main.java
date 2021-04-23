package homework;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sdfsdf").append(23).append(2.2);
        System.out.println(stringBuilder.toString());

        Person person = Person.builder().name("sdf").age(23).build();

        Person person1 = createPerson();

        Transport light = Light.builder()
                .power(100)
                .maxSpeed(150)
                .weight(2)
                .brand("Nissan")
                .wheels(4)
                .fuelConsumption(10)
                .bodyType("Sedan")
                .countPassengers(5)
                .build();

        Transport freight = Freight.builder()
                .power(200)
                .maxSpeed(140)
                .weight(4)
                .brand("Камаз")
                .wheels(6)
                .fuelConsumption(20)
                .carryingCapacity(1000)
                .build();

        Transport civil = Civil.builder()
                .power(1000)
                .maxSpeed(500)
                .weight(10)
                .brand("Boing")
                .wingspan(10)
                .minRunwayLength(15)
                .countPassengers(180)
                .businessClass(true)
                .build();

        Transport military = Military.builder()
                .power(1500)
                .maxSpeed(750)
                .weight(7)
                .brand("Cy")
                .wingspan(6)
                .minRunwayLength(5)
                .catapultSystem(true)
                .countRockets(10)
                .build();

        Transport[] transports = {civil, military, light, freight};

//        Person.builder().age(34).build();

        System.out.println(light);
        System.out.println(freight);
        System.out.println(civil);
        System.out.println(military + "\n");

        Information informationService = new InformationService();

        informationService.catapult(light);

        for (int i = 0; i < 10; i++) {
            informationService.shoot(military);
        }

        informationService.catapult(military);
        informationService.lightInfo(light, 2.1);
        informationService.checkWeightCapacity(freight, 1001);
        informationService.checkPassengerCapacity(civil, 75);

        informationService.method(civil, "Доп условия");

//        light.info(2);
//        freight.checkWeightCapacity(1001);
//        civil.checkPassengerCapacity(75);
//        military.shoot();
//        military.catapult();
    }

    private static Person createPerson() {
        Person person2 = new Person();
        person2.setAge(23);
        person2.setName("Nik");
        return person2;
    }
}
