package lesson11;
/*Интерфейс API который содержит поведение:
Room[] findRooms(int price, int persons, String city, String hotel)
Room[] getAll()
Создайте три реализации API интерфейса с названиями: BookingComAPI, TripAdvisorAPI, GoogleAPI

В задании используется новый для вас термин - API (Application Programming Interface).
Это понятие относится не только к джаве и не только к этому курсу, это тип приложения которое массово используется в построении современных ИТ
систем и может быть написано на любом языке.
Советую ознакомиться более детально что это с источников в интернете, так как знание подобных терминов весьма пригодится в дальнейшем обучении*/
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();



}
