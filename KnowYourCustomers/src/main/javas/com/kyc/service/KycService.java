package com.kyc.service;

import java.util.List;

import com.kyc.entity.Kyc;

public interface KycService {

	public List <Kyc> fetch();

	public void save(Kyc Kyc);
}
