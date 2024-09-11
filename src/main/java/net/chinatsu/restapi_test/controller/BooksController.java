package net.chinatsu.restapi_test.controller;

import net.chinatsu.restapi_test.controller.Request.LocationUpdateRequest;
import net.chinatsu.restapi_test.controller.Response.BooksDeleteResponse;
import net.chinatsu.restapi_test.controller.Response.BooksRegisterResponse;
import net.chinatsu.restapi_test.controller.Request.BooksRegisterRequest;
import net.chinatsu.restapi_test.controller.Response.LocationUpdateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import net.chinatsu.restapi_test.controller.Response.BooksResponse;
import org.springframework.web.util.UriComponentsBuilder;
import org.yaml.snakeyaml.events.Event;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class BooksController {
    
    @GetMapping("/books/{id}")//クエリ文字列で登録した本をIDで検索？/books?ID={"id"}
    public List<BooksResponse>getBooksInfoByID(@PathVariable long id){
        List<BooksResponse>books=List.of(
                new BooksResponse(1,"Guri and Gura","pictureBook","ErikoNakagawa",1963,"1階児童"),
                new BooksResponse(2,"And Then There Were None","mystery","Agatha Christie",1939,"1階ミステリ"),
                new BooksResponse(3,"The Little Prince","fantasy","Saint-Exupery",1943,"1階ファンタジー"));
        return books;
    }
    
    
    @PostMapping("/books")
    public ResponseEntity<BooksRegisterResponse>registractionbooks(@RequestBody BooksRegisterRequest booksRegisterRequest, UriComponentsBuilder uriComponentsBuilder){
        URI uri = uriComponentsBuilder.path("/books/{id}").buildAndExpand(4).toUri();
        return ResponseEntity.created(uri).body(new BooksRegisterResponse("a new book info is registered!"));
    }
    
    @PatchMapping("/books/{id}")
    public LocationUpdateResponse updateLocation(@PathVariable int id, @RequestBody LocationUpdateRequest locationUpdateRequest){
        return new LocationUpdateResponse("a location is updated!");
    }
    
    @DeleteMapping("/books/{id}")
    public ResponseEntity<Object> deleteBooks(@PathVariable("id")String bookId){
        BooksResponse.delete(bookId);
        return ResponseEntity.noContent().build();
    }
    
}
