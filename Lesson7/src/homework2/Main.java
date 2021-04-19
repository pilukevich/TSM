package homework2;

public class Main {
    public static void main(String[] args) {
        Light light = Light.builder()
                .power(100)
                .maxSpeed(150)
                .weight(2)
                .brand("Nissan")
                .wheels(4)
                .fuelConsumption(10)
                .bodyType("Sedan")
                .countPassengers(5)
                .build();

        Freight freight = Freight.builder()
                .power(200)
                .maxSpeed(140)
                .weight(4)
                .brand("Камаз")
                .wheels(6)
                .fuelConsumption(20)
                .carryingCapacity(1000)
                .build();

        Civil civil = Civil.builder()
                .power(1000)
                .maxSpeed(500)
                .weight(10)
                .brand("Boing")
                .wingspan(10)
                .minRunwayLength(15)
                .countPassengers(180)
                .businessClass(true)
                .build();

        Military military = Military.builder()
                .power(1500)
                .maxSpeed(750)
                .weight(7)
                .brand("Cy")
                .wingspan(6)
                .minRunwayLength(5)
                .catapultSystem(true)
                .countRockets(10)
                .build();

        System.out.println(light);
        System.out.println(freight);
        System.out.println(civil);
        System.out.println(military + "\n");

        InformationService informationService = new InformationService();

        informationService.shoot(military);
        informationService.catapult(military);
        informationService.lightInfo(light, 2);
        informationService.checkWeightCapacity(freight, 1001);
        informationService.checkPassengerCapacity(civil, 75);

//        light.info(2);
//        freight.checkWeightCapacity(1001);
//        civil.checkPassengerCapacity(75);
//        military.shoot();
//        military.catapult();
    }
}
