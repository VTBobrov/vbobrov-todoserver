package net.dunice.VBobrov_todoserver.block1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("api/main")
    public String hello() {
        return "Hello";
    }
}
