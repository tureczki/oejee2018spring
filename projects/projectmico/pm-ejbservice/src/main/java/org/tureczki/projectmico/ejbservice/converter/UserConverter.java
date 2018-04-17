package org.tureczki.projectmico.ejbservice.converter;

import javax.ejb.Local;
import org.tureczki.projectmico.ejbservice.domain.UserStub;
import org.tureczki.persistence.entity.User;

@Local
public interface UserConverter{
	UserStub to(User user);
}