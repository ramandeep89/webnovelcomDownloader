package com.webnovel.downloader.common;

import com.google.gson.Gson;
import com.webnovel.downloader.json.Response;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebNovelComAPICaller {
    private final String csrfToken;
    private final String bookId;

    private static final String API_URL = "https://www.webnovel.com/go/pcm/chapter/getContent";
    private static final HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

    public WebNovelComAPICaller(String csrfToken, String bookId) {
        this.csrfToken = csrfToken;
        this.bookId = bookId;
    }

    public Response getBookDetails() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(API_URL + "?_csrfToken=" + csrfToken + "&bookId=" + bookId))
                .header("accept", "application/json")
                .header("Cookie", "_csrfToken=" + csrfToken)
                .GET()
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        Response response = new Gson().fromJson(httpResponse.body(), Response.class);
        return response;
    }

    public Response getChapterDetails(final String chapterId) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(API_URL + "?_csrfToken=" + csrfToken + "&bookId=" + bookId + "&chapterId=" + chapterId))
                .GET()
                .header("accept", "application/json")
                .header("Cookie", "_csrfToken=" + csrfToken)
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        Response response = new Gson().fromJson(httpResponse.body(), Response.class);
        return response;
    }
}
