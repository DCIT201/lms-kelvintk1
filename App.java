/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
        public static void main(String[] args) {
            Library library = new Library();
            Book book1 = new Book("Animal Farm", "George Orwell", "1234567890");
            Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

            library.addBook(book1);
            library.addBook(book2);

            Patron patron = new Patron("John Doe", "P001");

            System.out.println("Lending book Animal Farm: " + library.lendBook("1234567890"));
            System.out.println("Lending book Animal Farm again: " + library.lendBook("1234567890"));
            library.returnBook("1234567890");
            System.out.println("Lending book Animal Farm after return: " + library.lendBook("1234567890"));
        }
}
