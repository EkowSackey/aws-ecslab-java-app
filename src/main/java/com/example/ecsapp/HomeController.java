package com.example.ecsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
            <html>
              <head>
                <title>ECS CI/CD Lab</title>
                <style>
                  body { font-family: Arial, sans-serif; margin: 40px; background: #f4f4f4; }
                  .card { background: white; padding: 24px; border-radius: 8px; max-width: 700px; }
                  h1 { color: #08293C; }
                </style>
              </head>
              <body>
                <div class="card">
                  <h1>Ekow Nii Saki Sackey</h1>
                  <p>Lab: ECS CI/CD LAB</p>
                </div>
              </body>
            </html>
            """;
    }
}
