package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationWindow {
  static JFrame frame = createFrame();
    private boolean save;

    public RegistrationWindow() {
        save = false;


        JLabel label = new JLabel("Регистрация пользователя");
        JLabel lbl1 = new JLabel("Номер телефона:");
        JLabel lbl2 = new JLabel("Пароль:");
        JLabel lbl3 = new JLabel("ФИО:");
        JLabel lbl4 = new JLabel("Возраст:");
        JLabel lbl5 = new JLabel("Пол:");

        JTextField tx1 = new JTextField();
        JTextField tx2 = new JTextField();
        JTextField tx3 = new JTextField();
        JTextField tx4 = new JTextField();
        JTextField tx5 = new JTextField();

        JButton btnConfirm = new JButton("Подтвердить регистрацию");


        btnConfirm.setBounds(100, 400, 160, 25);
        lbl1.setBounds(10,50, 100, 25);
        lbl2.setBounds(10,110, 100, 25);
        lbl3.setBounds(10, 190,100, 30);
        lbl4.setBounds(10, 270,100, 30);
        lbl5.setBounds(10, 350,100, 30);
        tx1.setBounds(220, 50, 100, 30);
        tx2.setBounds(220, 110,100, 30);
        tx3.setBounds(220,190, 100, 25);
        tx4.setBounds(220,270, 100, 25);
        tx5.setBounds(220,350, 100, 25);


        label.setBounds(150, 5, 200, 30);
        frame.setLayout(null);

        frame.add(label);
        frame.add(tx1);
        frame.add(tx2);
        frame.add(tx3);
        frame.add(tx4);
        frame.add(tx5);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        frame.add(lbl5);
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
        //JFrame.setVisible(true);
        return JFrame;
    }
}
