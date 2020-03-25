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
package org.oscarehr.common.dao;

import java.util.List;

import javax.persistence.Query;

import org.oscarehr.common.model.SecRole;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SecRoleDao extends AbstractDao<SecRole> {

	public SecRoleDao() {
		super(SecRole.class);
	}

    public List<SecRole> findAll()
	{
		StringBuilder sb=new StringBuilder();
		sb.append("select x from SecRole x");

		sb.append(" order by x.name");

		Query query = entityManager.createQuery(sb.toString());

		@SuppressWarnings("unchecked")
		List<SecRole> results = query.getResultList();

		return(results);
	}
    
    public List<String> findAllNames()
 	{
 		StringBuilder sb=new StringBuilder();
 		sb.append("select x.name from SecRole x");

 		sb.append(" order by x.name");

 		Query query = entityManager.createQuery(sb.toString());

 		@SuppressWarnings("unchecked")
 		List<String> results = query.getResultList();

 		return(results);
 	}

 	/** BAD! Stop using this. we want to be able to rename roles */
 	@Deprecated
    public SecRole findByName(String name) {
    	Query q = entityManager.createQuery("select x from SecRole x where x.name=:name");

    	q.setParameter("name", name);
    	
    	return this.getSingleResultOrNull(q);
    }

    public List<SecRole> findAllOrderByRole()
	{
		Query query = entityManager.createQuery("select x from SecRole x order by x.name");

		@SuppressWarnings("unchecked")
		List<SecRole> results = query.getResultList();

		return(results);
	}

	public List<SecRole> findAllOrderByRole(String[] ignoreList)
	{
		if(ignoreList == null || ignoreList.length < 1)
		{
			return findAllOrderByRole();
		}
		Query query = entityManager.createQuery("select x from SecRole x WHERE x.name NOT IN (:ignoreList) order by x.name");
		query.setParameter("ignoreList", ignoreList);

		@SuppressWarnings("unchecked")
		List<SecRole> results = query.getResultList();

		return(results);
	}
}
