package spring01.com.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring01.com.spring01.model.Morse;
import spring01.com.spring01.model.RomanNumber;

import java.util.List;

@RestController()
@RequestMapping("/spring1")
public class HelloController {

    @GetMapping("/roman/{number}")
    public static String getRoman(@PathVariable int number) {
        return RomanNumber.toRoman(number);
    }

    @GetMapping("/morse/{string}")
    public static String getMorse(@PathVariable String string) {
        String data = string.toUpperCase();
        return Morse.encode(List.of(data)) + " " + data;
    }

    @GetMapping("/hello/{name}")
    public static String getHelloName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping()
    public static String getHello() {
        return "Hello Java + Spring I";
    }
}
