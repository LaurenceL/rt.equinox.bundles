/*
 * Copyright (c) OSGi Alliance (2001, 2008). All Rights Reserved.
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
package org.osgi.service.prefs;

/**
 * Thrown to indicate that a preferences operation could not complete because of
 * a failure in the backing store, or a failure to contact the backing store.
 * 
 * @version $Revision: 5837 $
 */
public class BackingStoreException extends Exception {
    static final long serialVersionUID = -1415637364122829574L;

	/**
	 * Constructs a <code>BackingStoreException</code> with the specified detail
	 * message.
	 * 
	 * @param message The detail message.
	 */
	public BackingStoreException(String message) {
		super(message);
	}
	
	/**
	 * Constructs a <code>BackingStoreException</code> with the specified detail
	 * message.
	 * 
	 * @param message The detail message.
	 * @param cause The cause of the exception. May be <code>null</code>.
	 * @since 1.1 
	 */
	public BackingStoreException(String message, Throwable cause) {
		super(message, cause);
	}
}
