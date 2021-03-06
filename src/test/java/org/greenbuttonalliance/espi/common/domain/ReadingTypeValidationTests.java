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

package org.greenbuttonalliance.espi.common.domain;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;

public class ReadingTypeValidationTests {
	@Test
	public void isValid() throws Exception {
		Validator validator = Validation.buildDefaultValidatorFactory()
				.getValidator();

		ReadingType readingType = new ReadingType();
		readingType.setMRID("urn:uuid:E8E75691-7F9D-49F3-8BE2-3A74EBF6BFC0");

		Set<ConstraintViolation<ReadingType>> violations = validator
				.validate(readingType);

		assertTrue(violations.isEmpty());
	}

}
