package Library.library_book.Resource;

import Library.library_book.Model.Books;
import Library.library_book.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class BookResource {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public Books create(@RequestBody Books books){
        Books books1 = bookService.createbook(books);
        return books1;
    }
    @GetMapping("/getbyid/{id}")
    public ResponseEntity getById(@PathVariable (value = "id") Integer id){
        Books books = bookService.finfByid(id);
        return ResponseEntity.ok(books);
    }
    @GetMapping("/getbyname/{name}")
    public ResponseEntity getById(@PathVariable (value = "name") String name){
        Books books = bookService.findByname(name);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/getall")
    public List<Books> getAll(){
        List<Books>booksList = bookService.findAll();
        return booksList;
    }

    @PutMapping("/update")
    public Books update (@RequestBody Books books){
        Books books1 = bookService.save(books);
        return books1;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        bookService.delete(bookService.finfByid(id));
        return ResponseEntity.ok("Book removed");
    }




}
