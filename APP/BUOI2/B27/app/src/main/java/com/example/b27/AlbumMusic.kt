package com.example.b27

import android.os.Parcel
import android.os.Parcelable

data class AlbumMusic(var stt:Int, var code: String?, var name: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(stt)
        parcel.writeString(code)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AlbumMusic> {
        override fun createFromParcel(parcel: Parcel): AlbumMusic {
            return AlbumMusic(parcel)
        }

        override fun newArray(size: Int): Array<AlbumMusic?> {
            return arrayOfNulls(size)
        }
    }
}