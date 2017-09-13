package com.objis.springinject.dao;

import javax.inject.Named;

import org.springframework.stereotype.Repository;

import com.objis.springinject.domaine.Client;

@Named
public class ClientDaoImpl implements IClientDao{

	public String ajouterClient(Client client) {
		// TODO Auto-generated method stub
		return "Creation Client";
	}

	

}
