import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BookService {

    // ✅ ADD BOOK METHOD

    public static void addBook() {

        String title = JOptionPane.showInputDialog("Enter Book Title:");
        String author = JOptionPane.showInputDialog("Enter Author Name:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity:"));

        MongoCollection<Document> collection =
                MongoDBConnection.getDatabase().getCollection("books");

        Document book = new Document("title", title)
                .append("author", author)
                .append("quantity", quantity);

        collection.insertOne(book);

        JOptionPane.showMessageDialog(null, "✅ Book added successfully!");
    }

    // ✅ VIEW BOOKS METHOD
    public static void viewBooks() {

        MongoCollection<Document> collection =
                MongoDBConnection.getDatabase().getCollection("books");

        StringBuilder result = new StringBuilder();

        for (Document doc : collection.find()) {

            result.append("Title: ").append(doc.getString("title")).append("\n");
            result.append("Author: ").append(doc.getString("author")).append("\n");
            result.append("Quantity: ").append(doc.getInteger("quantity")).append("\n");
            result.append("-------------------------\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}