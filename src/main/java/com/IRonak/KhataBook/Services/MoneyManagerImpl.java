package com.IRonak.KhataBook.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IRonak.KhataBook.Entity.MoneyManager;
import com.IRonak.KhataBook.Repository.MoneyManagerRepository;


@Service
public class MoneyManagerImpl implements MoneyManagerService {


    @Autowired
    MoneyManagerRepository moneyManagerRepository;

  
    public List<MoneyManager> findAll() {


        return moneyManagerRepository.findAll();
    }


	public void saveExpenses(MoneyManager data) {
		
		moneyManagerRepository.save(data);
		
	}


	public MoneyManager getMoneyManager(int id) {
		
		Optional<MoneyManager> moneymanager= moneyManagerRepository.findById(id);
		
		
		MoneyManager themoney=null;
		
		if (moneymanager.isPresent()) {
			themoney = moneymanager.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + id);
		}
		
		return themoney;
	}


	public void deleteExpenses(int id) {
		 
		moneyManagerRepository.deleteById(id);
	}
}
		 
	




