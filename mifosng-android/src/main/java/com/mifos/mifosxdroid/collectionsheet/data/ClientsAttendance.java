/*
 * This project is licensed under the open source MPL V2.
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */

package com.mifos.mifosxdroid.collectionsheet.data;


import com.google.gson.Gson;

public class ClientsAttendance
{
    public int attendanceType;
    public int clientId;

    public ClientsAttendance(int clientId,int attendanceType){
        this.clientId=clientId;
        this.attendanceType=attendanceType;
    }


    @Override
    public String toString()
    {
        return new Gson().toJson(this);
    }
}