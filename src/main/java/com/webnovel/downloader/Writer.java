package com.webnovel.downloader;

import com.webnovel.downloader.model.Book;
import com.webnovel.downloader.model.Chapter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void writeBook(Book book, String path) throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("<h1>" + book.getName() + "</h1>");
        builder.append("<p>" + book.getAuthor() + "</p>");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Chapter chapter :
                    book.getChapters()) {
                builder.append("<h2>Chapter " + chapter.getIndex() + ": " + chapter.getName() + "</h2>");
                builder.append("<p>" + chapter.getContent() + "</p>");
            }
            writer.write(builder.toString());
        }
    }
}
