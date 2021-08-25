package com.kyc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kyc.dao.KycDao;
import com.kyc.entity.Kyc;
import com.kyc.service.KycService;

public class KycServiceImpl implements KycService {
	@Autowired
	private KycDao dao;
	
	public KycDao getDao() {
		return dao;
	}

	public void setDao(KycDao dao) {
		this.dao = dao;
	}
	@Override
	public List<Kyc> fetch() {
		List<Kyc> searchResult = (List<Kyc>) dao.fetch();
		return searchResult;
	}

	@Override
	@Transactional
	public void save(Kyc Kyc) {
		System.out.println("service impl :"+Kyc);
		dao.create(Kyc);
		
	}

}
