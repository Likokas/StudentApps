package com.uc.myfirebaseapss.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Course implements Parcelable {

    private Student id;
    private Student subject;
    private Student day;
    private Student start;
    private Student end;
    private Student lecture;

    public Course(){

    }

    public Course(Student id, Student subject, Student day, Student start, Student end, Student lecture) {
        this.id = id;
        this.subject = subject;
        this.day = day;
        this.start = start;
        this.end = end;
        this.lecture = lecture;
    }

    protected Course(Parcel in) {
        id = in.readParcelable(Student.class.getClassLoader());
        subject = in.readParcelable(Student.class.getClassLoader());
        day = in.readParcelable(Student.class.getClassLoader());
        start = in.readParcelable(Student.class.getClassLoader());
        end = in.readParcelable(Student.class.getClassLoader());
        lecture = in.readParcelable(Student.class.getClassLoader());
    }

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel in) {
            return new Course(in);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }
    };

    public Student getId() {
        return id;
    }

    public Student getSubject() {
        return subject;
    }

    public Student getDay() {
        return day;
    }

    public Student getStart() {
        return start;
    }

    public Student getEnd() {
        return end;
    }

    public Student getLecture() {
        return lecture;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(id, flags);
        dest.writeParcelable(subject, flags);
        dest.writeParcelable(day, flags);
        dest.writeParcelable(start, flags);
        dest.writeParcelable(end, flags);
        dest.writeParcelable(lecture, flags);
    }
}

