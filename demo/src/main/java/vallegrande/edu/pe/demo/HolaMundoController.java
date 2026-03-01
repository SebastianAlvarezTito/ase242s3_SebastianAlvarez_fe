package vallegrande.edu.pe.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Le dice a Spring: "Esta clase maneja rutas web"
public class HolaMundoController {

    @GetMapping("/hola") // Define la URL: http://localhost:8080/hola
    public String decirHola() {
        return "¡Hola Mundo desde Spring Boot, Sebastian!"; 
    }
}