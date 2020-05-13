package lesson9.l3;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {

        this.users = users;
    }
    public User[] getUsers() {

        return users;
    }
//-----------------------------------------------------------------------------------------
    public User getFirstUser() {
            return users [0];
    }
//-----------------------------------------------------------------------------------------
    public String getFirstUserName(){

       // return getFirstUser().getName();
        return users[0].getName() ;
        }
//------------------------------------------------------------------------------------------
    public String[] getUserNames() {
        String[] names = new String[users.length]; //ставится так как требуется заполнить и вывести массив пользователей
        int i = 0;
        for (User user : users) {
            if (user != null && names[i] == user.getName())
                i++;
        }
        return names;
    }

    public long[] getUserIds() {
        long[] id = new long[countUsers()];//ставится так как требуется заполнить и вывести массив пользователей
        int i = 0;
        for (User user : users) {
            if (user != null) {
                id[i] = user.getId();
            }
        }
        return id;
    }
    //----------------------------------------------дополнительные методы---------------------------------------------------
    private int countUsers() {
        int count = 0;
        for (User user : users) {
            if (user != null)
                count++;
        }
        return count;
    }
 /*   private lesson9.User duplikateUsers() {
        int count = 0;
        int i =0;
        for (lesson9.User user : users) {
            if (user [i] == user [i+1]){
                return user [i];
                count++;
            }
        }
        return user [i];
    }*/


    //----------------------------------------------------------------------------------------------------------------------
    public String getUserNameById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId()) {
                return user.getName();
            }
        }
        return null;
    }
    //---------------------------------   UserRepository 2   ---------------------------------------------------------------
    public User getUserByName(String name) {
        for (User user : users) {
            if (user != null && name == user.getName()) {
                return user;
            } else {
                return null;
            }
            //    else {
            //     	return null;
            //   }
        }
        return null;
    }

    public User getUserById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId()) {
                return user;
            }
            return user;
        }

        return null;
    }


    public String getUserBySessionId(String sessionId) {
        int i = 0;
        for (User user : users) {
            if (user != null && sessionId == user.getSessionId()) {
            }
            return user.getSessionId();
        }
        return null;
    }

//-------------------------------------------      UserRepository 3  ---------------------------------------------------

}
