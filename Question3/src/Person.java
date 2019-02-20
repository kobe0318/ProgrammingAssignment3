public class Person {

    // Initiates protected variables for a person's name, age, and gender
    protected String myName;
    protected int myAge;
    protected String myGender;

    // Creates an object of the Person class
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    //Gets the person's name
    public String getName() {
        return myName;
    }

    // Sets the person's name
    public void setName(String myName) {
        this.myName = myName;
    }

    // Gets age of person
    public int getAge() {
        return myAge;
    }

    // Sets age of person
    public void setAge(int myAge) {
        this.myAge = myAge;
    }

    // Gets gender of person
    public String getGender() {
        return myGender;
    }

    // Sets gender of person
    public void setGender(String myGender) {
        this.myGender = myGender;
    }

    //
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}

class Student extends Person {

    protected String myIdNum;
    protected double myGPA;

    // Creates an object of the Student class
    public Student(String myName, int myAge, String myGender, String myIdNum, double myGPA) {
        super(myName, myAge, myGender);

        this.myIdNum = myIdNum;
        this.myGPA = myGPA;
    }

    // Gets the id number for the given student
    public String getIdNum() {
        return myIdNum;
    }

    // Sets the id number as the id number for this student
    public void setIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    // Gets the gpa for the given student
    public double getGPA() {
        return myGPA;
    }

    // Sets the gpa for this student
    public void setGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    // Returns the id number and gpa of the student
    public String toString() {
        return super.toString() + ", ID number: " + myIdNum + ", GPA: " + myGPA;
    }
}

class Teacher extends Person {

    protected String subject;
    protected double salary;

    // Creates an object of the Teacher class
    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        super(myName, myAge, myGender);
        this.subject = subject;
        this.salary = salary;
    }

    // Gets the subject taught by the given teacher teacher
    public String getSubject() {
        return subject;
    }

    // Sets the subject taught by the teacher as the subject for that teacher
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Gets the salary for the given teacher
    public double getSalary() {
        return salary;
    }

    // Sets the salary from above as the salary for that teacher
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Returns the subject taught and salary of the given teacher
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}

class CollegeStudent extends Student {

    protected String major;
    protected int year;

    // Creates an object of the CollegeStudent class
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year, String major) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        this.major = major;
        this.year = year;
    }

    // Gets the amount of years the given student has been in college
    public int getYear() {
        return year;
    }

    // Sets the amount of years the given student has been in college
    public void setYear(int year) {
        this.year = year;
    }

    // Gets the major of the given college student
    public String getMajor() {
        return major;
    }

    // Sets the major of the college student
    public void setMajor(String major) {
        this.major = major;
    }

    // Returns the name of the student, their age, gender, year in school, and their major
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }

    // Test cases
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);

    }
}
