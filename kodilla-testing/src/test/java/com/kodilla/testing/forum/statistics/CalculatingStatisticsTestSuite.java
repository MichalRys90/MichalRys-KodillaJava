package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculatingStatisticsTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Mock
    private Statistics statisticsMock;

    private static CalculatingStatistics calculatingStatistics;

    private List<String> generateUsersList(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("abc" +n);
        }
        return resultList;
    }

    @BeforeEach
    public void beforeEach(){
        calculatingStatistics = new CalculatingStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        int quantityofposts = 0;
        int quantityofcomments = 0;
        when(statisticsMock.postsCount()).thenReturn(quantityofposts);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);
    }

    @Test
    void testCalculateStatisticsWithZeroPosts() {
        //Given
        int quantityofcomments = 100;
        List<String> usersList = generateUsersList(50);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculatingStatistics.getPostsQuantity());
        assertEquals(100, calculatingStatistics.getCommentsQuantity());
        assertEquals(50, calculatingStatistics.getUsersQuantity());
        assertEquals(0, calculatingStatistics.getAvarageCommentsPerPost());
        assertEquals(0, calculatingStatistics.getAvaragePostsPerUser());
        assertEquals(2, calculatingStatistics.getAvarageCommentsPerUser());
        System.out.println("Test for 0 posts: \n" + calculatingStatistics.showStatistics(statisticsMock));
    }
    @Test
    void testCalculateStatisticsWithThousandPosts() {
        //Given
        int quantityofposts = 1000;
        int quantityofcomments = 100;
        List<String> usersList = generateUsersList(50);
        when(statisticsMock.postsCount()).thenReturn(quantityofposts);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculatingStatistics.getPostsQuantity());
        assertEquals(100, calculatingStatistics.getCommentsQuantity());
        assertEquals(50, calculatingStatistics.getUsersQuantity());
        assertEquals(0.1, calculatingStatistics.getAvarageCommentsPerPost());
        assertEquals(20, calculatingStatistics.getAvaragePostsPerUser());
        assertEquals(2, calculatingStatistics.getAvarageCommentsPerUser());
        System.out.println("Test for 1000 posts: \n" + calculatingStatistics.showStatistics(statisticsMock));
    }

    @Test
    void testCalculateStatisticsWithZeroComments() {
        //Given
        int quantityofposts = 100;
        int quantityofcomments = 0;
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.postsCount()).thenReturn(quantityofposts);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, calculatingStatistics.getPostsQuantity());
        assertEquals(0, calculatingStatistics.getCommentsQuantity());
        assertEquals(100, calculatingStatistics.getUsersQuantity());
        assertEquals(0, calculatingStatistics.getAvarageCommentsPerPost());
        assertEquals(1, calculatingStatistics.getAvaragePostsPerUser());
        assertEquals(0, calculatingStatistics.getAvarageCommentsPerUser());
        System.out.println("Test for 0 comments: \n" + calculatingStatistics.showStatistics(statisticsMock));
    }

    @Test
    void testCalculateStatisticsWhenCemmentsAreMoreThanPosts() {
        //Given
        int quantityofposts = 50;
        int quantityofcomments = 100;
        List<String> usersList = generateUsersList(50);
        when(statisticsMock.postsCount()).thenReturn(quantityofposts);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(50, calculatingStatistics.getPostsQuantity());
        assertEquals(100, calculatingStatistics.getCommentsQuantity());
        assertEquals(50, calculatingStatistics.getUsersQuantity());
        assertEquals(2, calculatingStatistics.getAvarageCommentsPerPost());
        assertEquals(1, calculatingStatistics.getAvaragePostsPerUser());
        assertEquals(2, calculatingStatistics.getAvarageCommentsPerUser());
        System.out.println("Test for more comments than posts: \n" + calculatingStatistics.showStatistics(statisticsMock));
    }

    @Test
    void testCalculateStatisticsWhenPostsAreMoreThanComments() {
        //Given
        int quantityofposts = 200;
        int quantityofcomments = 100;
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.postsCount()).thenReturn(quantityofposts);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(200, calculatingStatistics.getPostsQuantity());
        assertEquals(100, calculatingStatistics.getCommentsQuantity());
        assertEquals(100, calculatingStatistics.getUsersQuantity());
        assertEquals(0.5, calculatingStatistics.getAvarageCommentsPerPost());
        assertEquals(2, calculatingStatistics.getAvaragePostsPerUser());
        assertEquals(1, calculatingStatistics.getAvarageCommentsPerUser());
        System.out.println("Test for more posts than comments: \n" + calculatingStatistics.showStatistics(statisticsMock));
    }

    @Test
    void testCalculateStatisticsWithZeroUsers() {
        //Given
        int quantityofposts = 100;
        int quantityofcomments = 500;
        List<String> usersList = generateUsersList(0);
        when(statisticsMock.postsCount()).thenReturn(quantityofposts);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, calculatingStatistics.getPostsQuantity());
        assertEquals(500, calculatingStatistics.getCommentsQuantity());
        assertEquals(0, calculatingStatistics.getUsersQuantity());
        assertEquals(5, calculatingStatistics.getAvarageCommentsPerPost());
        assertEquals(0, calculatingStatistics.getAvaragePostsPerUser());
        assertEquals(0, calculatingStatistics.getAvarageCommentsPerUser());
        System.out.println("Test for 0 users: \n" + calculatingStatistics.showStatistics(statisticsMock));
    }

    @Test
    void testCalculateStatisticsWithHundredUsers() {
        //Given
        int quantityofposts = 40;
        int quantityofcomments = 20;
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.postsCount()).thenReturn(quantityofposts);
        when(statisticsMock.commentsCount()).thenReturn(quantityofcomments);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(40, calculatingStatistics.getPostsQuantity());
        assertEquals(20, calculatingStatistics.getCommentsQuantity());
        assertEquals(100, calculatingStatistics.getUsersQuantity());
        assertEquals(0.5, calculatingStatistics.getAvarageCommentsPerPost());
        assertEquals(0.4, calculatingStatistics.getAvaragePostsPerUser());
        assertEquals(0.2, calculatingStatistics.getAvarageCommentsPerUser());
        System.out.println("Test for 100 posts: \n" + calculatingStatistics.showStatistics(statisticsMock));
    }
}


