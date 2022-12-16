package com.example.keyboard;

import javafx.event.ActionEvent;
//import javafx.event.Event;
import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.input.MouseEvent;


public class HelloController {
    public boolean capsOn = false;
    public boolean shift = true;
    @FXML
    TextField tx;
    public void capsButton (ActionEvent e)
    {


            if (capsOn) capsOn = false;
            else capsOn= true;

    }
    public void shiftButton (ActionEvent e)
    {
        if (shift) shift = false;
        else shift = true;
    }
    public void spaceButton (ActionEvent e)
    {
        tx.setText(tx.getText()+ " ");
        shift = true;
    }
    public void tabButton (ActionEvent e)
    {
        tx.setText(tx.getText()+ "       ");
        shift = true;
    }
    public void DeleteButton(ActionEvent e)
    {
        tx.setText(" ");
        shift = true;
    }
    public void btnA (ActionEvent e)
    {
        if (capsOn || !shift )
        {
            tx.setText(tx.getText()+"A");
            shift = true;
        }

        else
        {
            tx.setText(tx.getText()+"a");
        }
    }
    public void btnB (ActionEvent e)
    {
        if (capsOn || !shift){
            tx.setText(tx.getText()+"B");
            shift = true;
        }
        else {
            tx.setText(tx.getText()+"b");
        }
    }  public void btnC (ActionEvent e)
    {
        if (capsOn || !shift ) {
            tx.setText(tx.getText() + "C");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"c");
        }
    }  public void btnD (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"D");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"d");
        }
    }  public void btnE (ActionEvent e)
    {
        if (capsOn || !shift)

        {
            tx.setText(tx.getText()+"E");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"e");
        }
    }  public void btnF (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"F");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"f");
        }
    }  public void btnG (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"G");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"g");
        }
    }  public void btnH (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"H");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"h");
        }
    }  public void btnI (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"I");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"i");
        }
    }  public void btnJ (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"J");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"j");
        }
    }  public void btnK (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"K");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"k");
        }
    }  public void btnL (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"L");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"l");
        }
    }  public void btnM (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"M");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"m");
        }
    }  public void btnN (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"N");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"n");
        }
    }
    public void btnO (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"O");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"o");
        }
    }
    public void btnP (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"P");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"p");
        }
    }  public void btnQ (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"Q");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"q");
        }
    }  public void btnR (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"R");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"r");
        }
    }  public void btnS (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"S");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"s");
        }
    }  public void btnT (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"T");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"t");
        }
    }  public void btnU (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"U");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"u");
        }
    }  public void btnV (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"V");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"v");
        }
    }  public void btnW (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"W");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"w");
        }
    }  public void btnX (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"X");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"x");
        }
    }  public void btnY (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"Y");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"y");
        }
    }  public void btnZ (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"Z");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"z");
        }
    }
    public void RightSButton (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"{");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"[");
        }
    }
    public void LeftSButton (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"}");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"]");
        }
    }
    public void slashButton (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"|");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"/");
        }
    }
    public void semiColonButton (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+":");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+";");
        }
    }
    public void apstButton (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+ '"');
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+"'");
        }
    }
    public void greaterButton (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+"<");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+",");
        }
    }
    public void lessButton (ActionEvent e)
    {
        if (capsOn || !shift)
        {
            tx.setText(tx.getText()+">");
            shift = true;
        }
        else
        {
            tx.setText(tx.getText()+".");
        }
    }
    public void btn1 (ActionEvent e)
    {
       if (shift)
       {
           tx.setText(tx.getText()+ "1");
       }
       else
       {
           tx.setText(tx.getText()+ "!");
           shift = true;
       }

    }

    public void btn2 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "2");
        }
        else
        {
            tx.setText(tx.getText()+ "@");
            shift = true;
        }

    }
    public void btn3 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "3");
        }
        else
        {
            tx.setText(tx.getText()+ "#");
            shift = true;
        }

    }
    public void btn4 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "4");

        }
        else
        {
            tx.setText(tx.getText()+ "$");
            shift = true;
        }

    }

    public void btn5 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "5");
        }
        else
        {
            tx.setText(tx.getText()+ "%");
            shift = true;
        }

    }

    public void btn6 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "6");

        }
        else
        {
            tx.setText(tx.getText()+ "^");
            shift = true;
        }

    }
    public void btn7 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "7");
        }
        else
        {
            tx.setText(tx.getText()+ "&");
            shift = true;
        }

    }
    public void btn8 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "8");
        }
        else
        {
            tx.setText(tx.getText()+ "*");
            shift = true;
        }

    }
    public void btn9 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "9");
        }
        else
        {
            tx.setText(tx.getText()+ "(");
            shift = true;
        }

    }
    public void btn0 (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+ "0");
        }
        else
        {
            tx.setText(tx.getText()+ ")");
            shift = true;
        }

    }
    public void btnMinus (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+"-");
        }
        else
        {
            tx.setText(tx.getText()+"_");
            shift = true;
        }
    }
    public void btnEqual (ActionEvent e)
    {
        if (shift)
        {
            tx.setText(tx.getText()+"=");
        }
        else
        {
            tx.setText(tx.getText()+"+");
            shift = true;
        }
    }

}