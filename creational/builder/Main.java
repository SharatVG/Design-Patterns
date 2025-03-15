package creational.builder;

public class Main {

    public static void main(String[] args) {


        var person1 = new Person.PersonBuilder().withFirstName("Sharat")
                .withLastName("Gangal")
                .withPhoneNumber("12332")
                .withEmailAddress("abc@gamil.com").build();

        var person2 = new Person.PersonBuilder().withFirstName("anvesh")
                .withLastName("Patil")
                .withPhoneNumber("434332")
                .withEmailAddress("egh@gamil.com").build();


        var person3 = new Person.PersonBuilder().withFirstName("Rekha")
                .withLastName("Selvi")
                .withEmailAddress("yht@gamil.com").build();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());



    }

}
