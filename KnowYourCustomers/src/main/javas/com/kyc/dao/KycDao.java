package com.kyc.dao;

import java.util.List;

import com.kyc.entity.Kyc;

public interface KycDao {

	List<Kyc> fetch();

	void create(Kyc Kyc);

}
