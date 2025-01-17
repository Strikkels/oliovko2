package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        
        System.out.print( "Anna auton merkki: " );
        String brand = sc.nextLine();

        System.out.print( "Anna auton malli: " );
        String model = sc.nextLine();

        Car car = null;
        car = new Car(brand, model);

        boolean exit = false;
        while(!exit){
            System.out.println("1) Näytä auton tila, 2) Muokkaa auton merkkiä ja mallia, 3) Kiihdytä autoa, 4) Hidasta autoa, 0) Lopeta ohjelma");  

            if(sc.hasNext()) {
                int i = 0;
                String strinput = sc.nextLine();
                i = Integer.parseInt(strinput);
                String strSpeed;
                int speed;

                switch (i) {
                    case 1:
                        car.status();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        brand = sc.nextLine();
                        System.out.print("Anna uusi auton malli: ");
                        model = sc.nextLine();
                        car.setSpecs(brand, model);
                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        strSpeed = sc.nextLine();
                        speed = Integer.parseInt(strSpeed);
                        if(speed < 0){
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        car.accelerate(speed);
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        strSpeed = sc.nextLine();
                        speed = Integer.parseInt(strSpeed);
                        if(speed < 0){
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        car.decelerate(speed);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Virheellinen valinta.");
                        break;
                }
            }
        }
        sc.close();
    }
}
