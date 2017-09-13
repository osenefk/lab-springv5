package com.objis.springinject.conteneur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.objis.springinject.dao.ClientDaoImpl;
import com.objis.springinject.service.ClientService;

@Configuration
public class MonConteneur {
	@Bean
	public ClientDaoImpl dao() {
		return new ClientDaoImpl();
	}

	@Bean
	public ClientService service() {

		return new ClientService(dao());
	}
}