
package com.example.farah.toptenapplications;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example implements Parcelable
{

    @SerializedName("feed")
    @Expose
    private Feed feed;
    public final static Creator<Example> CREATOR = new Creator<Example>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Example createFromParcel(Parcel in) {
            return new Example(in);
        }

        public Example[] newArray(int size) {
            return (new Example[size]);
        }

    }
    ;

    protected Example(Parcel in) {
        this.feed = ((Feed) in.readValue((Feed.class.getClassLoader())));
    }

    public Example() {
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(feed);
    }

    public int describeContents() {
        return  0;
    }

}
