package lesson9.l2;


/* класс User с предыдущей задачи

Так же создайте класс UserRepository, который будет содержать поле
User[] users, выполняющее роль условной базы данных. Поле инициализируется в конструкторе (входящим массивом). Возможность модификации поля из других классов должна быть закрыта,
 но возможность чтения открыта

В этом классе напишите методы, доступные для всех:
getUserNames() - для получения массива имен пользователей
getUserIds() - для получения массива id пользователей
getUserNameById(long id) - для получения имени пользователя, по его id

getUserByName(String name) - нахождение юзера по имени
getUserById(long id) - нахождение юзера по id
getUserBySessionId(String sessionId) - нахождение юзера по sessionId
Возвращайте null, если юзера найти не удалось. Если юзеров несколько - возвращайте первый
Методы должны быть доступны всем

User save(User user) - будет добавлять юзера и возвращать его
Eсли юзер уже есть в массиве, результат - null. Если размер массива не позволяет добавить больше элементов (все ячейки заняты) результат метода тоже null
Метод должен быть доступен всем
Используйте метод с предыдущих задач для нахождение юзера по id. Только переменуйте его в findById(long id).
Метод должен быть доступен, только внутри класса UserRepository
В этой задаче так же нужно сабмитить класс User, созданный в одной из предудыщих задач урока

*User update(User user) - будет обновлять текущего юзера в массиве (перезаписывать) и возвращать его. Если юзера нет, результат метода null
void delete(long id) - удаляет юзера с массива
Методы должны быть доступны всем
Используйте метод findById(long id) с предыдущих задач для нахождение юзера по id. Метод должен быть доступен, только внутри класса UserRepository
*/
public class UserRepository {
    private User[] users;


    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        String[] names = new String[countUsers()]; //ставится так как требуется заполнить и вывести массив пользователей
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

    //------------------------------------------------------------------------------------------------------------------
    public String getUserNameById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId()) {
                return user.getName();
            }
        }
        return null;
    }

    //---------------------------------   UserRepository 2   -----------------------------------------------------------
    //getUserByName(String name) - нахождение юзера по имени. Возвращайте null, если юзера найти не удалось. Если юзеров несколько - возвращайте первый
    public User getUserByName(String name) {
        for (User user : users) {
            if (user != null && name == user.getName()) {
                return user;
            } else {
                return null;
            }
        }
        return null;
    }

    //getUserById(long id) - нахождение юзера по id
    public User getUserById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId()) {
                return user;
            } else {
                return null;
            }
        }
        return null;
    }

    //getUserBySessionId(String sessionId) - нахождение юзера по sessionId
    public User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if (user != null && sessionId == user.getSessionId()) {
                return user;
            } else {
                return null;
            }
        }
        return null;
    }

    //--------------------------------------------------- UserRepository 3 -------------------------------------------------
    //User save(User user) - будет добавлять юзера и возвращать его.
    //Eсли юзер уже есть в массиве, результат - null. Если размер массива не позволяет добавить больше элементов (все ячейки заняты) результат метода тоже null

    public User save(User user) {
        int i = 0;
        for (User user1 : users) {
            if (findById(user.getId()) != null)//Можно пройтись по массиву и если нет null, нет места для новой записи, тогда выполнить условие вернуть null(проблема только в том, что null может быть на любом индексе и это работает для последовательного заполнения массива без удаления записей)
                return null;
            if (user1 == null) {
                users[i] = user;
                return users[i];
            }
            i++;
        }
        return null;
    }

    //Используйте метод с предыдущих задач для нахождение юзера по id. Только переменуйте его в findById(long id)
    private User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }

    //  ------------------------------------ UserRepository 4-----------------------------------------------------------
    public User update(User user) { // будет обновлять текущего юзера в массиве(перезаписывать) и возвращать его. Если юзера нет результат null
        int i = 0;
        for (User user1 : users) {
            if (user1 != null && user1.getId() == user.getId()) {
                users[i] = user;
                return users[i];
            }
            i++;
        }
        return null;
    }

    public void delete(long id) { // удаляет юзера с массива. Используйте метод findById(long id) с предыдущих задач для нахождение юзера по id.
        User user = findById(id);
        if (user == null)
            return;
        int i = 0;
        for (User user1 : users) {
            if (user1 != null && id == user1.getId()) {
                users[i] = null;
                break;
            }
            i++;
        }

    }


}




