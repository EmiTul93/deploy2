package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/basic")

public class BasicController {

    @GetMapping("/casual")
    public int casualSum() {
        Random random = new Random();
        int int1 = random.nextInt(100);
        int int2 = random.nextInt(100);
        return int1+int2;
    }
}