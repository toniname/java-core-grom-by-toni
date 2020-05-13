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
        int x = 0;
        Room[] rooms3 = new Room[countRooms(price, persons, city, hotel)];
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && room.getPersons() == persons &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel)){
                rooms3[x] = room;
            }

        }
        return rooms3;

    }
    public int countRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && room.getPersons() == persons &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel))
                i++;
        }
        return i;
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
            if (room != null){
                rooms1[x] = room;
            }

        }
        return rooms1;
    }
}
