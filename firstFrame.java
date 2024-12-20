import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class firstFrame extends JFrame {
    ImageIcon frontImage;
    JLabel label;

    firstFrame() {
        
        label = new JLabel();
        label.setBounds(0, 0, 800, 850);
        try{
            ImageIcon pic = new ImageIcon(Main.class.getResource("frontFrame.jpg"));
            label.setIcon(pic);
            label.setOpaque(true);
        }catch(Exception e){
            System.out.println("image not found");
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(665, 850);
        this.setLayout(null);

        this.add(label);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

}
