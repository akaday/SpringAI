package com.example.springai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
public class OpenAIController {
    @GetMapping("/generate")
    public HashMap<String, String> generate(@RequestParam String prompt) {
        // Logic to integrate with OpenAI API
        HashMap<String, String> response = new HashMap<>();
        response.put("response", "Generated response based on " + prompt);
        return response;
    }
}
