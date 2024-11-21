package info.dmerej;

public class UserBuilder {
    private String name = "Default Name";
    private String email = "default@domain.tld";
    private int age = 25;
    private boolean verified = true;
    private Address address = new Address(
            "51 Franklin Street",
            "Fifth Floor",
            "Boston",
            "02110",
            "USA"
    );

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder withVerified(boolean verified) {
        this.verified = verified;
        return this;
    }

    public UserBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(name, email, age, verified, address);
    }
}
