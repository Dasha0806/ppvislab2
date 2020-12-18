package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReplenishProductWindow {
    static JFrame frame = createFrame();
    private boolean save;

    public ReplenishProductWindow() {
        save = false;


        JLabel label = new JLabel("Пополнение товара");
        JLabel lbl1 = new JLabel("Имя:");

        JLabel lbl3 = new JLabel("Название товара:");
        JLabel lbl4 = new JLabel("Цена ттовара:");
        JLabel lbl5 = new JLabel("Количество:");

        JTextField tx1 = new JTextField();

        JTextField tx3 = new JTextField();
        JTextField tx4 = new JTextField();
        JTextField tx5 = new JTextField();

        JButton btnConfirm = new JButton("Подтвердить пополнение");


        btnConfirm.setBounds(100, 400, 200, 25);
        lbl1.setBounds(100,50, 100, 25);

        tx3.setBounds(100,190, 100, 25);
        tx4.setBounds(100,270, 100, 25);
        tx5.setBounds(100,355, 100, 25);
        tx1.setBounds(140, 50, 100, 30);

        lbl3.setBounds(100, 150,200, 30);
        lbl4.setBounds(100, 230,200, 30);
        lbl5.setBounds(100, 315,200, 30);
        label.setBounds(150, 10, 200, 30);

        frame.setLayout(null);

        frame.add(label);
        frame.add(tx1);

        frame.add(tx3);
        frame.add(tx4);
        frame.add(tx5);
        frame.add(lbl1);

        frame.add(lbl3);
        frame.add(lbl4);
        frame.add(lbl5);
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
