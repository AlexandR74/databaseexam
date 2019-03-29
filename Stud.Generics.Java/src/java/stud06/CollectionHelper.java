package java.stud06;

import java.util.List;
/* вариант был изначально такой
public class CollectionHelper <T>{
    public int findIndex(final List<T> list, final T target){
        for (int i=0; i<list.size(); i++){
            final T element = list.get(i);
            if (element.equals(target)){
                return i;
            }
        }
        return -1;
    }

}
*/

public class CollectionHelper {
    public <T> int findIndex(final List<T> list, final T target){
        for (int i=0; i<list.size(); i++){
            final T element = list.get(i);
            if (element.equals(target)){
                return i;
            }
        }
        return -1;
    }

}
