public class Set {

    private int size = 0;
    private Object[] elements = new Object[10];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object object) {
        elements[size] = object;
        size++;
    }

    public boolean contains(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public void remove(Object object) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(object)) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
            }
        }
    }

    public int size() {
        return size;
    }
}

