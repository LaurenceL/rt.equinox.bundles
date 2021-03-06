/*******************************************************************************
 * Copyright (c) 2016 Raymond Augé.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Raymond Augé <raymond.auge@liferay.com> - Bug 497271
 ******************************************************************************/

package org.eclipse.equinox.http.servlet.dto;

import org.osgi.service.http.runtime.dto.ServletDTO;

/**
 * This type may become irrelevant if the properties appear as part of a
 * future OSGi Http Whiteboard specification.
 */
public class ExtendedServletDTO extends ServletDTO {

	/**
	 * Specifies whether multipart support is enabled.
	 */
	public boolean multipartEnabled;

	/**
	 * Specifies the size threshold after which the file will be written to disk.
	 */
	public int multipartFileSizeThreshold;

	/**
	 * Specifies the location where the files can be stored on disk.
	 */
	public String multipartLocation;

	/**
	 * Specifies the maximum size of a file being uploaded.
	 */
	public long multipartMaxFileSize;

	/**
	 * Specifies the maximum request size.
	 */
	public long multipartMaxRequestSize;

}