/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service.persistence;

import com.liferay.calendar.model.CalendarResource;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the calendar resource service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eduardo Lundgren
 * @see CalendarResourcePersistenceImpl
 * @see CalendarResourceUtil
 * @generated
 */
public interface CalendarResourcePersistence extends BasePersistence<CalendarResource> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CalendarResourceUtil} to access the calendar resource persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the calendar resource in the entity cache if it is enabled.
	*
	* @param calendarResource the calendar resource to cache
	*/
	public void cacheResult(
		com.liferay.calendar.model.CalendarResource calendarResource);

	/**
	* Caches the calendar resources in the entity cache if it is enabled.
	*
	* @param calendarResources the calendar resources to cache
	*/
	public void cacheResult(
		java.util.List<com.liferay.calendar.model.CalendarResource> calendarResources);

	/**
	* Creates a new calendar resource with the primary key. Does not add the calendar resource to the database.
	*
	* @param calendarResourceId the primary key for the new calendar resource
	* @return the new calendar resource
	*/
	public com.liferay.calendar.model.CalendarResource create(
		long calendarResourceId);

	/**
	* Removes the calendar resource with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarResourceId the primary key of the calendar resource to remove
	* @return the calendar resource that was removed
	* @throws com.liferay.calendar.NoSuchResourceException if a calendar resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource remove(
		long calendarResourceId)
		throws com.liferay.calendar.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.calendar.model.CalendarResource updateImpl(
		com.liferay.calendar.model.CalendarResource calendarResource,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the calendar resource with the primary key or throws a {@link com.liferay.calendar.NoSuchResourceException} if it could not be found.
	*
	* @param calendarResourceId the primary key of the calendar resource to find
	* @return the calendar resource
	* @throws com.liferay.calendar.NoSuchResourceException if a calendar resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource findByPrimaryKey(
		long calendarResourceId)
		throws com.liferay.calendar.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the calendar resource with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param calendarResourceId the primary key of the calendar resource to find
	* @return the calendar resource, or <code>null</code> if a calendar resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource fetchByPrimaryKey(
		long calendarResourceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the calendar resources where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.calendar.model.CalendarResource> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the calendar resources where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of calendar resources to return
	* @param end the upper bound of the range of calendar resources to return (not inclusive)
	* @return the range of matching calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.calendar.model.CalendarResource> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the calendar resources where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of calendar resources to return
	* @param end the upper bound of the range of calendar resources to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.calendar.model.CalendarResource> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first calendar resource in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar resource
	* @throws com.liferay.calendar.NoSuchResourceException if a matching calendar resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.calendar.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the last calendar resource in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar resource
	* @throws com.liferay.calendar.NoSuchResourceException if a matching calendar resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.calendar.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the calendar resources before and after the current calendar resource in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calendarResourceId the primary key of the current calendar resource
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next calendar resource
	* @throws com.liferay.calendar.NoSuchResourceException if a calendar resource with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource[] findByUuid_PrevAndNext(
		long calendarResourceId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.calendar.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the calendar resource where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.calendar.NoSuchResourceException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching calendar resource
	* @throws com.liferay.calendar.NoSuchResourceException if a matching calendar resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.calendar.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the calendar resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the calendar resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.calendar.model.CalendarResource fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the calendar resources.
	*
	* @return the calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.calendar.model.CalendarResource> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the calendar resources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of calendar resources to return
	* @param end the upper bound of the range of calendar resources to return (not inclusive)
	* @return the range of calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.calendar.model.CalendarResource> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the calendar resources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of calendar resources to return
	* @param end the upper bound of the range of calendar resources to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.calendar.model.CalendarResource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the calendar resources where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the calendar resource where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.calendar.NoSuchResourceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the calendar resources from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the calendar resources where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the calendar resources where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the number of matching calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the calendar resources.
	*
	* @return the number of calendar resources
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public CalendarResource remove(CalendarResource calendarResource)
		throws SystemException;
}