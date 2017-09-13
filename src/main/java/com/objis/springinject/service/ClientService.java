package com.objis.springinject.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.objis.springinject.dao.IClientDao;
import com.objis.springinject.domaine.Client;

@Named(value = "service")
public class ClientService implements IServiceClient {
	@Inject

	IClientDao dao;

	public IClientDao getDao() {
		return dao;
	}

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	public ClientService(IClientDao dao) {
		super();
		this.dao = dao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.objis.springinject.service.IServiceClient#insererClient(com.objis.
	 * springinject.domaine.Client)
	 */
	public String insererClient(Client client) {
		return dao.ajouterClient(client);
	}

}
