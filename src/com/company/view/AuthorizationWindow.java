package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthorizationWindow {


    static JFrame frame = createFrame();
    private boolean save;

    public AuthorizationWindow() {
        save = false;


        JLabel label = new JLabel("Авторизация пользователя");

        JButton btnEnter= new JButton("Войти");
        JButton btnRegister = new JButton("Зарегестрироваться");
        JLabel lbl1 = new JLabel("Номер телефона:");
        JLabel lbl2 = new JLabel("Пароль:");
        JLabel lbl3 = new JLabel("Пин-код:");
        JTextField tx1 = new JTextField();
        JTextField tx2 = new JTextField();
        JTextField tx3 = new JTextField();


        btnEnter.setBounds(150, 350, 160, 25);
        btnRegister.setBounds(150, 400, 160, 25);
        lbl1.setBounds(10,100, 100, 25);
        lbl2.setBounds(10,180, 100, 25);
        lbl3.setBounds(10, 260,200, 30);

        tx3.setBounds(220,100, 100, 25);
        tx1.setBounds(220, 180, 100, 30);
        tx2.setBounds(220, 260,100, 30);

        label.setBounds(150, 10, 200, 30);


        frame.setLayout(null);
        frame.add(tx1);
        frame.add(tx2);
        frame.add(tx3);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(label);
        frame.add(btnEnter);
        frame.add(btnRegister);


        btnEnter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeUI di= new EmployeeUI();
                di.show();
            }
        });

        btnRegister.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationWindow di= new RegistrationWindow();
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
        JFrame.setVisible(true);
        return JFrame;
    }

}
