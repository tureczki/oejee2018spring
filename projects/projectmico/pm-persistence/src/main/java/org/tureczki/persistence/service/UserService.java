package org.tureczki.persistence.service;

import org.tureczki.persistence.entity.User;
import javax.ejb.Local;

@Local
public interface UserService{
	User readUser(String email) throws Exception;
}