package creational.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Person(){

    }

    public Person(PersonBuilder personBuilder){
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.phoneNumber = personBuilder.phoneNumber;
        this.emailAddress = personBuilder.emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static class PersonBuilder {

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String emailAddress;

        public PersonBuilder (){
        }

        public Person build(){
            return new Person(this)  ;
        }

        public PersonBuilder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder withPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder withEmailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

    }
}
