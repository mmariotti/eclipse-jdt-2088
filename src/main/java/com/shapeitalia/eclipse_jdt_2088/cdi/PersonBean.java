package com.shapeitalia.eclipse_jdt_2088.cdi;

import javax.persistence.NamedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.shapeitalia.eclipse_jdt_2088.jpa.Person;
import com.shapeitalia.eclipse_jdt_2088.jpa.Person_;

@NamedQuery(name = "TRIGGER", query = PersonBean.QUERY)
//@NamedQuery(name = "TRIGGER", query = "no error!")
public class PersonBean {
	public static final String QUERY = "I'm here to trigger an eclipse bug :)";

	public static final Predicate byPersonId(CriteriaBuilder b, Root<Person> r, int id) {
		return b.equal(r.get(Person_.id), id);
	}
}
