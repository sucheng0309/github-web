package com.boc.smp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cost {
	
//	BigDecimal costId = null;
	
	Integer costId = null;
	String costName = null;
    Date createDate = null;
	
    
   

	

	public Date getCreateDate() {
		return createDate;
	}





	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}





	public String getCostName() {
		return costName;
	}


	


	public Integer getCostId() {
		return costId;
	}





	public void setCostId(Integer costId) {
		this.costId = costId;
	}





	public void setCostName(String costName) {
		this.costName = costName;
	}





	

	



//	public int getCostId() {
//		return costId;
//	}
//
//
//
//
//
//	public void setCostId(int costId) {
//		this.costId = costId;
//	}

}
