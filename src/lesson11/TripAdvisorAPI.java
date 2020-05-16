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
        int i = 0;
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && room.getPersons() >= persons - 1 &&
                    room.getPersons() <= persons + 1 && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                i++;
            }
        }
        int x = 0;
        Room[] res = new Room[i];
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && room.getPersons() >= persons - 1 &&
                    room.getPersons() <= persons + 1 && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
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
        Room[] res = new Room[i];
        int x = 0;
        for (Room room : rooms) {
            if (room != null) {
                res[x] = room;
                x++;
            }
        }
        return res;
    }
}
