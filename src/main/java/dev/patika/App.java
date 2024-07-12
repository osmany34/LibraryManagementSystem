package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kutuphane");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        // Author
        Author author = new Author();
        author.setName("Orhan Pamuk");
        author.setBirthDate(1952);
        author.setCountry("Türkiye");

        // Publisher
        Publisher publisher = new Publisher();
        publisher.setName("Yapı Kredi Yayınları");
        publisher.setEstablishmentYear(1944);
        publisher.setAddress("İstanbul, Türkiye");

        // Categories
        Category roman = new Category();
        roman.setName("Roman");
        roman.setDescription("Bir tür edebi eser.");

        Category tarih = new Category();
        tarih.setName("Tarih");
        tarih.setDescription("Geçmişteki olayları inceleyen bilim dalı.");

        List<Category> categories = new ArrayList<>();
        categories.add(roman);
        categories.add(tarih);

        // Book
        Book book = new Book();
        book.setName("Beyaz Kale");
        book.setPublicationYear(1985);
        book.setStock(5);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setCategories(categories);

        // Book Borrowing
        BookBorrowing borrowing = new BookBorrowing();
        borrowing.setBorrowerName("Ahmet Yılmaz");
        borrowing.setBorrowingDate(LocalDate.now());
        borrowing.setBook(book);

        List<BookBorrowing> borrowings = new ArrayList<>();
        borrowings.add(borrowing);
        book.setBorrowings(borrowings);

        // Save entities
        entityManager.persist(author);
        entityManager.persist(publisher);
        entityManager.persist(roman);
        entityManager.persist(tarih);
        entityManager.persist(book);
        entityManager.persist(borrowing);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
