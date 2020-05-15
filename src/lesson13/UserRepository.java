package lesson13;


public class UserRepository {

    private User[] users = new User[10];

    public User save(User user) {
        if (user == null)
            return null;
        if (findById(user.getId()) != null)
            return null;
        int count = 0;
        for (User user1 : users) {
            if (user1 != null)
                count++;
        }
        if (count > 9)
            return null;
        int i = 0;
        for (User us : users) {
            if (us == null) {
                users[i] = user;
                break;
            }
            i++;
        }
        return user;
    }

    public User update(User user){
        if (user == null)
            return null;
        User curUser = findById(user.getId());
        if (curUser == null)
            return null;

        long curUserId = curUser.getId();

        int index = 0;
        for (User us : users) {
            if (us != null && us.getId() == curUserId ){
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }

    public void delete(long id){
        User user = findById(id);

        int index = 0;
        for (User us : users){
            if (us == user){
                users[index] = null;
                break;
            }
        }

    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }
    User[] getUsers() {
        return users;
    }
    private User getFindById(long id) {
        return findById(id);
    }
}




