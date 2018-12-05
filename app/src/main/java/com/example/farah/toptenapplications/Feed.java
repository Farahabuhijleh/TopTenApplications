
package com.example.farah.toptenapplications;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feed implements Parcelable
{

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    public final static Creator<Feed> CREATOR = new Creator<Feed>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Feed createFromParcel(Parcel in) {
            return new Feed(in);
        }

        public Feed[] newArray(int size) {
            return (new Feed[size]);
        }

    }
    ;

    protected Feed(Parcel in) {
        in.readList(this.results, (Result.class.getClassLoader()));
    }

    public Feed() {
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(results);
    }

    public int describeContents() {
        return  0;
    }

}
