package LetsGrowMore_JavaProgramming_04;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.setTitle("Text Editor");
        textEditor.setSize(800, 600);
        textEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textEditor.setVisible(true);
    }
}

