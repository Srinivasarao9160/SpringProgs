package com.ojas.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ojas.dao.UserRepo;
import com.ojas.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userdao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userdao.findByUsername(username);
		if(user == null)
			throw new UsernameNotFoundException("user 404");
		

		
		return new UserPrinciple(user);
	}

}

	
	


