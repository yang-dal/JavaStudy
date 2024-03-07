package webcrawler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class JsoupCrawler {
    public static void main(String[] args) {
        String resultPath = "/Users/seungyeop-han/workspace/Java/IdeaProjects/My_First_Java/src/webcrawler";
        String fileName = "GeekNews_crawling";
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd_HHmmss");
        String formattedDatetime = now.format(formatter);
        String extention = "md";
        String filePath = String.format("%s/%s_%s.%s", resultPath, fileName, formattedDatetime, extention);
        // System.out.println(filePath);

        PrintWriter out = null;
        try {
            FileWriter fw = new FileWriter(filePath, true);
            out = new PrintWriter(fw, true);
        } catch (IOException e) {
            System.err.println("크롤링 중 에러 발생");
            e.printStackTrace();
        }

        String URL = "https://news.hada.io/";
        int articleCnt = 0;
        for (int i=1; i<4; i++) {
            String params = "?page=" + i;
            Connection conn = Jsoup.connect(URL+params);
            // System.out.println(URL+params);
            try {
                Document doc = conn.get();
                Elements elems = doc.select(".topictitle");
                // System.out.println(elems);
                if (out != null) {
                    for (Element elem: elems) {
                        out.println("## " + elem.text());
                        out.println("- link: " + elem.select("a[href]").attr("href"));
                    }
                }
            } catch (IOException e) {
                System.err.println("페이지 요청 중 에러 발생");
                e.printStackTrace();
            }
        } // end of for statement
    } // end of main method
}
