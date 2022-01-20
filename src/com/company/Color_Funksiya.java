package com.company;

import javax.swing.*;
import java.awt.*;

public class Color_Funksiya {
    asosiyOyna oyna;
    Color rang=Color.BLACK;
    public Color_Funksiya(asosiyOyna asosiyOyna){
        this.oyna=asosiyOyna;
    }


    public void textRangininiOzgartirish(){
        rang= JColorChooser.showDialog(null,"Text rangini o'zgartirish",rang,true);
        oyna.matn.setForeground(rang);
    }
    public void fonRangininiOzgartirish(){
        rang= JColorChooser.showDialog(null,"Text rangini o'zgartirish",rang,true);
        oyna.matn.setBackground(rang);
    }

}
