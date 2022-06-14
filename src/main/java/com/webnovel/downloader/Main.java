package com.webnovel.downloader;

import com.webnovel.downloader.model.Book;
import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) throws Exception {
        final CommandLineParser parser = new DefaultParser();
        final Options options = new Options();
        options.addOption("t", "csrf", true, "Session CSRF Token");
        options.addOption("b", "book", true, "Book ID");
        options.addOption("f", "file", true, "Output File Location");

        String csrfToken = "";
        String bookId = "";
        String path = "";

        try {
            CommandLine commandLine = parser.parse(options, args);
            csrfToken = (String) commandLine.getParsedOptionValue("t");
            bookId = (String) commandLine.getParsedOptionValue("b");
            path = (String) commandLine.getParsedOptionValue("f");
        } catch (ParseException e) {
            System.out.println("Unexpected exception:" + e.getMessage());
            System.exit(-1);
        }

        Book book = Parser.parseBook(csrfToken, bookId);
        Writer.writeBook(book, path);
    }
}
