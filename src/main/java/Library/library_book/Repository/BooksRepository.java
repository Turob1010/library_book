package Library.library_book.Repository;

import Library.library_book.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {

    Books findByname(String name);
    Books findByid(Integer id);
}
