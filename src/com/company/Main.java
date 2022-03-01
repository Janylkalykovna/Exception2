package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicle = {new Car("Bmw", 2000, TypeOfEngine.FUEL),
                new Car("Subaru", 1999, TypeOfEngine.FUEL),
                new Car("Ferrari", 2001, TypeOfEngine.FUEL),
                new Car("Tesla", 2002, TypeOfEngine.FUEL),
                new Car("Mersedes", 2003, TypeOfEngine.FUEL),
                new Car("Audi", 1990, TypeOfEngine.FUEL),
                new Car("Honda", 1995, TypeOfEngine.ELEKTROMOBIL),
                new Car("Rollce Royce", 1992, TypeOfEngine.ELEKTROMOBIL),
                new Truck("Hyundai", 1993, TypeOfEngine.ELEKTROMOBIL),
                new Truck("Hyundai2", 1994, TypeOfEngine.ELEKTROMOBIL),
                new Truck("Hyundai3", 1995, TypeOfEngine.ELEKTROMOBIL),
                new Truck("Hyundai4", 1996, TypeOfEngine.HYBRYD),
                new Truck("Hyundai5", 1997, TypeOfEngine.HYBRYD),
                new Truck("Howo", 1998, TypeOfEngine.HYBRYD),
                new Truck("Howo2", 1999, TypeOfEngine.HYBRYD),
                new Truck("Howo3", 1900, TypeOfEngine.HYBRYD),
        };
        for (Vehicle v : vehicle) {
            {
                try {
                    System.out.println(v.getYearOfIssue() + " ");

                } catch (InvalidIssueYear e) {
                    System.out.println(v.getModel() + "Akyrky jyly chykkan emes");
                }
                System.out.println(v.getTypeOfEngine() + " ");

            }

        }
    }
}