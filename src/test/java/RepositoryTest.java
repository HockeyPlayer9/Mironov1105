import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    public void testDeleteProduct() {
        Repository repository = new Repository();
        Book book1 = new Book(1, "Harry Potter 1", 1_000, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 2_000, "Rowling");
        Book book3 = new Book(3, "Daughter", 3_000, "Pushkin");
        Smartphone phone1 = new Smartphone(10, "iphone 15", 120_000, "apple");
        Smartphone phone2 = new Smartphone(11, "galaxy 15", 110_000, "samsung");

        repository.add(book1);
        repository.add(book2);
        repository.add(book3);
        repository.add(phone1);
        repository.add(phone2);
        repository.deleteById(2);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book3, phone1, phone2};

        Assertions.assertArrayEquals(expected, actual);
    }

}