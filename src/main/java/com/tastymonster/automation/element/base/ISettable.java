package com.tastymonster.automation.element.base;

public interface ISettable<T> extends IBaseWebElement {
    /**
	 * Persists the value stored in this element to the browser
	 */
	void setWebValue();
	
	/**
	 * Set the "stored value" in this element, but NOT in the browser
	 * @param value 
	 */
	void setValue( T value );
	
	/**
	 * Returns true if 'setValue()' has been called with a value
	 * @return
	 */
	boolean hasValue();
	
	/**
	 * Indicates whether or not this element exists on the page AND is visible
	 * @return
	 */
	boolean exists();
	
	/**
	 * Return the value currently reflected in the UI
	 * @return 
	 */
	T getWebValue();
}
