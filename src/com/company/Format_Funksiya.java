package com.company;

import java.awt.*;

public class Format_Funksiya {
    asosiyOyna oyna;
    Font  Arial, Arial_Black, Algerian;
    String tanlanganFont;
    public Format_Funksiya(asosiyOyna asosiyOyna){
        this.oyna=asosiyOyna;
    }


    public void wordWrap(){
        if (oyna.wordWrapOn==false){
            oyna.wordWrapOn=true;
            oyna.matn.setLineWrap(true);
            oyna.matn.setWrapStyleWord(true);
            oyna.wrapItem.setText("Word Wrap: On");
        }else if (oyna.wordWrapOn==true){
            oyna.wordWrapOn=false;
            oyna.matn.setLineWrap(false);
            oyna.matn.setWrapStyleWord(false);
            oyna.wrapItem.setText("Word Wrap: Of");
        }
    }
    public void createFont(int fontSize){
        Arial=new Font("Arial",Font.PLAIN,fontSize);
        Arial_Black=new Font("Arial Black",Font.PLAIN,fontSize);
        Algerian=new Font("Algerian",Font.PLAIN,fontSize);
        setFont(tanlanganFont);
    }
    public void setFont(String font ){
        tanlanganFont =font;

        switch (tanlanganFont){
            case "Arial": oyna.matn.setFont(Arial);break;
            case "Arial Black": oyna.matn.setFont(Arial_Black); break;
            case "Algerian": oyna.matn.setFont(Algerian); break;
        }
    }
}
