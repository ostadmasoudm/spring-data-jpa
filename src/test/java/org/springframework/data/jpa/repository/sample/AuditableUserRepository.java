/*
 * Copyright 2008-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jpa.repository.sample;

import java.util.List;

import org.springframework.data.jpa.domain.sample.AuditableUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@code AuditableUser}.
 * 
 * @author Oliver Gierke
 */
public interface AuditableUserRepository extends JpaRepository<AuditableUser, Long> {

	/**
	 * Returns all users with the given firstname.
	 * 
	 * @param firstname
	 * @return all users with the given firstname.
	 */
	public List<AuditableUser> findByFirstname(final String firstname);
}
