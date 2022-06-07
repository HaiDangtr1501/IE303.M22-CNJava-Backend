package com.ie303m22.laptopweb.security.oauth2.user;

import java.util.Map;

import com.ie303m22.laptopweb.exception.OAuth2AuthenticationProcessingException;
import com.ie303m22.laptopweb.models.AuthProvider;

public class OAuth2UserInfoFactory {
	public static OAuth2UserInfo getAuth2UserInfo(String registrationId, Map<String, Object> attributes) {

		if (registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
			return new GoogleOAuth2UserInfo(attributes);

		} else if (registrationId.equalsIgnoreCase(AuthProvider.facebook.toString())) {
			return new FacebookOAuth2UserInfo(attributes);

		} else {
			throw new OAuth2AuthenticationProcessingException(
					"Sory! Login with " + registrationId + " is not supported yet.");
		}
	}
}
