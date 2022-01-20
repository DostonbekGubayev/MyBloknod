package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class asosiyOyna extends JFrame implements ActionListener {
        boolean wordWrapOn=false;
        faylOperatsiyasi operatsiya=new faylOperatsiyasi(this);
        Format_Funksiya format=new Format_Funksiya(this);
        Color_Funksiya funksiya=new Color_Funksiya(this);
    JMenuBar menuBar;
    //Fayl mneu uchun

    JMenu faylMenu, editMenu, colorMenu;
    JMenuItem yangi, ochish, saqlash, yopish;

    //Format Menu uchun
    JMenu formatMenu,fontMenu;
    JMenuItem wrapItem, sizeItem, fontItem;

    //Font nomlari uchun
    JMenu menuFont;
    JMenuItem  Arial, Arial_Black, Algerian;
    //Font o'lchamlari uchun
    JMenu fontSize;
    JMenuItem size8, size12, size16, size20, size24, size28;
    //Rang uchun
    JMenu color;
    JMenuItem textRangi,fonRangi;

    JTextArea matn;

    asosiyOyna() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        faylYaratish();
        faylTahrirlash();
        formatYaratish();
        fontYaratish();
        fontOlchami();
        RangMuloqotOynasi();
//        format.tanlanganFont="Arial";
//        format.createFont(16);
//      format.wordWrap();


        matn = new JTextArea();
        add(new JScrollPane(matn), BorderLayout.CENTER);
    }

    public void faylYaratish() {
        faylMenu = new JMenu("File");
        yangi = new JMenuItem("New File");
        yangi.addActionListener(this);
        yangi.setActionCommand("New File");

        ochish = new JMenuItem("Open File");
        ochish.addActionListener(this);
        ochish.setActionCommand("Open File");

        saqlash = new JMenuItem("Save File");
        saqlash.addActionListener(this);
        saqlash.setActionCommand("Save File");

        yopish = new JMenuItem("Close File");
        yopish.addActionListener(this);
        yopish.setActionCommand("Close File");

        faylMenu.add(yangi);
        faylMenu.add(ochish);
        faylMenu.add(saqlash);
        faylMenu.add(yopish);
        menuBar.add(faylMenu);
    }

    public void formatYaratish() {
        formatMenu = new JMenu("Format");
        wrapItem = new JMenuItem("Word Wrap: Of");
        wrapItem.addActionListener(this);
        wrapItem.setActionCommand("Word Wrap");
        formatMenu.add(wrapItem);

       menuFont=new JMenu("Font");
       formatMenu.add(menuFont);

      fontSize=new JMenu("Font Size");
       formatMenu.add(fontSize);
       menuBar.add(formatMenu);
    }

    public void faylTahrirlash() {
        editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
    }

    public void fontOlchami() {

        size8 = new JMenuItem("8");
        size8.addActionListener(this);
        size8.setActionCommand("Size8");
        fontSize.add(size8);

        size12 = new JMenuItem("12");
        size12.addActionListener(this);
        size12.setActionCommand("Size12");
        fontSize.add(size12);

        size16 = new JMenuItem("16");
        size16.addActionListener(this);
        size16.setActionCommand("Size16");
        fontSize.add(size16);

        size20 = new JMenuItem("20");
        size20.addActionListener(this);
        size20.setActionCommand("Size20");
        fontSize.add(size20);

        size24 = new JMenuItem("24");
        size24.addActionListener(this);
        size24.setActionCommand("Size24");
        fontSize.add(size24);

        size28 = new JMenuItem("28");
        size28.addActionListener(this);
        size28.setActionCommand("Size28");
        fontSize.add(size28);
        fontSize = new JMenu();

//        fontMenu.add(fontSize);

    }

    public void fontYaratish() {
        Algerian = new JMenuItem("Algerian");
        Algerian.addActionListener(this);
        Algerian.setActionCommand("Algerian");
       menuFont.add(Algerian);

        Arial = new JMenuItem("Arial");
        Arial.addActionListener(this);
        Arial.setActionCommand("Arial");
        menuFont.add(Arial);

        Arial_Black = new JMenuItem("Arial Black");
        Arial_Black.addActionListener(this);
        Arial_Black.setActionCommand("Arial Black");
        menuFont.add(Arial_Black);
        menuFont = new JMenu("Font");


    }
    public void RangMuloqotOynasi(){
        color=new JMenu("Color");
        menuBar.add(color);
        fonRangi=new JMenuItem("Background");
        fonRangi.addActionListener(this);
        fonRangi.setActionCommand("Fon Rangi");
        color.add(fonRangi);

        textRangi=new JMenuItem("Text Color");
        textRangi.addActionListener(this);
        textRangi.setActionCommand("Text Color");
        color.add(textRangi);



    }


    @Override
    public void actionPerformed(ActionEvent hodisa) {
        String command = hodisa.getActionCommand();
        switch (command) {
            case "New File":operatsiya.yangiFayl();
                break;
            case "Open File":
                operatsiya.faylOchish();
                break;
            case "Save File":operatsiya.faylSaqlash(); break;
            case "Close File": operatsiya.faylniYopish(); break;
            case "Word Wrap": format.wordWrap(); break;
            case "Arial":format.setFont(command); break;
            case "Algerian":format.setFont(command);break;
            case "Arial Black":format.setFont(command);break;
            case "Size8": format.createFont(8);break;
            case "Size12": format.createFont(12);break;
            case "Size16": format.createFont(16);break;
            case "Size20": format.createFont(20);break;
            case "Size24": format.createFont(24);break;
            case "Size28": format.createFont(28);break;
            case "Fon Rangi": funksiya.fonRangininiOzgartirish();
            case "Text Color": funksiya.textRangininiOzgartirish();
        }
    }




}
