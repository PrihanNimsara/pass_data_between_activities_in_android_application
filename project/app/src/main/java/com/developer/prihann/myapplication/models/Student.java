package com.developer.prihann.myapplication.models;


import android.os.Parcel;
import android.os.Parcelable;

public class Student  implements Parcelable {

    private Integer age;
    private String name;

    public Student() {
    }

    protected Student(Parcel in) {
        if (in.readByte() == 0) {
            age = null;
        } else {
            age = in.readInt();
        }
        name = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (age == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(age);
        }
        parcel.writeString(name);
    }
}
