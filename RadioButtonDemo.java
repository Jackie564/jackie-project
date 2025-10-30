import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    private JLabel imageLabel;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private ButtonGroup group;

    public RadioButtonDemo() {
        super("RadioButtonDemo");
        setLayout(new FlowLayout());

        // Creating radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group them so only one can be selected
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Adding buttons to the window
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

        // Adding event listeners
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Label for displaying image
        imageLabel = new JLabel();
        add(imageLabel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pet = "";
        String imagePath = "";

        if (e.getSource() == birdButton) {
            pet = "Bird";
            imagePath = "bird.png";
        } else if (e.getSource() == catButton) {
            pet = "Cat";
            imagePath = "cat.png";
        } else if (e.getSource() == dogButton) {
            pet = "Dog";
            imagePath = "dog.png";
        } else if (e.getSource() == rabbitButton) {
            pet = "Rabbit";
            imagePath = "rabbit.png";
        } else if (e.getSource() == pigButton) {
            pet = "Pig";
            imagePath = "pig.png";
        }

        // Showing message box
        JOptionPane.showMessageDialog(this, "You selected: " + pet);

        // Display image 
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
