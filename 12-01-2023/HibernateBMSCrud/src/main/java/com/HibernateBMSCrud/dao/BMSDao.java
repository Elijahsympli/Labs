package com.HibernateBMSCrud.dao;

public interface BMSDao {
public void Open(); //add student inDB
public void DepBal();//update existing data from DB
public void WitBal();//delete data from DB
public void ShowBal();//fetch data from DB
public void PinChange();
public void CloseAccount();
}
