package org.example;

public class Book {

    // This is your working class.

        private String title;
        private String author;
        private String yearPublished;
        private boolean isAvailable;

        public Book(String title, String author, String yearPublished ) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.isAvailable = true;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getYearPublished() {
            return yearPublished;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

}
