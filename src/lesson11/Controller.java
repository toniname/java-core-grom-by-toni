package lesson11;

import lesson11.biginterfaceexample.File;

/*Controller - класс, который содержит поле API[] apis, инициализируется в конструкторе, и три общедоступных метода:
Room[] requestRooms(int price, int persons, String city, String hotel)
Который находит комнаты по заданным параметрам по всем АПИ
Room[] check(API api1, API api2)
Который находит общие комнаты у двух API (в результирующий массив добавлять комнаты с api1). Комнаты будем считать равными,
 если у них одинаковые все поля кроме id и dateAvailableFrom. Гарантируется что id комнаты уникальный
во всей системе
Room cheapestRoom()
Находит самую дешевую комнаты среди всех комнат доступных в АПИ*/
public class Controller {
    API[] apis;


    public Controller(API[] apis) {
        this.apis = apis;
    }
    public Room[] requestRooms(int price, int persons, String city, String hotel) {
            int i = 0;
        API[] api = new API[i];
        Room[] rooms = new Room[api.length];
        for (API apis : api) {
            for (Room room : rooms) {
                if (room != null && room.getPrice() == price && room.getPrice() == price &&
                        room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel))
                   return rooms;
            }
           return rooms;

        }
        return rooms;
    }


    public Room[] check(API api1, API api2){
        int i = 0;
        API[] apis1 = new API[i];

        return null;
    }
    public Room cheapestRoom() {
      //  Room cheapest =  [0];
      return null;
    }

}
