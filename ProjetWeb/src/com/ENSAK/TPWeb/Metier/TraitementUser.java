package com.ENSAK.TPWeb.Metier;

import com.ENSAK.TPWeb.Persistance.DAOUser;

public class TraitementUser {
	public static boolean isUser(String username, String password) {
		DAOUser daouser = new DAOUser();
		return daouser.isUser(username, password);
	}
}
