package com.kyc.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.kyc.dao.KycDao;
import com.kyc.entity.Kyc;
import com.kyc.util.KycUtil;
@Component
public class KycDaoImpl implements KycDao {

	final Session session = KycUtil.getHibernateSession();
	@SuppressWarnings("deprecation")
	@Override
	public List<Kyc> fetch() {
		List<Kyc> kyc=session.createQuery("from Kyc").getResultList();
		return kyc;
	}
	@Override
	public void create(Kyc Kyc) {
		System.out.println("Dao Impl:"+Kyc);
		session.save(Kyc);
		session.getTransaction().commit();
		KycUtil.shutdown();
	}

}
