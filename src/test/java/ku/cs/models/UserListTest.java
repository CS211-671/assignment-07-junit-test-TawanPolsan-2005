package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("ping", "123");
        userList.addUser("per", "456");
        userList.addUser("pung", "789");
        // TODO: change password of one user
        boolean actual = userList.changePassword("ping", "123", "1234");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("ping", "123");
        userList.addUser("per", "456");
        userList.addUser("pung", "789");
        // TODO: call login() with correct username and password
        User actual = userList.login("ping", "123");
        // TODO: assert that User object is found
         assertEquals(true, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("ping", "123");
        userList.addUser("per", "456");
        userList.addUser("pung", "789");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("ping", "122");
        // TODO: assert that the method return null
        assertNull(actual);
    }
}