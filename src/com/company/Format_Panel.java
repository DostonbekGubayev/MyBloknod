package com.company;

import javax.swing.*;
import java.awt.*;

public class Format_Panel extends JPanel {
    JList fontRoyhat,sizeRoyhat;
    static String fontNomlari[]={"Arial","Arial Black","Alegrian"};
    static Font fontlar[];

    asosiyOyna oyna;
    public Format_Panel(asosiyOyna asosiyOyna){
        this.oyna=asosiyOyna;
        fontRoyhat=new JList(fontNomlari);
    }

    public void formatOzgartirish(){

    }
}
