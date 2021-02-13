package com.flora.myedit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * @author Flora on 2020/12/21.
 */
public class FileWindow extends JFrame implements ActionListener, Runnable {

    Thread complier = null;
    Thread run_prom = null;
    boolean bn = true;
    CardLayout mycard;

    File file_saved = null;
    JButton button_input_txt, button_complier_text, button_complier, button_run_prom,button_see_doswin;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void run() {

    }
}
