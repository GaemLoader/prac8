import javax.swing.*;
import java.awt.*;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
class MyFirstGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Мое первое GUI приложение");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Привет МИР!");
        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

class MySecondGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Мое второе GUI приложение");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label1 = new JLabel("Первая панель");
        JLabel label2 = new JLabel("Вторая панель");
        label1.setForeground(Color.RED);
        label2.setForeground(Color.BLUE);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label2.setFont(new Font("Arial", Font.BOLD, 20));
        panel1.add(label1);
        panel2.add(label2);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

class MyThirdGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Мое третье GUI приложение");
        JPanel panel = new JPanel();
        ImageIcon image1 = new ImageIcon("image1.jpg");
        ImageIcon image2 = new ImageIcon("image2.jpg");
        JLabel label1 = new JLabel("Первое изображение", image1, JLabel.LEFT);
        JLabel label2 = new JLabel("Второе изображение", image2, JLabel.RIGHT);

        //        label2.setPreferredSize(new Dimension(200, 200));
//        label1.setPreferredSize(new Dimension(200, 200));
        label1.setHorizontalTextPosition(JLabel.LEFT);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.RIGHT);
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        panel.add(label1);
        panel.add(label2);
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}