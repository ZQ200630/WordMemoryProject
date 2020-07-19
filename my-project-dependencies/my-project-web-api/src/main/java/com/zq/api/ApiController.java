package com.zq.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZQ
 */
@RestController
public class ApiController {
    @GetMapping("/api")
    public String test() {
        return "This is api page";
    }
}
