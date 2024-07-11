package table.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import table.example.demo.entity.Author;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
