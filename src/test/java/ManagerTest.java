import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testOneProduct() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);
        Book book1 = new Book(1, "Onegin", 1_000, "Pushkin");
        Book book2 = new Book(2, "Business", 2_000, "Ivanov");
        Book book3 = new Book(3, "Daughter", 3_000, "Pushkin");
        Smartphone phone1 = new Smartphone(10, "iphone 15", 120_000, "apple");
        Smartphone phone2 = new Smartphone(11, "galaxy 15", 110_000, "samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        Product[] actual = manager.searchBy("Onegin");
        Product[] expected = {book1};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFewProducts() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);
        Book book1 = new Book(1, "Harry Potter 1", 1_000, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 2_000, "Rowling");
        Book book3 = new Book(3, "Daughter", 3_000, "Pushkin");
        Smartphone phone1 = new Smartphone(10, "iphone 15", 120_000, "apple");
        Smartphone phone2 = new Smartphone(11, "galaxy 15", 110_000, "samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        Product[] actual = manager.searchBy("Harry Potter");
        Product[] expected = {book1, book2};
        Assertions.assertArrayEquals(expected, actual);
    }
}