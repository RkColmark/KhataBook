package com.IRonak.KhataBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IRonak.KhataBook.Entity.MoneyManager;

@Repository    
public interface MoneyManagerRepository  extends JpaRepository<MoneyManager, Integer> {
}
