package bookclient;

import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientBookApp {
	private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final HttpClient httpClient = HttpClients.createDefault();
    private static final String baseURL = "http://localhost:8080/books";

    public String createBook(BookModel book) throws Exception {
        HttpPost request = new HttpPost(baseURL);
        StringEntity entity = new StringEntity(objectMapper.writeValueAsString(book));
        entity.setContentType("application/json");
        request.setEntity(entity);
        HttpResponse response = httpClient.execute(request);
        return EntityUtils.toString(response.getEntity());
    }

    public BookModel[] getAllBooks() throws Exception {
        HttpGet request = new HttpGet(baseURL);
        HttpResponse response = httpClient.execute(request);
        return objectMapper.readValue(response.getEntity().getContent(), BookModel[].class);
    }

    public BookModel getBookByIsbn(String isbn) throws Exception {
        HttpGet request = new HttpGet(baseURL + "/" + isbn);
        HttpResponse response = httpClient.execute(request);
        return objectMapper.readValue(response.getEntity().getContent(), BookModel.class);
    }
}
