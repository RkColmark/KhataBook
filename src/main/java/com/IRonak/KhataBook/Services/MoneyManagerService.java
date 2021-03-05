package com.IRonak.KhataBook.Services;

import java.util.List;
import java.util.Optional;

import com.IRonak.KhataBook.Entity.MoneyManager;

public interface MoneyManagerService {

    List<MoneyManager> findAll();

 public	void saveExpenses(MoneyManager data);

	MoneyManager getMoneyManager(int id);

	public void deleteExpenses(int id);

	

	
}


 