package com.sem25_03.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("Blog")
public class Controller {
    private List<Blog> list;

    @GetMapping("/get/{id}")
    public ResponseEntity<Blog> get(@PathVariable Long id) {
        try{
            for (Blog i: this.list){
                Long new_id = i.getId();
                if (new_id.equals(id)){
                    return new ResponseEntity<>(i, HttpStatus.OK);
                }
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception i){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/post")
    ResponseEntity<Boolean> createBlog (@RequestParam Long id, @RequestParam String name,
                                        @RequestParam String text, @RequestParam LocalDate creation_date,
                                        @RequestParam LocalDate update, @RequestParam String tag, @RequestParam String author){
        try{
            this.list.add(new Blog(id, name, text, creation_date, update, tag, author));
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        catch (Exception i){
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }
}
