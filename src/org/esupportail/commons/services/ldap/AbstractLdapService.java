/**
 * ESUP-Portail Commons - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-commons
 */
package org.esupportail.commons.services.ldap;

import java.util.List;
import java.util.Locale;

/**
 * An abstract class that implements interface LdapUserService.
 * This class does not support the retrieval of statistics.
 */
@SuppressWarnings("serial")
abstract class AbstractLdapService implements BasicLdapService {
	
	/**
	 * The exception thrown when the statistics methods are called.
	 */
	private final UnsupportedOperationException unsupportedExcepion = 
		new UnsupportedOperationException("class " + getClass() + " does not support statistics.");

	/**
	 * Bean constructor.
	 */
	public AbstractLdapService() {
		super();
	}

	/**
	 * @see org.esupportail.commons.services.ldap.BasicLdapService#getStatistics(java.util.Locale)
	 */
	public List<String> getStatistics(@SuppressWarnings("unused") final Locale locale) {
		throw unsupportedExcepion;
	}

	/**
	 * @see org.esupportail.commons.services.ldap.BasicLdapService#resetStatistics()
	 */
	public void resetStatistics() {
		throw unsupportedExcepion;
	}

	/**
	 * @see org.esupportail.commons.services.ldap.BasicLdapService#supportStatistics()
	 */
	public boolean supportStatistics() {
		return false;
	}

	/**
	 * @see org.esupportail.commons.services.ldap.BasicLdapService#supportsTest()
	 */
	public boolean supportsTest() {
		return false;
	}

	/**
	 * @see org.esupportail.commons.services.ldap.BasicLdapService#test()
	 */
	public void test() {
		throw unsupportedExcepion;
	}

}
