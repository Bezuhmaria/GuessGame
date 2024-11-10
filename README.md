# Опис
    Комп’ютер загадує число від 1 до 100, а гравець намагається його відгадати.
    Після кожної спроби комп’ютер повідомляє, чи число більше або менше загаданого.

# Вимоги до гри
    1. Генерувати випадкове число, в заданому диапазоні
    2. Зчитувати інформацію з консолі
    3. З'ясовувати чи є введене коректним значенням, та, якщо є переходити до наступного кроку
    4. З'ясовувати чи введене число більшим чи меншими
    5.1 Виводити інформацію про число, повертатися до 2 (якщо не відгадано)
    4.2 Завершувати гру (у разі, якщо число відгадане)
# Додаткові вимоги:
    1. Обробляти некоректні значення (числа не з диапазону чи нечислові значення)
    2. Мати можливість вийти з гри в будь-який момент

Проєкт має чотири класи, кожен з яких відповідає за певну частину гри.

    Game — головний клас, що запускає гру та керує взаємодією інших.
    NumberGenerator — клас для генерації випадкового числа в заданому діапазоні.
    UserInput — клас для обробки введенного користувачем.
    NumberChecker — клас для перевірки правильності введеного числа
