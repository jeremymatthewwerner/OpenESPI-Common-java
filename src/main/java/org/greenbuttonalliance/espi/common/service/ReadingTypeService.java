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

import org.greenbuttonalliance.espi.common.domain.MeterReading;
import org.greenbuttonalliance.espi.common.domain.ReadingType;
import org.greenbuttonalliance.espi.common.models.atom.EntryType;
import org.greenbuttonalliance.espi.common.repositories.ReadingTypeRepository;
import org.greenbuttonalliance.espi.common.utils.EntryTypeIterator;

import java.io.InputStream;
import java.util.UUID;

public interface ReadingTypeService {

	ReadingType findByUUID(UUID uuid);

	String feedFor(ReadingType readingType);

	String entryFor(ReadingType readingType);

	void associateByUUID(MeterReading meterReading, UUID uuid);

	void deleteById(long readingTypeId);

	public void setReadingTypeRepository(ReadingTypeRepository repository);

	public void persist(ReadingType readingType);

	public ReadingType findById(Long readingTypeId);

	public EntryType findEntryType(Long retailCustomerId, Long usagePointId,Long meterReadingId,
			Long readingTypeId);

	public EntryTypeIterator findEntryTypeIterator(Long retailCustomerId, Long usagePointId);

	public void add(ReadingType readingType);

	public void delete(ReadingType readingType);

	public ReadingType importResource(InputStream stream);

}
