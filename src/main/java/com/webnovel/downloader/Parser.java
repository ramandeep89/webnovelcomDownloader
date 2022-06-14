package com.webnovel.downloader;

import com.webnovel.downloader.common.WebNovelComAPICaller;
import com.webnovel.downloader.json.Content;
import com.webnovel.downloader.json.Response;
import com.webnovel.downloader.model.Book;
import com.webnovel.downloader.model.Chapter;


public class Parser {
    private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Parser.class);

    public static Book parseBook(String csrfToken, String bookId) throws Exception {
        WebNovelComAPICaller caller = new WebNovelComAPICaller(csrfToken, bookId);
        Response bookResponse = caller.getBookDetails();
        logger.info("Fetching Book with bookId: " + bookId);
        Book book = new Book(bookResponse.getData().getBookInfo().getBookName(),
                bookResponse.getData().getBookInfo().getAuthorName());
        String nextChapter = bookResponse.getData().getChapterInfo().getFirstChapterId();
        int nextChapterIndex = bookResponse.getData().getChapterInfo().getChapterIndex();
        while (!nextChapter.equals("-1")) {
            logger.info("Fetching Chapter " + nextChapterIndex + " with chapterId: " + nextChapter);
            Response chapterResponse = caller.getChapterDetails(nextChapter);
            StringBuilder text = new StringBuilder();
            for (Content content :
                    chapterResponse.getData().getChapterInfo().getContents()) {
                text.append(content.getContent().replace("\\r\\n", ""));
            }
            Chapter chapter = new Chapter(chapterResponse.getData().getChapterInfo().getChapterIndex(),
                    chapterResponse.getData().getChapterInfo().getChapterName(), text.toString());
            book.getChapters().add(chapter);

            nextChapter = chapterResponse.getData().getChapterInfo().getNextChapterId();
            nextChapterIndex++;
        }
        return book;
    }
}
