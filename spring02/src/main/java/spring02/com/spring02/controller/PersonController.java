package spring02.com.spring02.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring02.com.spring02.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    List<Person> persons = new ArrayList<Person>();

    public PersonController() {
        persons.add(new Person("Mateus1", 40, 1));
        persons.add(new Person("Mateus2", 80, 2));
        persons.add(new Person("Mateus3", 60, 3));
    }

    @PostMapping("/all")
    public ResponseEntity<List<Person>> all() {
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Person> deletePerson(@PathVariable int id) {
        Optional<Person> person = persons.stream().filter((p) -> p.getId() == id).findFirst();

        if (person.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        persons.remove(person.get());

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity<Person> newPerson(@RequestBody Person person) {
        // person.setId(persons.size() + 1);
        persons.add(person);

        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> personController(@PathVariable int id) {
        // persons.stream().filter((p) -> p.getId() == id).findFirst().get()

        Optional<Person> person = persons.stream().filter((p) -> p.getId() == id).findFirst();

        if (person.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(person.get(), HttpStatus.OK);
    }
}

/*
(async () => {
  const rawResponse = await fetch('http://localhost:8080/person/', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({id: 4, age: 199, name: 'Mateus 4'})
  });
  const content = await rawResponse.json();

  console.log(content);
})();
 */
