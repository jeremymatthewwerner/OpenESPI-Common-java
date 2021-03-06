/*
 *     Copyright (c) 2018-2019 Green Button Alliance, Inc.
 *
 *     Portions copyright (c) 2013-2018 EnergyOS.org
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package org.greenbuttonalliance.espi.common.service;


import com.sun.syndication.io.FeedException;
import org.greenbuttonalliance.espi.common.domain.RetailCustomer;
import org.greenbuttonalliance.espi.common.domain.Subscription;
import org.greenbuttonalliance.espi.common.domain.UsagePoint;
import org.greenbuttonalliance.espi.common.models.atom.EntryType;
import org.greenbuttonalliance.espi.common.repositories.UsagePointRepository;
import org.greenbuttonalliance.espi.common.utils.EntryTypeIterator;

import java.io.InputStream;
import java.util.List;
import java.util.UUID;

public interface UsagePointService {
 
	List<UsagePoint> findAllByRetailCustomer(RetailCustomer customer);

	void createOrReplaceByUUID(UsagePoint usagePoint);

	void associateByUUID(RetailCustomer retailCustomer, UUID uuid);

	UsagePoint findByUUID(UUID uuid);

	UsagePoint findByHashedId(String usagePointHashedId);

	List<UsagePoint> findAllUpdatedFor(Subscription subscription);

	void deleteByHashedId(String usagePointHashedId);

	List<Long> findAllIdsForRetailCustomer(Long id);

	String feedFor(List<UsagePoint> usagePoints) throws FeedException;

	String entryFor(UsagePoint usagePoint);

	List<UsagePoint> findAllByRetailCustomer(Long retailCustomerId);
 
	public void setRepository(UsagePointRepository usagePointRepository);

	public void setResourceService(ResourceService resourceService);

	public void persist(UsagePoint usagePoint);
 
	public UsagePoint findById(Long usagePointId);

	public UsagePoint findById(Long retailCustomerId, Long usagePointId);

	public EntryType findEntryType(Long retailCustomerId, Long usagePointId);
	
	public EntryType findEntryType(Long usagePointId);
	
	public EntryTypeIterator findEntryTypeIterator();

	public EntryTypeIterator findEntryTypeIterator(Long retailCustomerId);
	
	public EntryTypeIterator findEntryTypeIterator(Long retailCustomerId, Long usagePointId);

	public void add(UsagePoint usagePoint);

	public void delete(UsagePoint usagePoint);
 
	public UsagePoint importResource(InputStream stream);

}
