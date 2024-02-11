import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {

    @Test
    public void testFilterLegalGroupUsername() {
        List<String> expectedUsernames = List.of("Jessie Pinkman", "Tuco Salamanca");
        List<String> legalGroupUsernames = UsersManager.filterLegalGroupUsername();

        assertEquals(expectedUsernames.size(), legalGroupUsernames.size());
        assertTrue(legalGroupUsernames.containsAll(expectedUsernames));

    }

    @Test
    public void testGetUsersOlderThan() {
        int ageTreshold = 40;
        List<User> olderUsers = UsersManager.getUserOlderThan(ageTreshold);
        assertTrue(olderUsers.stream().allMatch(user -> user.getAge() > ageTreshold));
    }

    @Test
    public void testGetUserWithPostsMoreThan() {
        int number = 2;
        List<User> postMoreThan = UsersManager.getUserWithPostsMoreThan(number);
        assertTrue(postMoreThan.stream().allMatch(user -> user.getNumberOfPost() > number));
    }
}
