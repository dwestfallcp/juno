/**
 *
 * Copyright (c) 2005-2012. Centre for Research on Inner City Health, St. Michael's Hospital, Toronto. All Rights Reserved.
 * This software is published under the GPL GNU General Public License.
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 * This software was written for
 * Centre for Research on Inner City Health, St. Michael's Hospital,
 * Toronto, Ontario, Canada
 */
package org.oscarehr.util;

import org.apache.commons.lang.WordUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

/**
 * This class holds utilities used to work with spring.
 * The main usage is probably the beanFactory singleton.
 */
public class SpringUtils {
	
    /**
     * This variable is populated by one of the context listeners.
     */
    public static BeanFactory beanFactory = null;

    public static Object getBean(String beanName)
    {
        return(beanFactory.getBean(beanName));
    }
    
	/**
	 * Attempts to find a Spring bean based of the specified class. This method first attempts to load a bean
	 * following the default Spring auto-naming conventions (de-capitalizing class simple name). In case the bean with 
	 * this name can't be found, the method returns the first available bean of this class.
	 * <p/>
	 * Such logic is required in order to enable this method to lookup components from legacy contexts. "Older" beans seems to 
	 * have identifiers hard-coded in the bean definition file, while "newer" bean identifiers are auto-generated by Spring based on the
	 * annotations.
	 * 
	 * @param clazz
	 * 		Class of the bean to be looked up
	 * @return
	 * 		Returns the bean instance
	 * @throws NoSuchBeanDefinitionException if there is no bean definition with the specified name
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<?> clazz) {
		// legacy code - I wonder if it's necessary since we are looking up a bean based directly on the class name anyways
		// but to keep legacy logic working properly attempt to locate component based on the Spring conventions 
		String className = WordUtils.uncapitalize(clazz.getSimpleName());
		if (beanFactory.containsBean(className))
			return (T) beanFactory.getBean(className);
		
		if (ListableBeanFactory.class.isAssignableFrom(beanFactory.getClass())) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			String[] beanNames = listableBeanFactory.getBeanNamesForType(clazz);
			if (beanNames.length > 0)
				return (T) listableBeanFactory.getBean(beanNames[0]);
		}
		throw new NoSuchBeanDefinitionException(clazz);
	}
}