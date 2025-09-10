package com.example.mycollections.controllers;

import com.example.mycollections.models.MusicAlbum;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicAlbum")
public class MusicAlbumController {

    private final List<MusicAlbum> musicAlbums = new ArrayList<>() {{
        add(new MusicAlbum("Urban Flora", "Galimatias & Alina Baraz", 2014, 8));
        add(new MusicAlbum("Hybrid Theory", "Linkin Park", 2000, 12));
        add(new MusicAlbum("You Can't Imagine How Much Fun We're Having", "Atmosphere", 2005, 13));
    }};

    @GetMapping("/json")
    public List<MusicAlbum> getMusicAlbumsJson() {
        return musicAlbums;
    }

    @GetMapping("/html")
    public String getMusicAlbumsHtml() {
        String musicAlbumList = "<ul>";
        for (MusicAlbum musicAlbum : musicAlbums) {
            musicAlbumList += "<li>" + musicAlbum + "</li>";
        }
        musicAlbumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """ +
                musicAlbumList +
                """
                        </ul>
                    </body>
                """;
    }

}