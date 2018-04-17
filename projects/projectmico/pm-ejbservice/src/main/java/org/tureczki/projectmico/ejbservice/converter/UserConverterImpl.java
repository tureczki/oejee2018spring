package org.tureczki.projectmico.ejbservice.converter;

import javax.ejb.Stateless;
import org.tureczki.projectmico.ejbservice.domain.UserStub;
import org.tureczki.persistence.entity.User;

@Stateless
public UserConverterImpl implements UserConverter{
	
	public UserConverterImpl(){ }
	
	@Override
	public UserStub to(User user){
		return new UserStub(user.getEmail(), user.Passwordhash(), user.getExperience(), user.getSubscriber(), user.getTheme(), user.getCurrency());
	}
	
}