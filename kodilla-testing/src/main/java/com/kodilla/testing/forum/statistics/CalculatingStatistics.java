package com.kodilla.testing.forum.statistics;

public class CalculatingStatistics {
    private Statistics statistics;

    public CalculatingStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double avaragePostsPerUser;
    private double avarageCommentsPerUser;
    private double avarageCommentsPerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAvaragePostsPerUser() {
        return avaragePostsPerUser;
    }

    public double getAvarageCommentsPerUser() {
        return avarageCommentsPerUser;
    }

    public double getAvarageCommentsPerPost() {
        return avarageCommentsPerPost;
    }

    public CalculatingStatistics(int usersQuantity, int postsQuantity,
                                 int commentsQuantity, double avaragePostsPerUser,
                                 double avarageCommentsPerUser, double avarageCommentsPerPost) {
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
        this.avaragePostsPerUser = avaragePostsPerUser;
        this.avarageCommentsPerUser = avarageCommentsPerUser;
        this.avarageCommentsPerPost = avarageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if (usersQuantity != 0) {
            avaragePostsPerUser = (double) postsQuantity / usersQuantity;
        } else {
            System.out.println("Pamietaj cholero nie dziel przez 0");
        }
        if (usersQuantity != 0) {
            avarageCommentsPerUser = (double) commentsQuantity / usersQuantity;
        } else {
            System.out.println("Pamietaj cholero nie dziel przez 0");
        }
        if (postsQuantity != 0) {
            avarageCommentsPerPost = (double) commentsQuantity / postsQuantity;
        } else {
            System.out.println("Pamietaj cholero nie dziel przez 0");
        }
    }

    public String showStatistics(Statistics statisticsMock) {
        return   "Users quantity = " + usersQuantity
                +"\n Posts quantity = " + postsQuantity
                +"\n Comments quantity = " + commentsQuantity
                +"\n Avarage post per user = " + avaragePostsPerUser
                +"\n Avarege comment per user = " + avarageCommentsPerUser
                +"\n Avarage comment per post = " + avarageCommentsPerPost;
    }
}
