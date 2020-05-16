package lesson11;
// Каждая реализация содержит поле Room[] rooms, которое должно инициализироваться в конструкторе.
// А так же реализацию методов интерфейса, со следующей логикой:
//GoogleAPI ищет сторого по заданным параметрам

public class GoogleAPI implements API {
    Room[] rooms;
    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && room.getPersons() == persons &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                i++;
            }
        }
        int x = 0;
        Room[] res = new Room[i];
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && room.getPersons() == persons &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                res[x] = room;
                x++;
            }
        }
        return res;
    }
    @Override
    public Room[] getAll() {
        int i = 0;
        for (Room room : rooms) {
            if (room != null)
                i++;
        }
        Room[] rooms1 = new Room[i];
        int x = 0;
        for (Room room : rooms) {
            if (room != null) {
                rooms1[x] = room;
                x++;
            }
        }
        return rooms1;
    }
}
