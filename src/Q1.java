import java.util.ArrayList;

class Q1{
    public interface Person {
        void getPerson();
    }

    public static void main(String[] args) {
        Q1 q = new Q1();
        Library myLibrary = q.new Library();
        myLibrary.setLibraryLocation("AGRA");
        Book b1 = q.new Book("Head First Java", "Eric S", 700.0f);
        Book b3 = q.new Book("Head First Design Patterns", "Donald Y", 900.0f);
        Book b2 = q.new Book("Head First HTML5 Programming", "David P", 800.0f);
        Book b4 = q.new Book("Head First HTML & CSS", "Henry T", 600.0f);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        myLibrary.setBooksInLibrary(bookList);
        Librarian librarian = q.new Librarian("Sumit", 4484);
        myLibrary.setLibrarian(librarian);
        Member m1 = q.new Member("Divas", 3668);
        Member m2 = q.new Member("Gunjan", 3339);
        Member m3 = q.new Member("prateek", 3940);
        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        myLibrary.setMembersOfLibrary(memberList);
        myLibrary.getLibraryDetails();
    }

    public class Library {
        private String libraryLocation;
        private ArrayList<Book> booksInLibrary;
        private ArrayList<Member> membersOfLibrary;
        private Librarian librarian;

        public String getLibraryLocation() {
            return libraryLocation;
        }

        public void setLibraryLocation(String libraryLocation) {
            this.libraryLocation = libraryLocation;
        }

        public ArrayList<Book> getBooksInLibrary() {
            return booksInLibrary;
        }

        public void setBooksInLibrary(ArrayList<Book> booksInLibrary) {
            this.booksInLibrary = booksInLibrary;
        }

        public ArrayList<Member> getMembersOfLibrary() {
            return membersOfLibrary;
        }

        public void setMembersOfLibrary(ArrayList<Member> membersOfLibrary) {
            this.membersOfLibrary = membersOfLibrary;
        }

        public Librarian getLibrarian() {
            return librarian;
        }

        public void setLibrarian(Librarian librarian) {
            this.librarian = librarian;
        }

        void getLibraryDetails() {
            System.out.println("_LIBRARY DETAILS_");
            System.out.println("LOCATION: " + libraryLocation);
            System.out.println("LIBRARIAN:");
            librarian.getPerson();
            System.out.println("MEMBERS:");
            for (Member m : membersOfLibrary)
                m.getPerson();
            System.out.println("BOOKS:");
            for (Book b : booksInLibrary)
                b.getBookDetails();
        }
    }

    public class Librarian implements Person {
        String librarianName;
        int librarianID;

        Librarian(String name, int id) {
            this.librarianName = name;
            this.librarianID = id;
        }

        // Interface method definition
        public void getPerson() {
            System.out.println("Name: " + librarianName);
            System.out.println("ID: " + librarianID);
        }
    }

    public class Book {
        String bookName;
        String bookAuthor;
        float bookPrice;

        Book(String name, String author, float price) {
            bookName = name;
            bookAuthor = author;
            bookPrice = price;
        }

        void getBookDetails() {
            System.out.println("Name: " + bookName);
            System.out.println("Author: " + bookAuthor);
            System.out.println("Price: " + bookPrice);
        }
    }

    public class Member implements Person {
        String memberName;
        int memberID;

        Member(String name, int id) {
            memberName = name;
            memberID = id;
        }

        // Interface method definition
        public void getPerson() {
            System.out.println("Name: " + memberName);
            System.out.println("ID: " + memberID);
        }

    }
}