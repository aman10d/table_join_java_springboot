package table.example.demo.entity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
public class Books {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String title;
        //the foriegnkey will be created which refers to the another table;the default name will be address_add_id(name of the primary key in another table)
        //if we want customised name we use

        @ManyToOne
        @JoinColumn(name = "author_id")
        private Author author;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public Author getAuthor() {
                return author;
        }

        public void setAuthor(Author author) {
                this.author = author;
        }
}
