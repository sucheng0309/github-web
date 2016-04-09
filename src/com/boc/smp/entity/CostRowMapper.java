package com.boc.smp.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CostRowMapper implements RowMapper{

	
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Cost cost = new Cost();
		
	//	cost.setCostId(rs.getBigDecimal("CostId"));
		
		cost.setCostId(rs.getInt("CostId"));
		
		cost.setCostName(rs.getString("CostName"));
		
		return cost;
	}

}
