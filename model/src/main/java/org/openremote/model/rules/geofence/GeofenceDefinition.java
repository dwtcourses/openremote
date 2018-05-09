/*
 * Copyright 2017, OpenRemote Inc.
 *
 * See the CONTRIBUTORS.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openremote.model.rules.geofence;

public class GeofenceDefinition {

    protected String id;
    protected double lat;
    protected double lng;
    protected int radius;
    protected String postUrl;

    public GeofenceDefinition(String id, double lat, double lng, int radius, String postUrl) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.radius = radius;
        this.postUrl = postUrl;
    }

    public String getId() {
        return id;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public int getRadius() {
        return radius;
    }

    public String getPostUrl() {
        return postUrl;
    }
}
