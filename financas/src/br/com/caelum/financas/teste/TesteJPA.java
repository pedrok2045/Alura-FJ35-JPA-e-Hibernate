package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;

public class TesteJPA {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("financas").createEntityManager();
		Conta conta = new Conta();
		
		conta.setAgencia("ag");
		conta.setBanco("CEF");
		conta.setNumero("012454");
		conta.setTitular("Jao");
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
