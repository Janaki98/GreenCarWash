package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.CustomerDetails;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao custDao;

	public void setLoginDao(CustomerDao custDao) {
		this.custDao = custDao;
	}

	@Override
	public boolean login(CustomerDetails custDetails) throws Exception {
		// TODO Auto-generated method stub

		// UsernameValidUtils.usernameValidation(user.getUsername());

		boolean result = custDao.findUser(custDetails);
		if (!result) {
			throw new Exception("error");

		} else
			return true;

	}

}
