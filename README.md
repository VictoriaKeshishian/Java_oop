# Oбъектно-ориентированное программирование (семинары) #
##
## Game ## 
##
## Задание 1 ##
*Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. Для каждого сформировать список свойств и возможных действий. Напрнимер свойство скорость, действие нанести удар. Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. В основной программе создать по одному экземпляру каждого типа персонажей.*
***
## Задание 2 ##
*Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); Реализовать интерфейсs в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа. Создать два списка в классе main. В кждый из списков добавить по десять экземнляров наследников BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть. В main пройти по спискам и вызвать у всех персонажей getInfo.*
***
## Задание 3 ##
*В материалы добавил xml с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. Создать в основной программе два списка. Положить в них по 10 случайных персонажей. В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах. Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.*
*Начать реализацию метода step у лучников.
1. Если жизнь равна нулю или стрел нет, завершить оьработку.
2. Поиск среди противников наиболее приближённого.
3. Нанести среднее повреждение найденному противнику.
4. Найти среди своих крестьянина.
5. Если найден завершить метод иначе уменьшить запас стрел на одну.
***
## Задание 4 ##
*Создать класс с описанием координат, x и y.
Добавить в абстрактный класс порле с координатами и пробросить его инициализацию до конструкторов персонажей. Farmer farmer = new Farmer(getName(), x, y);
Реализовать метод step() лучников. 3.1 Если жизнь равна нулю или стрел нет, завершить оьработку. 3.2 Поиск среди противников наиболее приближённого. 3.3 Нанести среднее повреждение найденному противнику. 3.4 Найти среди своих крестьянина. 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.*
***
## Задание 5 ##
*Реализовать псевдо графику используя приложенные в документах занятия файлы. Распределить функционал основной программы по методам в соответствии с SOLID. Используя класс сканер реализовать повторение хода в основной программе.*
***
## Задание 6 ##
*Реализовать степ для пехоты по семинару.*
***
## InfantryClass ##
* **InfantryClass** (абстрактный Класс Пехота, наследует BaseHero)

* Свойства: 
    - все свойства наследует от BaseHero

* **Outlaw** (Класс Разбойник, наследует InfantryClass)

* **Spearman** (Класс Копейщик, наследует InfantryClass)
***
## MagClass ##
* **MagClass** (абстрактный Класс Магов, наследует BaseHero)
* Свойства: 
    - *мана*
    - *интеллект*
    - *скорость*
* **Magician** (Класс Колдун, наследует MagClass)
* **Monk** (Класс Монах, наследует MagClass)
***
## ShooterClass ##
* **ShooterClass** (абстрактный Класс Стрелков, наследует BaseHero)
* Свойства: 
    - *Максимальный урон*
    - *Стрелы*
* **Crossbowman** (Класс Арбалетчик, наследует ShooterClass)
* **Snipper** (Класс Снайпер, наследует ShooterClass)
***
## BaseHero ##
(базовый персонаж)
* Свойства: 
    - *hp*
    - *maxHp*
    - *скорость*
    - *урон*
    - *защита*
* Действия
    - *атака*
    - *перемещение*

***

## ClassPeasant ## 
(Класс Крестьянин, наследует BaseHero)
* Свойства: 
    - *энергия*
***

