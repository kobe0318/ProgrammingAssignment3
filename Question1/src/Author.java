public class Author {

    private String name;
    private String email;
    private char gender;

    // Creates an instance of the author given the parameters used in the main method
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Gets the name of the author
    public String getName() {
        return name;
    }

    // Gets the email of the author
    public String getEmail() {
        return email;
    }

    // Sets the original variable, email, as whatever email is used in the object parameters
    public void setEmail(String email) {
        this.email = email;
    }

    // Gets the gender of the author
    public char getGender() {
        return gender;
    }

    // Prints out the author's name, email, and gender
    public String toString() {
        return "Name: " + name + "\n" + "E-mail: " + email
                + "\n" + "Gender: " + gender;
    }

    // Parameters are used to signify what the author's name is, their email, and their gender
    public static void main(String[] args) {
        Author washington = new Author("Nicki Washington", "washingtonn@winthrop.edu", 'f');

    }
}
