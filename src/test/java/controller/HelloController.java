package controller;

public class HelloController {
}
@GetMapping("/hello")
public String hello() {
    return "Hello from Spring Boot!";
}
@GetMapping("/status")
public String status() {
    return "API running — " + LocalDate.now().toString();
}
