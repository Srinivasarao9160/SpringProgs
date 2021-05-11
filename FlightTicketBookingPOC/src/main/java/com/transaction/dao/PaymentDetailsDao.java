package com.transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.entity.PaymentDetails;

public interface PaymentDetailsDao extends JpaRepository<PaymentDetails, Integer>{

}
