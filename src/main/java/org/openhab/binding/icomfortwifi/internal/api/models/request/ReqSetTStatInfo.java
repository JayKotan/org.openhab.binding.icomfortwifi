/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.icomfortwifi.internal.api.models.request;

import org.openhab.binding.icomfortwifi.internal.api.models.response.ZoneStatus;

import com.google.gson.annotations.SerializedName;

/**
 * Request model for the setting status information
 *
 * @author Konstantin Panchenko - Initial contribution
 *
 */

public class ReqSetTStatInfo {
    @SerializedName("Cool_Set_Point")
    public Double coolSetPoint = null;
    @SerializedName("Heat_Set_Point")
    public Double heatSetPoint = null;
    @SerializedName("Fan_Mode")
    public Integer fanMode = 0;
    @SerializedName("Operation_Mode")
    public Integer operationMode = 0;
    @SerializedName("Pref_Temp_Units")
    public String prefTempUnits = null;
    @SerializedName("Zone_Number")
    public Integer zoneNumber = 0;
    @SerializedName("GatewaySN")
    public String gatewaySN = null;

    public ReqSetTStatInfo() {
    }

    public ReqSetTStatInfo(ZoneStatus zoneStatus) {
        this.coolSetPoint = zoneStatus.coolSetPoint;
        this.heatSetPoint = zoneStatus.heatSetPoint;
        this.fanMode = zoneStatus.fanMode.getFanModeValue();
        this.operationMode = zoneStatus.operationMode.getOperationModeValue();
        this.prefTempUnits = zoneStatus.preferredTemperatureUnit.getTempUnitsValue();
        this.zoneNumber = zoneStatus.zoneNumber;
        this.gatewaySN = zoneStatus.gatewaySN;
    }
}
