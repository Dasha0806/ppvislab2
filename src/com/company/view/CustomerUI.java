package com.company.view;
import com.company.controller.BalanceReplenishmentService;
import com.company.controller.ProductControlService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class CustomerUI implements IUser {


    public void purchaseFuelProcessor(){};
    public void purchaseProductProcessor(){};
    public void replenishBalanceProcessor(){};
    @Override
    public void recreateWithADifferentAccessLevel(){};
    @Override
    public void createInterface(){};

    static JFrame frame = createFrame();
    private boolean save;

    public CustomerUI() {
        save = false;


        JLabel label = new JLabel("Меню-Клиент");

        JButton btnPurchaseProduct= new JButton("Покупка товара");
        JButton btnPurchaseFuel = new JButton("Покупка топлива");
        JButton btnBalanceReplenishment = new JButton("Пополнение баланса");


        btnPurchaseProduct.setBounds(150, 100, 160, 25);
        btnPurchaseFuel.setBounds(150, 200, 160, 25);
        btnBalanceReplenishment.setBounds(150, 300, 160, 25);
        label.setBounds(150, 50, 200, 30);


        frame.setLayout(null);

        frame.add(label);
        frame.add(btnPurchaseProduct);
        frame.add(btnPurchaseFuel);
        frame.add(btnBalanceReplenishment);

        btnPurchaseProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               PurchaseProductWindow di= new PurchaseProductWindow();
                di.show();
            }
        });

       btnPurchaseFuel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               PurchaseFuelWindow di= new PurchaseFuelWindow();
                di.show();
            }
        });

        btnBalanceReplenishment.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              ReplenishBalanceWindow di =new ReplenishBalanceWindow();
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
