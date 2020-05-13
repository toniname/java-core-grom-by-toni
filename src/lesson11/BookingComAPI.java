package lesson11;

import lesson9.l2.User;

//Каждая реализация содержит поле Room[] rooms, которое должно инициализироваться в конструкторе. А так же реализацию методов интерфейса, со следующей логикой:
//BookingComAPI находит комнаты по заданным параметрам, а так же комнаты, которые по цене отличаются на 100 единиц в обе стороны.
// Например если пользователь ищет комнату с ценой 50 и другими параметрами,
//------------------------------------------------------------------------------
// BookingComAPI вернет все комнаты с ценой в диапазоне 0 - 150
//------------------------------------------------------------------------------
public class BookingComAPI implements API {
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    //сначала продишь циклом и считаешь сколько комнат найдет
    //потом создаешь массив нужно длины. и потом еще один цикл - заполнить этот массив комнатами
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int maxPrice = price + 100;
        int minPrice = price - 100;
        int x = 0;
        Room[] rooms2 = new Room[countRooms(price, persons, city, hotel)];
        for (Room room : rooms) {
            if (room != null && (room.getPrice() <= maxPrice && room.getPrice() >= minPrice) && room.getPersons() == persons &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                rooms2[x] = room;
            }

        }
        return rooms2;

    }

    // ---------------------------------------------------------------------------------------------------------------------
    public int countRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        int maxPrice = price + 100;
        int minPrice = price - 100;
        for (Room room : rooms) {
            if (room != null && (room.getPrice() <= maxPrice && room.getPrice() >= minPrice) &&
                    room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel))
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