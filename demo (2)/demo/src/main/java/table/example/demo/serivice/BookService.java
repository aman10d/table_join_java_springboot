package table.example.demo.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.example.demo.repository.BooksRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BooksRepository booksRepository;
    public List<Object[]> getBooksAndAuthors() {
        return booksRepository.findBooksAndAuthors();
    }

}
