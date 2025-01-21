package easyShoppingAPI.easyShopping.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthController {
    @GetMapping("/api/v1/user")
    public String register() {
        return "User already exist";
    }
}
