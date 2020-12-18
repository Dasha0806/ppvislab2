package com.company.view;

import com.company.controller.ProductControlService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeUI implements IUser {
    public void replenishFuelProcessor(){};
    public void replenishProductProcessor(){};
    public void viewInformationAboutTheIncomeProcessor(){};
    public void orderFuelProcessor(){};
    public void orderProductProcessor(){};
    public void changeThePriceFuelProcessor(){};
    public void changeThePriceProductProcessor(){};
    public void sellFuelProcessor(){};
    public void sellProductProcessor(){};
    @Override
    public void createInterface(){};
    @Override
    public void recreateWithADifferentAccessLevel(){};
    static JFrame frame = createFrame();
    private boolean save;

    public EmployeeUI() {
        save = false;


        JLabel label = new JLabel("Меню-Работник");
       // JLabel label1 = new JLabel("Имя:");
        //JTextField tx = new JTextField();

        JButton btnReplenishProduct= new JButton("Пополнение товаров");
        JButton btnReplenishFuel = new JButton("Пополнение топлива");
       // JButton btnInformationAboutTheIncome = new JButton("Информация о доходе");
        JButton btnOrderProduct= new JButton("Заказ поставки товара");
        JButton btnOrderFuel = new JButton("Заказ поставки топлива");
        JButton btnChangeThePriceProduct = new JButton("Изменить цену на товар");
        JButton btnChangeThePriceFuel = new JButton("Изменить цену на топливо");



        btnReplenishProduct.setBounds(150, 100, 160, 25);
        btnReplenishFuel.setBounds(150, 140, 160, 25);
       // btnInformationAboutTheIncome.setBounds(150, 180, 160, 25);
        btnOrderProduct.setBounds(150, 180, 160, 25);
        btnOrderFuel.setBounds(150, 220, 160, 25);
        btnChangeThePriceProduct.setBounds(150, 260, 160, 25);
        btnChangeThePriceFuel.setBounds(150, 300, 160, 25);
        label.setBounds(150, 10, 200, 30);
        /*label1.setBounds(100, 60, 40, 30);
        tx.setBounds(180, 60, 200, 30);*/



        frame.setLayout(null);

        frame.add(label);
     //   frame.add(label1);
       // frame.add(tx);
        frame.add(btnReplenishProduct);
        frame.add(btnReplenishFuel);
       // frame.add(btnInformationAboutTheIncome);
        frame.add(btnOrderProduct);
        frame.add(btnOrderFuel);
        frame.add(btnChangeThePriceProduct);
        frame.add(btnChangeThePriceFuel);

        btnReplenishFuel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ReplenishFuelWindow di = new ReplenishFuelWindow();
                di.show();
            }
        });

        btnReplenishProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ReplenishProductWindow di = new ReplenishProductWindow();
                di.show();
            }
        });

        /*btnInformationAboutTheIncome.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ProductControlService di = new ProductControlService();
                di.show();
            }
        });*/
        btnOrderProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                OrderProductWindow di = new OrderProductWindow();
                di.show();
            }
        });
        btnOrderFuel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                OrderFuelWindow di = new OrderFuelWindow();
                di.show();
            }
        });

        btnChangeThePriceProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ChangeThePriceProductWindow di = new ChangeThePriceProductWindow();
                di.show();
            }
        });
        btnChangeThePriceFuel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ChangeThePriceFuelWindow di = new ChangeThePriceFuelWindow();
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
      //  JFrame.setVisible(true);
        return JFrame;
    }

}
