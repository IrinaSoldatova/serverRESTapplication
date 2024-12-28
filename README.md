# Серверное REST приложение

Для теcтирования проекта использовать программу PostMan:

* Добавление пользователя - запрос : метод - POST

адрес - http://localhost:8080/users/body

тело - { "name":"Ivan", "age":33, "email":"ivan.1991@yandex.ru" }

* Получение списка пользователей на сервере - запрос: метод - GET

адрес - http://localhost:8080/users

* Проверка сортировки - запрос: метод - GET

адрес - http://localhost:8080/tasks/sort

* Проверка фильтрации - запрос: метод - GET

адрес - http://localhost:8080/tasks/filter/23

* Проверка среднего арифметического - запрос: метод - GET

адрес - http://localhost:8080/tasks/calc