package services;


import java.util.Comparator;
import java.util.List;

public class CalculationService {
    public static <T extends Comparator<? super T>> T max(List<T> list) throws IllegalAccessException {
        if (list.isEmpty()){
            throw new IllegalAccessException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list){
            if (item.compareTo(max) > 0) {
                max = item; //contem o maior elemento da lista, de forma interativa
            }
        }
        return max;
    }

}
