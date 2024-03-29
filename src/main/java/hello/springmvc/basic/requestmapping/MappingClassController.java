package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
    @GetMapping("")
    public String user() {
        return "get users";
    }

    @PostMapping("")
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get uerId=" + userId;
    }

    @PatchMapping("/{userId}")
    public String updatedUser(@PathVariable String userId) {
        return "update uerId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete uerId=" + userId;
    }
}
