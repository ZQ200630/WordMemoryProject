package com.zq.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZQ
 */
@RestController
public class UiController {
    @GetMapping("/ui")
    public String test() {
        return "This is ui module";
    }
}
