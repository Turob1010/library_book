package Library.library_book.Service;

import Library.library_book.Model.Books;
import Library.library_book.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService  {

    @Autowired
   BooksRepository booksRepository;

    public Books createbook(Books books){
        Books books1 = booksRepository.save(books);
        return books1;
    }
    public Books finfByid(Integer id){
        Books books = booksRepository.findByid(id);
        return books;
    }

    public Books findByname(String name){
        Books books = booksRepository.findByname(name);
        return books;
    }
    public List<Books> findAll(){
        List<Books> booksList = booksRepository.findAll();
        return booksList;
    }

    public Books save(Books books){
        Books books1 = booksRepository.save(books);
        books1.setId(books.getId());
        books1.setName(books.getName());
        books1.setAuthor(books.getAuthor());
        books1.setLanguage(books.getLanguage());
        return books1;
    }

    public void  delete(Books books){
        booksRepository.delete(books);


    }

}

