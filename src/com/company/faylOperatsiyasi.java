package com.company;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class faylOperatsiyasi {
    asosiyOyna oyna;
    public  faylOperatsiyasi(asosiyOyna asosiyOyna){
        this.oyna=asosiyOyna;
    }
    public void yangiFayl(){
        oyna.matn.setText("");

    }
    public void faylOchish() {
        JFileChooser chooser = new JFileChooser();
        int d = chooser.showOpenDialog(null);
        if (d == JFileChooser.APPROVE_OPTION) {
            try {
                Scanner scanner = new Scanner(chooser.getSelectedFile());
               oyna.matn.setText(scanner.nextLine());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }public void faylSaqlash()  {
        JFileChooser chooser=new JFileChooser();
        int d=chooser.showSaveDialog(null);
        if(d==JFileChooser.APPROVE_OPTION)
            try {
                PrintWriter f=new PrintWriter(chooser.getSelectedFile());
                f.print(oyna.matn.getText());
                f.close();
            }catch (FileNotFoundException e){

            }
    }
    public void faylniYopish(){
        System.exit(JFrame.EXIT_ON_CLOSE);
      //  oyna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
