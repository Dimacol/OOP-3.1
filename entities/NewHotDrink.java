package entities;
import java.util.Objects;

public class NewHotDrink extends HotDrink {
    private int temperature;
    public Object getName;

    /**
     * Конструктор с инициализацией
     *
     * @param name          - наименование
     * @param volume        - объем напитка
     * @param temperature   - температура
     */
    public NewHotDrink(String name, int volume,  int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    // Геттеры, сеттеры
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Переопределение методов toString, equals, hash
    @Override
    public String toString() {
        return super.toString() + ", температура: " + temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NewHotDrink that = (NewHotDrink) o;
        return temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }
    // Сравнение напитков по температуре
    @Override
    public Double getAttractiveness() {
        return Double.valueOf(temperature);
        
    }

    public static void ComparableHotDrink(NewHotDrink newHotDrink1, NewHotDrink newHotDrink2) {
        if (newHotDrink1.compareTo(newHotDrink2) == 1) {
            System.out.println(newHotDrink1.getName() + " горячее чем " + newHotDrink2.getName());}
        if (newHotDrink1.compareTo(newHotDrink2) == 0) {
            System.out.println(newHotDrink1.getName() + " температура равна " + newHotDrink2.getName());}
        if (newHotDrink1.compareTo(newHotDrink2) == -1) {
            System.out.println(newHotDrink1.getName() + " холоднее чем " + newHotDrink2.getName());}    
 

        }
         
}



