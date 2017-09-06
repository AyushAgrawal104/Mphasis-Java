package com;

import java.io.Serializable;
import java.util.Calendar;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PKGen implements IdentifierGenerator{
	
	@Override
	public Serializable generate(SessionImplementor si, Object obj) throws HibernateException {
		
		int year;
		int month;
		int day;
		Calendar cl=Calendar.getInstance();
		
		
		year=cl.get(Calendar.YEAR);
		month=cl.get(Calendar.MONTH);
		day=cl.get(Calendar.DATE);
		
		String key="ABC10"+year+""+(month+1)+""+day+"";
		
		return key+"2";
	}
	

}
