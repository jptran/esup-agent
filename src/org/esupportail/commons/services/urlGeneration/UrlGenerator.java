/**
 * ESUP-Portail Commons - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-commons
 */
package org.esupportail.commons.services.urlGeneration; 

import java.io.Serializable;
import java.util.Map;

/**
 * The interface of URL generators.
 */
public interface UrlGenerator extends Serializable {

	/**
	 * @param params 
	 * @return a link to the application with parameters for guest users.
	 */
	String guestUrl(Map<String, String> params);

	/**
	 * @return a link to the application with no parameter for guest users.
	 */
	String guestUrl();

	/**
	 * @param params 
	 * @return a link to the application with parameters for CAS users.
	 */
	String casUrl(Map<String, String> params);

	/**
	 * @return a link to the application with no parameter for CAS users.
	 */
	String casUrl();

	/**
	 * @param params 
	 * @return a link to the application with parameters for Shibboleth users.
	 */
	String shibbolethUrl(Map<String, String> params);

	/**
	 * @return a link to the application with no parameter for Shibboleth users.
	 */
	String shibbolethUrl();

}
