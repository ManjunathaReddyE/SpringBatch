package com.techprimers.springbatchexample1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CategoryItems {

    @Id
    private Integer itemId;
    private String itemName;
    private String itemType;
    private Integer price;
    
 


	public CategoryItems() {
    }



	public CategoryItems(Integer itemId, String itemName, String itemType, Integer price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.price = price;
	}





    public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	

    public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	
	public String getItemType() {
		return itemType;
	}



	public void setItemType(String itemType) {
		this.itemType = itemType;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}




    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("itemId=").append(itemId);
        sb.append(", itemName='").append(itemName).append('\'');
        sb.append(", itemType='").append(itemType).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

   
}
