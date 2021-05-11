package com.transaction.util;

import java.util.HashMap;
import java.util.Map;

import com.transaction.exception.InsuffientAmountException;

public class PaymentUtils {
	private static Map<String, Double> paymentMap = new HashMap<>();
	
	static{
		paymentMap.put("acc1", 1000.0);
		paymentMap.put("acc2", 2000.0);
		paymentMap.put("acc3", 3000.0);
}
	
	public static boolean validateCreditLimit(String accNo,double paidAmount) {
		if(paidAmount>paymentMap.get(accNo)) {
			throw new InsuffientAmountException("Insuffient Fund........");
			}else {
				return true;
			}
	}

}
