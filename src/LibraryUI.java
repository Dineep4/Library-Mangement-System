import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LibraryUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Library Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton addBtn = new JButton("Add Book");
        JButton viewBtn = new JButton("View Books");
        JButton exitBtn = new JButton("Exit");

        addBtn.setPreferredSize(new Dimension(150, 40));
        viewBtn.setPreferredSize(new Dimension(150, 40));
        exitBtn.setPreferredSize(new Dimension(150, 40));

        // ADD BOOK BUTTON
        addBtn.addActionListener((ActionEvent e) -> {
            BookService.addBook();
        });

        // VIEW BOOK BUTTON
        viewBtn.addActionListener((ActionEvent e) -> {
            BookService.viewBooks();
        });

        // EXIT BUTTON
        exitBtn.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        frame.add(addBtn);
        frame.add(viewBtn);
        frame.add(exitBtn);

        frame.setVisible(true);
    }
}