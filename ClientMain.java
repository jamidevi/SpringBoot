package bookclient;

public class ClientMain {
	
	public static void main(String[] args) throws Exception {
        ClientBookApp client = new ClientBookApp();

        BookModel book1 = new BookModel("1234", "C Programming");
        String msg = client.createBook(book1);
        System.out.println(msg);

        BookModel book2 = new BookModel("1235", "Python Programming");
        msg = client.createBook(book2);
        System.out.println(msg);

        BookModel book3 = new BookModel("1236", "Java Programming");
        msg = client.createBook(book3);
        System.out.println(msg);

        BookModel[] books = client.getAllBooks();
        for (BookModel bk : books) {
            System.out.println("ISBN: " + bk.getIsbn() + ", Title: " + bk.getTitle());
        }

        BookModel myBook = client.getBookByIsbn("1234");
        System.out.println("ISBN: " + myBook.getIsbn() + ", Title: " + myBook.getTitle());
    }
}
		


