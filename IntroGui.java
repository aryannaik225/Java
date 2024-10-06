import javax.swing.*;

class IntroGui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "Oh! So you are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("And how tall are you?"));
        JOptionPane.showMessageDialog(null, "Great you are "+height+" cms tall");
    }
}
