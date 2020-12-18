package com.company;

import com.company.controller.*;
import com.company.model.Container;
import com.company.view.*;

public class Injector {
    public void init() {
        CustomerUI customerUI= new CustomerUI();
        EmployeeUI employeeUI= new EmployeeUI();
        ChangeThePriceFuelWindow changeThePriceFuelWindow= new ChangeThePriceFuelWindow();
        ChangeThePriceProductWindow changeThePriceProductWindow= new ChangeThePriceProductWindow();
        OrderFuelWindow orderFuelWindow= new OrderFuelWindow();
        OrderProductWindow orderProductWindow= new OrderProductWindow();
        PurchaseFuelWindow purchaseFuelWindow= new PurchaseFuelWindow();
        ReplenishBalanceWindow replenishBalanceWindow=new ReplenishBalanceWindow();
        ReplenishFuelWindow replenishFuelWindow=new ReplenishFuelWindow();
        ReplenishProductWindow replenishProductWindow= new ReplenishProductWindow();
        RegistrationWindow registrationWindow= new RegistrationWindow();
        AuthorizationWindow authorizationWindow=new AuthorizationWindow();
        IUser iUser1=new CustomerUI();
        IUser iUser2= new EmployeeUI();
        AccountantService accountantService= new AccountantService();
        BalanceReplenishmentService balanceReplenishmentService=new BalanceReplenishmentService();
        CashService cashService=new CashService();
        CustomerController customerController=new CustomerController();
        EmployeeController employeeController=new EmployeeController();
        FuelControlService fuelControlService =new FuelControlService();
        ProductControlService productControlService= new ProductControlService();
  Container container= new Container(iUser1,
          iUser2,
          accountantService,
          balanceReplenishmentService,
          cashService,
          customerController,
          employeeController,
          fuelControlService,
          productControlService);
    }
}
