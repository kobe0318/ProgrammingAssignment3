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

    public class Book {

        // Parameters are used to signify what the author's name is, their email, and their gender
        public void main(String[] args) {
            Author washington = new Author("Nicki Washington", "washingtonn@winthrop.edu", 'f');
            Book toc = new Book("Stay Prepped: 10 Steps to Succeeding in College (and Having a Ball Doing It)!", washington,
                    14.95, 1908);

            Book toc1 = new Book("Stay Prepped: 10 Steps to Succeeding in College (and Having a Ball Doing It)!",
                    new Author("Nicki Washington", "washingtonn@winthrop.edu", 'f'), 14.95, 1908);

            // Can use
            // System.out.println(toc.toString());
            // instead of the sequence below
            System.out.println("Book name: " + toc.getName());
            System.out.println("Price: $" + toc.getPrice());
            System.out.println("Quantity: " + toc.getQtyInStock());
            System.out.println("Author: " + washington.getName());
            System.out.println("Email: " + washington.getEmail());
            System.out.println("Gender: " + washington.getGender());
        }
        private String name;
        private Author author;
        private double price;
        private int qtyInStock;

        // Creates an instance of the book and book information given the parameters used in the main method
        public Book (String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        // Gets and returns the private name
        public String getName() {
            return name;
        }

        // Gets and returns the private author name
        public Author getAuthor() {
            return author;
        }

        // Gets and returns the private price
        public double getPrice() {
            return price;
        }

        // Sets the price of the book
        public void setPrice(double price) {
            this.price = price;
        }

        // Gets and returns the quantity of the books
        public int getQtyInStock() {
            return qtyInStock;
        }

        // Sets the quantity of books in stock from the
        public void setQtyInStock(int qtyInStock) {
            this.qtyInStock = qtyInStock;
        }

        public String toString() {
            return "Name: " + name + "\n"
                    + "Price: $" + price + "\n"
                    + "Quantity in Stock: " + qtyInStock + "\n"
                    + "Author " + author;
        }
    }
}
