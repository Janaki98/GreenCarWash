package com.example.demo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerDetails;

@Repository
public class CustomerDaoImpl implements CustomerDao {
@Autowired
private MongoTemplate mongoTemplate;
	@Override
	public boolean findUser(CustomerDetails user) {
		// TODO Auto-generated method stub
		System.out.println(user.getPassword());
//		try {
//			boolean result= mongoTemplate.findOne({"userName" : user.getUserName()})
//		}
		return false;
	}


}
