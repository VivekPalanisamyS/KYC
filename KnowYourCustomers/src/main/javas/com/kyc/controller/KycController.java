package com.kyc.controller;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kyc.entity.Kyc;
import com.kyc.service.KycService;
import com.kyc.util.KycUtil;

@Controller
@Component
public class KycController {
	private static final String ERROR_MESSAGE ="errMsg";
	private KycService kycservice;
	final Session session = KycUtil.getHibernateSession();
	public KycService getKycservice() {
		return kycservice;
	}
	public void setKycservice(KycService kycservice) {
		this.kycservice = kycservice;
	}
	@RequestMapping("login")
	public String showLoginPage() {
		return "login";
	}
	@RequestMapping("header")
	public String showHeaderPage() {
		return "header";
	}
	@RequestMapping("KYCInformation")
	public String showKYCInformationPage() {
		return "KYCInformation";
	}
	@RequestMapping("profile")
	public String showProfilePage() {
		return "profile";
	}
	@RequestMapping("home")
	public String showHomePage(ModelMap model) {
		//List<Kyc> Kyc=kycservice.fetch();
		List<Kyc> Kyc=session.createQuery("from Kyc").getResultList();
		System.out.println(Kyc.toString());
		model.addAttribute("Kyc", Kyc);
		return "home";
	}
	@RequestMapping(value = "saveprofile", method = RequestMethod.POST)
	public String saveProfilePage(@ModelAttribute("Kyc") Kyc Kyc, ModelMap model) {
		session.save(Kyc);
		model.addAttribute("KycCustId",Kyc.getCustId());
		return "KYCInformation";
	}
	@RequestMapping(value = "savekyc", method = RequestMethod.POST)
	public String saveKycPage(@RequestParam("KycCustId") int KycCustId,
			@RequestParam("kycCountry") String kycCountry,
			@RequestParam("identificationType") String identificationType,
			@RequestParam("identificationNumber") int identificationNumber,
			@RequestParam("occupationType") String occupationType,
			@RequestParam("designation") String designation,
			@RequestParam("salary") int salary,
			ModelMap model) {
		System.out.println(KycCustId);
		Kyc kyc = session.get(Kyc.class, KycCustId);
		System.out.println(kyc.getFirstName());
		kyc.setKycCountry(kycCountry);
		kyc.setIdentificationType(identificationType);
		kyc.setIdentificationNumber(identificationNumber);
		kyc.setOccupationType(occupationType);
		kyc.setDesignation(designation);
		kyc.setSalary(salary);
		session.saveOrUpdate(kyc);
		List<Kyc> Kyc1=session.createQuery("from Kyc").getResultList();
		model.addAttribute("Kyc", Kyc1);
		return "home";
	}
	@RequestMapping(value = "header1", method = RequestMethod.POST)
	public String Validateid(@RequestParam("userName") String userName, @RequestParam("password") String password, ModelMap model)
	{
		if(userName.equalsIgnoreCase("banker")&&password.equalsIgnoreCase("banker123"))
			{model.addAttribute("userName", userName); return "header";}
		else
		{model.addAttribute(ERROR_MESSAGE, "Invalid Credentials");return "login";}
	}
}
