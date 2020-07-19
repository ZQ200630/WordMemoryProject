package com.zq.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZQ
 */
@RestController
public class AdminController {
    @GetMapping("/admin")
    public String test() {
        return "This is admin module";
    }
}
