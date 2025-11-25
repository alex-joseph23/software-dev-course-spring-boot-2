package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/movies")
public class MovieController {
    private List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Wicked", "Jon M. Chu", 2024, 160));
        add(new Movie("RRR"," S.S. Rajamouli", 2022, 185));
        add(new Movie("Good Will Hunting", "Gus Van Sant", 1997, 126));
    }};
    @GetMapping("/json")
    public List<Movie> getMoviesAsJson() {
        return movies;}
    @GetMapping("/html")
    public String getMoviesAsHtml() {
        String html = """
                <html>
                  <body>
                     <ul>
                """;
        for (Movie movie : movies) {
            html += "<li>" + movie.getTitle() + ": " + movie.getDirector() + "(" + movie.getYear() + ")</li>";
        }
        html += """
                     </ul>
                  </body>
                </html>
                """;
        return html;
    }

}
