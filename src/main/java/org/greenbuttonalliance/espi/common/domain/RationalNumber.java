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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//

package org.greenbuttonalliance.espi.common.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;

/**
 * <p>
 * Java class for RationalNumber complex type.
 * <p/>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * 
 * <pre>
 * &lt;complexType name="RationalNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RationalNumber", propOrder = { "numerator", "denominator" })
@Embeddable
public class RationalNumber {

	@Column(name = "rational_numerator")
	protected BigInteger numerator;
	@Column(name = "rational_denominator")
	protected BigInteger denominator;

	/**
	 * Gets the value of the numerator property.
	 *
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getNumerator() {
		return numerator;
	}

	/**
	 * Sets the value of the numerator property.
	 *
	 * @param value
	 *            allowed object is {@link BigInteger }
	 */
	public void setNumerator(BigInteger value) {
		this.numerator = value;
	}

	/**
	 * Gets the value of the denominator property.
	 *
	 * @return possible object is {@link java.lang.Object }
	 */
	public BigInteger getDenominator() {
		return denominator;
	}

	/**
	 * Sets the value of the denominator property.
	 *
	 * @param value
	 *            allowed object is {@link java.lang.Object }
	 */
	public void setDenominator(BigInteger value) {
		this.denominator = value;
	}

}
