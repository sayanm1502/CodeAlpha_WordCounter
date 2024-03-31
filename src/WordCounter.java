import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  

public class WordCounter extends JFrame implements ActionListener {  
    JLabel lb1, lb2;  
    JTextArea ta;  
    JButton countBtn, editBtn, clearBtn;  
    JScrollPane scrollPane;  

    WordCounter() {  
        super("Character Word Count Tool");  
        lb1 = new JLabel("Characters: ");  
        lb1.setBounds(50, 50, 100, 20);  
        lb1.setFont(new Font("Arial", Font.BOLD, 14)); // Set font
        
        lb2 = new JLabel("Words: ");  
        lb2.setBounds(50, 80, 100, 20);  
        lb2.setFont(new Font("Arial", Font.BOLD, 14)); // Set font
          
        ta = new JTextArea();  
        ta.setLineWrap(true); // Enable line wrapping
        ta.setWrapStyleWord(true); // Wrap at word boundaries
        ta.setFont(new Font("Arial", Font.PLAIN, 14)); // Set font
        scrollPane = new JScrollPane(ta); // Add a scroll pane to the text area
        scrollPane.setBounds(50, 110, 300, 200);  

        countBtn = new JButton("Count");  
        countBtn.setBounds(50, 320, 80, 30);  
        countBtn.addActionListener(this);  
        countBtn.setFont(new Font("Arial", Font.PLAIN, 14)); // Set font
        countBtn.setBackground(new Color(52, 152, 219)); // Set background color
        countBtn.setForeground(Color.WHITE); // Set text color
        
        editBtn = new JButton("Edit");  
        editBtn.setBounds(140, 320, 80, 30);  
        editBtn.addActionListener(this);  
        editBtn.setFont(new Font("Arial", Font.PLAIN, 14)); // Set font
        editBtn.setBackground(new Color(52, 152, 219)); // Set background color
        editBtn.setForeground(Color.WHITE); // Set text color
  
        clearBtn = new JButton("Clear");  
        clearBtn.setBounds(230, 320, 80, 30);  
        clearBtn.addActionListener(this);  
        clearBtn.setFont(new Font("Arial", Font.PLAIN, 14)); // Set font
        clearBtn.setBackground(new Color(52, 152, 219)); // Set background color
        clearBtn.setForeground(Color.WHITE); // Set text color
  
        getContentPane().setBackground(new Color(236, 240, 241)); // Set background color for the main page
        
        add(lb1); add(lb2); add(scrollPane); add(countBtn); add(editBtn); add(clearBtn);  
          
        setSize(400, 400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  

    public void actionPerformed(ActionEvent e) {  
        if (e.getSource() == countBtn) {  
            String text = ta.getText();  
            lb1.setText("Characters: " + text.length());  
            String words[] = text.split("\\s");  
            lb2.setText("Words: " + words.length);  
        } else if (e.getSource() == editBtn) {  
            // Add edit functionality here
        } else if (e.getSource() == clearBtn) {  
            ta.setText(""); // Clear the text area  
            lb1.setText("Characters: "); // Reset character count label  
            lb2.setText("Words: "); // Reset word count label  
        }  
    }  

    public static void main(String[] args) {  
        new WordCounter();  
    }  
}
