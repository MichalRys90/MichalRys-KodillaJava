package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueUserID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numbersOfPost;

    public ForumUser(final int uniqueUserID, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numbersOfPost) {
        this.uniqueUserID = uniqueUserID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numbersOfPost = numbersOfPost;
    }

    public int getUniqueUserID() {
        return uniqueUserID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumbersOfPost() {
        return numbersOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserID=" + uniqueUserID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numbersOfPost=" + numbersOfPost +
                '}';
    }
}
