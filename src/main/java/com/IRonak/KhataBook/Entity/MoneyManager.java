package com.IRonak.KhataBook.Entity;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;  

import javax.persistence.*;


@Entity
@Table(name="moneymanager") 

public class MoneyManager {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id") 	
    private int id;
    

    @Column(name="Description")
    private String description;
 
    @Column(name = "Amount") 
    private int amount;
    
     
     
    
    
    
    
    public MoneyManager() {
		super();
	}

	public MoneyManager(int id, String description, int amount) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
}
