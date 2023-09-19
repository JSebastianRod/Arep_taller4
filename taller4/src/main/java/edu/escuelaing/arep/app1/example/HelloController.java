package edu.escuelaing.arep.app1.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import edu.escuelaing.arep.app1.anotation.Component;
import edu.escuelaing.arep.app1.anotation.RequestMapping;

@Component
public class HelloController  {
    public HelloController() {
    }
    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/prueba")
    public String prueba() {
        return "prueba";
    }

    @RequestMapping("/gHtml")
    public static String index1() {
        return html("index", "html");
    }

    public static String html(String name, String type) {
        byte[] file;
        try {
            file = Files.readAllBytes(Paths.get("src/main/resources/" + name + "." + type));
            return new String(file);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }
    }
}
