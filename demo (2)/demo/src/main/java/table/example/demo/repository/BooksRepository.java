package table.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import table.example.demo.entity.Books;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books,Long> {
    @Query(value = "SELECT b.title, a.name \n" +
            "FROM books b \n" +
            "JOIN author a ON b.author_id = a.author_id",nativeQuery = true)
    List<Object[]> findBooksAndAuthors();
}
