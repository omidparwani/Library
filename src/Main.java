public class Main {
    public static void main(String[] args) {
        Library lib = new Library("Central Library");
        lib.addBook(new Book("1984", "George Orwell"));
        lib.addMember(new Member("John Doe"));

        System.out.println("Library Management System is running.");
    }
}
