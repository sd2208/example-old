import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JsonReader {

    public static void main(String args[]) {
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader()
            .getResourceAsStream("680e619a-e029-4dfd-9274-87a41483fccb.json")) {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            List<Map<?, ?>> books = Arrays.asList(mapper.readValue(inputStream, Map[].class));
            for (Map<?, ?> book : books
            ) {
                book.remove("repo_url");
                // print map entries
                for (Map.Entry<?, ?> entry : book.entrySet()) {
                    System.out.println(entry.getKey() + "=" + entry.getValue());
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
