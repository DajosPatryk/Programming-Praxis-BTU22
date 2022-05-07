import java.util.ArrayList;
import java.util.List;
public class ListStack implements Stack {
    private List<Object> list = new ArrayList<Object>(0);
    @Override
    public void push(Object obj) {
        list.add(obj);
    }

    @Override
    public Object peek() {
        return list.get(0);
    }

    @Override
    public Object pop() {
        Object temp = list.get(0);
        list.remove(0);
        return temp;
    }

    @Override
    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }
    
}
