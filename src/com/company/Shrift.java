package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Shrift extends JFrame {
    private JMenuBar menuBar;
    private JMenu faylMenu;
    private JMenu editMenu;
    private JMenu formatMenu;
    private JMenu vidMenu;
    private JMenu helpMenu;
    private JMenuItem yangi;
    private JMenuItem ochish;
    private JMenuItem saqlash;
    private JMenuItem yopish;
    private JTextArea matn;

    public Shrift(){
        super("Bloknod");
        menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        faylMenu=new JMenu("File");
        editMenu=new JMenu("Edit");
        yangi=new JMenuItem("New File");
        ochish=new JMenuItem("Open File");
        saqlash=new JMenuItem("Save File");
        yopish=new JMenuItem("Close File");
        faylMenu.add(yangi);
        faylMenu.add(ochish);
        faylMenu.add(saqlash);
        faylMenu.add(yopish);
        menuBar.add(faylMenu);
        matn=new JTextArea();
        add(matn,"Center");

       yangi.setIconTextGap(4);
       yangi.setActionCommand("kommand");
       yangi.setToolTipText("Create new File");

        Hodisalar hodisalar=new Hodisalar();
        yangi.addActionListener(hodisalar);
        ochish.addActionListener(hodisalar);
        saqlash.addActionListener(hodisalar);
        yopish.addActionListener(hodisalar);

        setDefaultCloseOperation(3);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600, 400);


    }
    class Hodisalar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent hodisa) {
            if (hodisa.getSource().equals(yangi)) {
                matn.setText("");
            }else
                if (hodisa.getSource().equals(ochish)){
                    JFileChooser chooser=new JFileChooser();
                    int d=chooser.showOpenDialog(null);
                    if (d==JFileChooser.APPROVE_OPTION)
                    try {
                        Scanner scanner=new Scanner(chooser.getSelectedFile());
                        String joy=scanner.nextLine();
                        matn.setText(joy);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                } else if (hodisa.getSource().equals(saqlash)) {
                    JFileChooser chooser=new JFileChooser();
                    int d=chooser.showSaveDialog(null);
                    if (d==JFileChooser.APPROVE_OPTION) {
                        try {
                            PrintWriter f=new PrintWriter(chooser.getSelectedFile());
                            f.print(matn.getText());
                            f.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }else
                        System.exit(JFrame.EXIT_ON_CLOSE);
                }
        }
    }


}