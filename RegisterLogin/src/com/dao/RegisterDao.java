package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.register.RegisterUser;

@Component
public class RegisterDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public RegisterUser createRegister(RegisterUser register) {
		
		hibernateTemplate.saveOrUpdate(register);
		
		return register;
/*	RegisterUser ru =hibernateTemplate.get(RegisterUser.class, register.getEmail());
	if(ru == null) {
		hibernateTemplate.save(register);
		return "Succesfully registered";}
	else
		return "Already registered";
	*/
	}
	

	@SuppressWarnings("deprecation")
	public boolean checDuplicate(String email) {
	
		boolean isCheck= false;
		
		String sqlQuery= "from RegisterUser u where u.email=?";
		try {
		
		List<?> userObj = (List<?>) hibernateTemplate.find(sqlQuery, email);
		
		if(userObj !=null && userObj.size() > 0) {
			
			isCheck =true;
		}
		}
		catch(Exception e) {
		isCheck = false;
		System.out.println(e.getMessage());
		
		}
		
		return isCheck;
	}

	public List<RegisterUser> getRegsiterUsers(){
		
		List<RegisterUser> register=this.hibernateTemplate.loadAll(RegisterUser.class);
		return register;
		
	}
	
	@Transactional
	public void delete(int rid) {
		RegisterUser r = this.hibernateTemplate.load(RegisterUser.class, rid);
		this.hibernateTemplate.delete(r);
	}
	
	public RegisterUser getRegisterUser(int rid) {
	
		return this.hibernateTemplate.get(RegisterUser.class, rid);
		
		
		
	}
	
	/*
	 * public RegisterUser update(int rid) { RegisterUser r =
	 * this.hibernateTemplate.load(RegisterUser.class, rid);
	 * this.hibernateTemplate.update(r); return r; }
	 */

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@SuppressWarnings( { "deprecation" } )
    public boolean findUser(String email, String password) {
        boolean isValidUser = false;
        String sqlQuery = "from RegisterUser u where u.email=? and u.password=?";
        try {
            List<?> userObj = (List<?>) hibernateTemplate.find(sqlQuery, email, password);
            if(userObj != null && userObj.size() > 0) {
              
            	
                isValidUser = true;
            }
        } catch(Exception e) {
            isValidUser = false;
            System.out.println(e.getMessage());
        }
        return isValidUser;
    }
	
	@Transactional
	public RegisterUser updateReg(RegisterUser register) {
		System.out.println("RegisterDao.updateReg()");
		this.hibernateTemplate.update(register);
		return register;
		
	}
}



	

	

