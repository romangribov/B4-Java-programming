package io.loop.test.day05_variables.Hm_day5;

/*
Create a class called House in your Practice_Programming project and inside the day04_tasks package

        Task:
            create a main method
                    - Each the datatype you feel is most appropriate for each variable.
                    - Create the following variables:
                        house type,
                        number of bedrooms,
                        number of bathrooms,
                        number of kitchens,
                        is there a basement?,
                        is there an attic,
                        is there a pool,
                        is the house for sale?,
                        cost of the house,
                        address, zipcode,
                        is a park near by,
                        Rating of surrounding school districts (out of 5),

                    - Print each variable with a message with the value
                        Ex: The number of bedrooms is: 4
                            The number of bathrooms is: 3
                            Is there a basement? false
                            .
                            .
                            .
                            .
                            .

 */

public class House {
    public static void main(String[] args) {

    String houseType = "Pinthouse";
    int numberOfBedrooms = 4;
    int numberOfBathrooms = 3;
    int numberOfKitchens = 4;
    boolean isThereAbasement = false;
    boolean isThereAnAttic = true;
    boolean isThereAPool = true;
    boolean isTheHouseForSale = false;
    int costOfTheHouse = 1200000;
    String address = "Arrest Blvrd", zipcode = "22196";
    String isParkNearBy = "Myhouse";
    int ratingOfSurroundingSchoolDistrictsOutOf = 4;

        System.out.println("House Type:"+houseType);
        System.out.println("The number of bedrooms is: "+numberOfBedrooms);
        System.out.println("The number of bathrooms is: "+numberOfBathrooms);
        System.out.println("The number of kitchen is: "+numberOfKitchens);
        System.out.println("Is there a basement?: "+isThereAbasement);
        System.out.println("Is there an attic?: "+isThereAnAttic);
        System.out.println("Is there a pool?: "+isThereAPool);
        System.out.println("Is the house for sale?: "+isTheHouseForSale);
        System.out.println("Cost of the house: "+"$"+costOfTheHouse);
        System.out.println("Address, zipcode: "+address+", "+zipcode);
        System.out.println("Is a park near by: "+isParkNearBy);
        System.out.println("Rating of surrounding school districts: "+ratingOfSurroundingSchoolDistrictsOutOf);





    }
}
