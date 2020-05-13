package lesson11;
//TripAdvisorAPI находит комнаты по заданным параметрам, а так же, количество гостей ищется в диапазоне +-1.
// Например если пользователь ищет комнату с ко-вом гостей 3 и другими параметрами, TripAdvisorAPI вернет все комнаты с
//ко-вом гостей от 2 до четырех
public class TripAdvisorAPI implements API {
    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int maxPersons = persons + 1;
        int minPersons = persons - 1;
        Room[] rooms = new Room[countRooms(price, persons, city, hotel)];
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && (room.getPersons() == persons && room.getPersons() == maxPersons &&
        room.getPersons() == minPersons) && room.getCityName().equals(city) && room.getHotelName().equals(hotel))
                return rooms;
        }
        return rooms;
    }

    // ---------------------------------------------------------------------------------------------------------------------
    public int countRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        int maxPersons = persons + 1;
        int minPersons = persons - 1;
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && (room.getPersons() == persons && room.getPersons() == maxPersons &&
                    room.getPersons() == minPersons) && room.getCityName().equals(city) && room.getHotelName().equals(hotel))
                i++;
        }
        return i;
    }

    //------------------------------------------------------------------------------------------------------------------------


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
            }

        }
        return rooms1;
    }
}
