package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("We're Starting to Look Like Each Other", "Hey, nothing", 2023, 10));
        add(new Album("Good Thing", "Leon Bridges", 2018, 10));
        add(new Album("Pearl", "Janis Joplin", 1971, 10));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumsAsJson() {
        return albums;
    }
    @GetMapping("/html")
    public String getAlbumsAsHtml() {
        StringBuilder albumList = new StringBuilder();
        for (Album album : albums) {
            albumList.append("<li>").append(album).append("</li>");
        }
        return """
               
                 <html>
                   <body>
                      <h1>My Album Collection</h1>
                        <ul>
                """+ albumList + """
                        </ul>
                     </body>
                    </html>
                """;
    }}