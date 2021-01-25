package com.stou.activityexam3
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Person1(var name : String, var age : Int) : Parcelable

