package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchaseProductWindow {
    static JFrame frame = createFrame();
    private boolean save;

    public PurchaseProductWindow() {
        save = false;


        JLabel label = new JLabel("Покупка товара");
        JLabel lbl1 = new JLabel("Имя:");
        JLabel lbl2 = new JLabel("Баланс:");
        JLabel lbl3 = new JLabel("Количество:");

        JTextField tx1 = new JTextField();
        JTextField tx2 = new JTextField();
        JTextField tx3 = new JTextField();

        JButton btnConfirm = new JButton("Подтвердить покупку");


        btnConfirm.setBounds(100, 400, 160, 25);
        lbl1.setBounds(100,50, 100, 25);
        lbl2.setBounds(100,110, 100, 25);
        lbl3.setBounds(100,280, 100, 25);
        tx1.setBounds(140, 50, 100, 30);
        tx2.setBounds(160, 110,100, 30);
        tx3.setBounds(100, 300,200, 30);
        label.setBounds(150, 10, 200, 30);
//добавить выбрать товар
        frame.setLayout(null);

        frame.add(label);
        frame.add(tx1);
        frame.add(tx2);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(tx3);
        frame.add(btnConfirm);

        btnConfirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               CustomerUI di= new CustomerUI();
                di.show();
            }
        });
    }



    public void show() {
        frame.setVisible(true);
    }

    static JFrame createFrame() {
        JFrame JFrame = new JFrame();
        JFrame.setSize(500, 500);
        JFrame.setLocationRelativeTo(null);
        JFrame.setResizable(false);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JFrame.setVisible(true);
        return JFrame;
    }

}
