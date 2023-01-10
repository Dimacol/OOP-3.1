package entities;
import java.util.Objects;

/**
 * Класс горячий напиток
 */
public abstract class HotDrink implements ComparableHotDrink {

    private static String name;
    private int volume;

    /**
     * Конструктор с инициализацией
     *
     * @param name   - наименование
     * @param volume - объем напитка
     */
    public HotDrink(String name, int volume) {
        HotDrink.name = name;
        this.volume = volume;
    }

    /**
     * Продажа напиитка
     *
     * @param volume - требуемый объем к реализации
     * @return - true, если напиток продан, иначе - false
     */
    public boolean saleDrink(int volume) {
        if (this.volume >= volume) {
            this.volume -= volume;
            return true;
        }

        return false;
    }

    /// Геттеры, сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        HotDrink.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Переопределение методов toString, equals, hash
    @Override
    public String toString() {
        return "Напиток " + "'" + name + '\'' + ", объем: " + volume;
    }
    
    
    @Override
    public int compareTo(ComparableHotDrink o) {
        return this.getAttractiveness().compareTo(o.getAttractiveness());
    }

    /**
     * Сравнение напитков, ключевым для напитка является наименование, если имена совпадают -
     * напитки равны
     *
     * @param o - объект для сравнения
     * @return - результат сравнения объектов*/
     
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HotDrink hotDrink = (HotDrink) o;
        return name.equals(HotDrink.name);
    }
  
    /**
     * переопределение расчета hashCode, используем для расчета name, т.к. наименование напитк -
     * используем как ключ
     *
     * @return - результат вычисления хеша
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
