package com.sitech.project1;
	
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.UUID;

	class Book {
	    private String title;
	    private String author;
	    private String isbn;
	    private int quantity;

	    public Book(String title, String author, String isbn, int quantity) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.quantity = quantity;
	    }

	    // Getters and setters
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
	}

	class User {
	    private UUID id;
	    private String name;

	    public User(String name) {
	        this.id = UUID.randomUUID();
	        this.name = name;
	    }

	    // Getters
	    public UUID getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	}

	class Library {
	    private List<Book> books;

	    public Library() {
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void displayBooks() {
	        for (Book book : books) {
	            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
	                    ", ISBN: " + book.getIsbn() + ", Quantity: " + book.getQuantity());
	        }
	    }

	    public Book findBook(String isbn) {
	        for (Book book : books) {
	            if (book.getIsbn().equals(isbn)) {
	                return book;
	            }
	        }
	        return null;
	    }
	}

	class LibraryManagementSystem {
	    Library library;
	    private List<User> users;
	    private Map<UUID, List<String>> borrowedBooks;

	    public LibraryManagementSystem() {
	        this.library = new Library();
	        this.users = new ArrayList<>();
	        this.borrowedBooks = new HashMap<>();
	    }

	    public void addUser(User user) {
	        users.add(user);
	    }

	    public User authenticateUser(UUID userId) {
	        for (User user : users) {
	            if (user.getId().equals(userId)) {
	                return user;
	            }
	        }
	        return null;
	    }

	    public void borrowBook(UUID userId, String isbn) {
	        User user = authenticateUser(userId);
	        if (user == null) {
	            System.out.println("User not found. Please sign up.");
	            return;
	        }

	        Book book = library.findBook(isbn);
	        if (book != null) {
	            if (book.getQuantity() > 0) {
	                book.setQuantity(book.getQuantity() - 1);
	                borrowedBooks.computeIfAbsent(userId, k -> new ArrayList<>()).add(isbn);
	                System.out.println(user.getName() + " has borrowed " + book.getTitle());
	            } else {
	                System.out.println("Sorry, the book is not available for borrowing.");
	            }
	        } else {
	            System.out.println("Book not found.");
	        }
	    }

	    public void returnBook(UUID userId, String isbn) {
	        User user = authenticateUser(userId);
	        if (user == null) {
	            System.out.println("User not found. Please sign up.");
	            return;
	        }

	        Book book = library.findBook(isbn);
	        if (book != null) {
	            book.setQuantity(book.getQuantity() + 1);
	            List<String> borrowed = borrowedBooks.get(userId);
	            if (borrowed != null && borrowed.remove(isbn)) {
	                System.out.println(user.getName() + " has returned " + book.getTitle());
	            } else {
	                System.out.println("This book was not borrowed by the user.");
	            }
	        } else {
	            System.out.println("Book not found.");
	        }
	    }

	    // Getter for users list
	    public List<User> getUsers() {
	        return users;
	    }
	}

	public class project {
	    public static void main(String[] args) {
	        LibraryManagementSystem librarySystem = new LibraryManagementSystem();

	        Book book1 = new Book("Python Programming", "John Doe", "978-0-13-578614-6", 5);
	        Book book2 = new Book("Data Structures and Algorithms", "Jane Smith", "978-0-12-345678-9", 3);

	        librarySystem.addUser(new User("Alice"));
	        librarySystem.addUser(new User("Bob"));

	        librarySystem.borrowBook(librarySystem.getUsers().get(0).getId(), "978-0-13-578614-6");
	        librarySystem.borrowBook(librarySystem.getUsers().get(1).getId(), "978-0-13-578614-6");
	        librarySystem.returnBook(librarySystem.getUsers().get(0).getId(), "978-0-13-578614-6");

	        System.out.println("Available books:");
	        librarySystem.library.displayBooks(); // Corrected method call
	    }
	}

