public class Reader {
    public String name;
    public int capacity;
    public int dj;
    public int bCount;
    public String[] books;

    Reader(){
        dj = 1;
    }

    public void createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[capacity];
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books:");
        boolean virgo = true;
        for (int i = 0; i < capacity; i++) {
            if (books[i] != null) {
                System.out.println("Book " + dj + ": " + books[i]);
                dj++;
                virgo = false;
            }
        }
        if (virgo) {
            System.out.println("No books added yet");
        }
    }

    public void addBook(String book) {
        if (bCount == capacity) {
            System.out.println("No more space for new book");
        } else {
            books[bCount] = book;
            bCount++;
        }
    }

    public void increaseCapacity(int amount) {
        capacity = amount;
        String[] newBooks = new String[capacity];
        for (int i = 0; i < bCount; i++) {
            newBooks[i] = books[i];
        }
        books = newBooks;
        System.out.println(name + "'s capacity increased to " + capacity);
    }

    public static void main(String[] args) {
        Reader r1 = new Reader();
        Reader r2 = new Reader();

        r1.createReader("Messi", 2);
        r2.createReader("Ronaldo", 5);

        System.out.println("1 ==========");
        r1.readerInfo();

        System.out.println("2 ==========");
        r2.addBook("Java");
        r2.addBook("Python");
        r2.addBook("C++");
        r2.readerInfo();

        System.out.println("3 ==========");
        r1.addBook("C#");
        r1.addBook("Rust");
        r1.addBook("GoLang");

        System.out.println("4 ==========");
        r1.increaseCapacity(5);
        r1.addBook("Python");

        System.out.println("5 ==========");
        r1.readerInfo();
    }
}
