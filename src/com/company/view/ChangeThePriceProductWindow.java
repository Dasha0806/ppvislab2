package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeThePriceProductWindow {
    static JFrame frame = createFrame();
    private boolean save;

    public ChangeThePriceProductWindow() {
        save = false;


        JLabel label = new JLabel("Изменить цену на товар");
        JLabel lbl1 = new JLabel("Имя:");
        //добавить выбрать товары

        JLabel lbl3 = new JLabel("Количество:");

        JTextField tx1 = new JTextField();

        JTextField tx3 = new JTextField();

        JButton btnConfirm = new JButton("Подтвердить изменения");


        btnConfirm.setBounds(100, 400, 160, 25);
        lbl1.setBounds(100,50, 100, 25);
        lbl3.setBounds(100,280, 100, 25);
        tx1.setBounds(140, 50, 100, 30);
        tx3.setBounds(100, 300,200, 30);
        label.setBounds(150, 10, 200, 30);
//добавить выбрать товар
        frame.setLayout(null);

        frame.add(label);
        frame.add(tx1);
        frame.add(lbl1);
        frame.add(lbl3);
        frame.add(tx3);
        frame.add(btnConfirm);

        btnConfirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeUI di= new EmployeeUI();
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
