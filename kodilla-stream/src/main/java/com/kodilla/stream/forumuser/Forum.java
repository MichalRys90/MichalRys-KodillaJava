package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1,"Username1",'m',1980,1,
                1,0));
        theForumUserList.add(new ForumUser(2,"Username2",'f',1981,2,
                2,0));
        theForumUserList.add(new ForumUser(3,"Username3",'m',1982,3,
                3,15));
        theForumUserList.add(new ForumUser(4,"Username4",'f',1983,4,
                4,22));
        theForumUserList.add(new ForumUser(5,"Username5",'m',2003,5,
                5,0));
        theForumUserList.add(new ForumUser(6,"Username6",'f',2004,6,
                6,7));
        theForumUserList.add(new ForumUser(7,"Username7",'m',2002,7,
                11,5));
        theForumUserList.add(new ForumUser(8,"Username8",'f',2006,8,
                8,0));
        theForumUserList.add(new ForumUser(9,"Username9",'m',2007,9,
                9,0));
        theForumUserList.add(new ForumUser(10,"Username10",'f',2008,10,
                10,21));
    }
    public List<ForumUser> getList() {
        return theForumUserList;
    }
}
