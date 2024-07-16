public class Reader {
    private String name = "New user";
    private int capacity;
    private String[] books; // Array to hold book titles
    private int bookCount; // Current number of books added

    // Method to create a new reader with a name and initial capacity
    public void createReader(String x, int y) {
        name = x;
        capacity = y;
        books = new String[capacity]; // Initialize the array with the specified capacity
        bookCount = 0; // Initialize book count
    }

    // Method to add a book to the reader
    public void addBook(String bookName) {
        if (bookCount < capacity) {
            books[bookCount] = bookName;
            bookCount++;
        } else {
            System.out.println("No more space for new book");
        }
    }

    // Method to increase the reader's capacity
    public void increaseCapacity(int additionalCapacity) {
        int newCapacity = this.capacity + additionalCapacity;
        String[] newBooks = new String[newCapacity]; // Create a new array with increased capacity

        // Copy existing books to the new array
        for (int i = 0; i < bookCount; i++) {
            newBooks[i] = books[i];
        }

        books = newBooks; // Update the reference to the new array
        capacity = newCapacity; // Update the capacity
        System.out.println(name + "'s capacity increased to " + this.capacity);
    }

    // Method to display reader information
    public void readerInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Books: ");

        if (bookCount == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
            }
        }
    }
}
