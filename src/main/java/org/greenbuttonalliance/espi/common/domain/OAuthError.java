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

// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.23 at 04:09:58 PM EDT 
//

package org.greenbuttonalliance.espi.common.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for OAuthError.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="OAuthError">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invalid_request"/>
 *     &lt;enumeration value="invalid_client"/>
 *     &lt;enumeration value="invalid_grant"/>
 *     &lt;enumeration value="unauthorized_client"/>
 *     &lt;enumeration value="unsupported_grant_type"/>
 *     &lt;enumeration value="invalid_scope"/>
 *     &lt;enumeration value="invalid_redirect_uri"/>
 *     &lt;enumeration value="invalid_client_metadata"/>
 *     &lt;enumeration value="invalid_client_id"/>
 *     &lt;enumeration value="access_denied"/>
 *     &lt;enumeration value="unsupported_response_type"/>
 *     &lt;enumeration value="server_error"/>
 *     &lt;enumeration value="temporarily_unavailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OAuthError")
@XmlEnum
public enum OAuthError {

	@XmlEnumValue("invalid_request")
	INVALID_REQUEST("invalid_request"), @XmlEnumValue("invalid_client")
	INVALID_CLIENT("invalid_client"), @XmlEnumValue("invalid_grant")
	INVALID_GRANT("invalid_grant"), @XmlEnumValue("unauthorized_client")
	UNAUTHORIZED_CLIENT("unauthorized_client"), @XmlEnumValue("unsupported_grant_type")
	UNSUPPORTED_GRANT_TYPE("unsupported_grant_type"), @XmlEnumValue("invalid_scope")
	INVALID_SCOPE("invalid_scope"), @XmlEnumValue("invalid_redirect_uri")
	INVALID_REDIRECT_URI("invalid_redirect_uri"), @XmlEnumValue("invalid_client_metadata")
	INVALID_CLIENT_METADATA("invalid_client_metadata"), @XmlEnumValue("invalid_client_id")
	INVALID_CLIENT_ID("invalid_client_id"), @XmlEnumValue("access_denied")
	ACCESS_DENIED("access_denied"), @XmlEnumValue("unsupported_response_type")
	UNSUPPORTED_RESPONSE_TYPE("unsupported_response_type"), @XmlEnumValue("server_error")
	SERVER_ERROR("server_error"), @XmlEnumValue("temporarily_unavailable")
	TEMPORARILY_UNAVAILABLE("temporarily_unavailable");
	private final String value;

	OAuthError(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static OAuthError fromValue(String v) {
		for (OAuthError c : OAuthError.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
