import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            String urlString = "https://dantri.com.vn/the-gioi.htm";
            URL url = new URL(urlString);

            InputStream inputStream = url.openStream();
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            scanner.useDelimiter("\\A");
            String content = scanner.hasNext() ? scanner.next() : "";
            scanner.close();

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("<h3[^>]*><a[^>]*>(.*?)</a></h3>");
            Matcher matcher = pattern.matcher(content);

            System.out.println("Danh sách tin tức mới nhất:");
            while (matcher.find()) {
                String title = matcher.group(1);
                System.out.println("- " + title);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
