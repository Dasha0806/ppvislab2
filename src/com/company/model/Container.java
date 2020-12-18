package com.company.model;

import com.company.controller.*;
import com.company.view.CustomerUI;
import com.company.view.EmployeeUI;
import com.company.view.IUser;

public class Container {
  /*  protected CustomerUI customerUI;
    protected EmployeeUI employeeUI;
    protected CustomerController customerController;
    protected EmployeeController employeeController;
    protected FuelControlService fuelControlService;
    protected ProductControlService productControlService;
    protected AccountantService accountantService;
    protected CashService cashService;
    protected BalanceReplenishmentService balanceReplenishmentService;*/
    IUser iUser1=new CustomerUI();
    IUser iUser2= new EmployeeUI();
    AccountantService accountantService= new AccountantService();
    BalanceReplenishmentService balanceReplenishmentService=new BalanceReplenishmentService();
    CashService cashService=new CashService();
    CustomerController customerController=new CustomerController();
    EmployeeController employeeController=new EmployeeController();
    FuelControlService fuelControlService =new FuelControlService();
    ProductControlService productControlService= new ProductControlService();

    public Container(IUser iUser1, IUser iUser2, AccountantService accountantService, BalanceReplenishmentService balanceReplenishmentService, CashService cashService, CustomerController customerController, EmployeeController employeeController, FuelControlService fuelControlService, ProductControlService productControlService) {
        this.iUser1 = iUser1;
        this.iUser2 = iUser2;
        this.accountantService = accountantService;
        this.balanceReplenishmentService = balanceReplenishmentService;
        this.cashService = cashService;
        this.customerController = customerController;
        this.employeeController = employeeController;
        this.fuelControlService = fuelControlService;
        this.productControlService = productControlService;
    }

    
/*   public Container(CustomerUI customerUI, EmployeeUI employeeUI, CustomerController customerController, EmployeeController employeeController, FuelControlService fuelControlService, ProductControlService productControlService, AccountantService accountantService, CashService cashService, BalanceReplenishmentService balanceReplenishmentService) {
        this.customerUI = customerUI;
        this.employeeUI = employeeUI;
        this.customerController = customerController;
        this.employeeController = employeeController;
        this.fuelControlService = fuelControlService;
        this.productControlService = productControlService;
        this.accountantService = accountantService;
        this.cashService = cashService;
        this.balanceReplenishmentService = balanceReplenishmentService;
    }
*/
}
