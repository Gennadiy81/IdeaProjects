package OfficeHours.Practice_03_02_2021;

public class personalInfo {
    public static void main(String[] args){
        String name, fullBirthDate,favoriteQuote;
        byte age;
        char gender;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;
        boolean student;

        name = "Gennadiy";
        age = 39;
        gender = 'M';
        student = true;
        numberOfSiblings = 2;
        numberOfSeasons = 4;
        birthDate = 10.08;
        year = 1981;
        favoriteQuote = "Working hard or hardly working";
        fullBirthDate = "" + birthDate + "." + year;
        //fullBirthDate = birthDate + year+ "";
        System.out.println(fullBirthDate);


    }
}
