package com.example.moscowtravelhack.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ToursListResponse {
    class Duration {
        @SerializedName("ticks")
        @Expose
        var ticks: Int? = null
        @SerializedName("days")
        @Expose
        var days: Int? = null
        @SerializedName("hours")
        @Expose
        var hours: Int? = null
        @SerializedName("milliseconds")
        @Expose
        var milliseconds: Int? = null
        @SerializedName("minutes")
        @Expose
        var minutes: Int? = null
        @SerializedName("seconds")
        @Expose
        var seconds: Int? = null
        @SerializedName("totalDays")
        @Expose
        var totalDays: Int? = null
        @SerializedName("totalHours")
        @Expose
        var totalHours: Int? = null
        @SerializedName("totalMilliseconds")
        @Expose
        var totalMilliseconds: Int? = null
        @SerializedName("totalMinutes")
        @Expose
        var totalMinutes: Int? = null
        @SerializedName("totalSeconds")
        @Expose
        var totalSeconds: Int? = null
    }

    class Example {
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("description")
        @Expose
        var description: String? = null
        @SerializedName("duration")
        @Expose
        var duration: Duration? = null
        @SerializedName("price")
        @Expose
        var price: Int? = null
        @SerializedName("isPurchased")
        @Expose
        var isPurchased: Boolean? = null
        @SerializedName("images")
        @Expose
        var images: List<Image>? = null
    }

    class Image {
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("filename")
        @Expose
        var filename: String? = null
        @SerializedName("content")
        @Expose
        var content: String? = null
    }
}