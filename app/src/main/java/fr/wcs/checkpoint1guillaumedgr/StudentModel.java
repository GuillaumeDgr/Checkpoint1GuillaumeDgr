package fr.wcs.checkpoint1guillaumedgr;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by apprenti on 9/29/17.
 */

public class StudentModel implements Parcelable {

    // Attributs
    private String name;
    private String firstName;
    private String school;
    private String language;

    // Constructors
    public StudentModel(String name, String firstName, String school, String language) {
        this.name = name;
        this.firstName = firstName;
        this.school = school;
        this.language = language;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    // Class Parcelable
    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(name);
        dest.writeString(firstName);
        dest.writeString(school);
        dest.writeString(language);
    }

    public static final Parcelable.Creator<StudentModel> CREATOR = new Parcelable.Creator<StudentModel>()
    {
        public StudentModel createFromParcel(Parcel source)
        {
            return new StudentModel(source);
        }

        public StudentModel[] newArray(int size)
        {
            return new StudentModel[size];
        }
    };

    public StudentModel(Parcel in) {
        this.name = in.readString();
        this.firstName = in.readString();
        this.school = in.readString();
        this.language = in.readString();
    }
}
