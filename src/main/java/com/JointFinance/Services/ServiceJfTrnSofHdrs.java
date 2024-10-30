package com.JointFinance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JointFinance.Models.JfTrnSofHdrs;
import com.JointFinance.Repository.IJfTrnSofHdrsRepository;

@Service
public class ServiceJfTrnSofHdrs {
	@Autowired
	IJfTrnSofHdrsRepository repoJTSH;
	
	public List<JfTrnSofHdrs> getJtshAll(){
		return repoJTSH.findAll();
	}
	
	public Optional<JfTrnSofHdrs> getJtshSingle(String code){
		return repoJTSH.findById(code);
	}
	
	public List<JfTrnSofHdrs> getJtshBySofcode(String code){
		return repoJTSH.findByJtshSofCodeContaining(code);
	}
	
	public List<JfTrnSofHdrs> getJtshByAlias(String alias){
		return repoJTSH.findByJtshAliasContaining(alias);
	}
	
	public List<JfTrnSofHdrs> getJtshByStatus(String status){
		return repoJTSH.findByJtshJfStatusContaining(status);
	}
	
	public List<JfTrnSofHdrs> getJtshByPlatform(String platform){
		return repoJTSH.findByJtshPlatformContaining(platform);
	}
	
	
	public String saveUpdateTrSofHdrs(JfTrnSofHdrs sofhdr) {
		repoJTSH.save(sofhdr);
		return "Submit Successfully";
	}

}
