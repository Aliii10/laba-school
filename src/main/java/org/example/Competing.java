package org.example;

/**
 * Класс описывающий соревнующегося спортсмена
 */
public class Competing extends Person {

    private int time;

    public Competing(String name) {
        super(name); // TODO: Изучить и написать мне зачем это нужно и что делает
        //Здесь же ситуация обратна классу Team. Спортсмен обязательно имеет имя, но может иметь нулевое время, т.к.
        // соревнование ещё не прошло.
        // Чтобы не путаться применим Наследование от класса Person, который описывает человека.
        // Соответственно в классе соревнующегося нам необходимо только указать информацию, относящуюся непосредственно
        // к спортсмену на соревновании. Например, время
    }

    /**
     * Получить зачётное время спортсмена
     *
     * @return время в секундах
     */
    public int getTime() {
        return time;
    }

    /**
     * Установить зачётное время спортсмена
     *
     * @param time время в секундах
     */
    public void setTime(int time) {
        this.time = time;
    }
}

